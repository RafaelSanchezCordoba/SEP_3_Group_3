using Application.DaoInterfaces;
using Shared.DTOs;
using Shared.DTOs.Trousers;
using Shared.Models;

namespace FileData.DAOs.Trousers;

public class TrouserCardFileDao : ITrouserCardDao
{
    private readonly FileContext context;

    public TrouserCardFileDao(FileContext context)
    {
        this.context = context;
    }

    public Task<TrouserCard> CreateAsync(TrouserCard productCard)
    {
        int Id = 1;
        if (context.SocksCards.Any())
        {
            Id = context.SocksCards.Max(u => u.Id);
            Id++;
        }

        productCard.Id = Id;

        context.TrouserCards.Add(productCard);
        context.SaveChanges();

        return Task.FromResult(productCard);
    }

    public Task<IEnumerable<TrouserCard>> GetAsync()
    {
        IEnumerable<TrouserCard> result = context.TrouserCards.AsEnumerable();
        return Task.FromResult(result);
    }

    public Task<IEnumerable<ProductCardBasicDto>> GetTitlesAsync(string title)
    {
        throw new NotImplementedException();
    }

    public async Task<IEnumerable<ProductCardBasicDto>> GetTitlesAsync()
    {
        List<TrouserCard> result = context.TrouserCards.AsEnumerable().ToList();
        List<ProductCardBasicDto> resultTitle = new List<ProductCardBasicDto>();
        for (int i = 0; i < result.Count; i++)
        {
            resultTitle.Add(new ProductCardBasicDto(result[i].Title));
        }

        return resultTitle.AsEnumerable();
    }

    public Task<TrouserCard?> GetById(int id)
    {
        TrouserCard? existing = context.TrouserCards.FirstOrDefault(productCard => productCard.Id == id);

        if (existing == null)
        {
            throw new Exception($"TrouserCard with id {id} does not exist!");
        }

        return Task.FromResult(existing);
    }


    public Task UpdateAsync(UpdateTrouserCardDto dto)
    {
        TrouserCard? existing = context.TrouserCards.FirstOrDefault(card => card.Id == dto.Id);
        if (existing == null)
        {
            throw new Exception($"Trouser with ID {dto.Id} does not exist!!!");
        }

        TrouserCard card = new TrouserCard()
        {
            Title = dto.Title,
            Brand = dto.Brand,
            Description = dto.Description,
            Id = existing.Id,
            Image = dto.Image,
            Material = dto.Material,
            Price = dto.Price,
            Type = dto.Type
        };
        context.TrouserCards.Remove(existing);
        context.TrouserCards.Add(card);
        context.SaveChanges();
        return Task.CompletedTask;
    }



    public Task DeleteAsync(int id)
    {
        TrouserCard? existing = context.TrouserCards.FirstOrDefault(card => card.Id == id);
        if (existing == null)
        {
            throw new Exception($"Socks with ID {id} does not exist!!!");
        }

        context.TrouserCards.Remove(existing);
        Trouser? deleteSocks = context.Trousers.FirstOrDefault(socks => socks.ProductCardId == id);
        if (deleteSocks != null) context.Trousers.Remove(deleteSocks);
        CartItem? deleteCardItem = context.CardItems.FirstOrDefault(cardItem => cardItem.ProductId == id);
        if (deleteCardItem != null) context.CardItems.Remove(deleteCardItem);
        Inventory? deleteInventory = context.Inventories.FirstOrDefault(inventory => inventory.CardId == id);
        if (deleteInventory != null) context.Inventories.Remove(deleteInventory);
        context.SaveChanges();

        return Task.CompletedTask;
    }

    public Task<TrouserCard?> GetByTitlesAsync(string title)
    {
        TrouserCard? existing = context.TrouserCards.FirstOrDefault(s => s.Title.Equals(title));
        return Task.FromResult(existing);
    }
}