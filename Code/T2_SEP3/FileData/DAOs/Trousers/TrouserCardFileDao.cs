using Application.DaoInterfaces;
using Shared.DTOs;
using Shared.DTOs.Trousers;
using Shared.Models;

namespace FileData.DAOs.Trousers;

/// <summary>
/// Trouser data storage
/// </summary>
public class TrouserCardFileDao : ITrouserCardDao
{
    private readonly FileContext context;

    public TrouserCardFileDao(FileContext context)
    {
        this.context = context;
    }

    /// <summary>
    /// Create and save a new trouser card in the data file
    /// </summary>
    /// <param name="productCard">Trouser card to add</param>
    /// <returns>The added trouser card</returns>
    public Task<TrouserCard> CreateAsync(TrouserCard productCard)
    {
        int Id = 0;
        if (!context.SocksCards.Any() && !context.TrouserCards.Any())
        {
            Id = 1;
        }
        
        if (context.TrouserCards.Any() || context.SocksCards.Any())
        {
            int trouserId = context.TrouserCards.Max(u => u.Id);
            int socksId = context.SocksCards.Max(u => u.Id);
            if (trouserId > socksId)
            {
                Id = trouserId + 1;
            }
            else
            {
                Id = socksId + 1;
            }
        }

        productCard.Id = Id;

        context.TrouserCards.Add(productCard);
        context.SaveChanges();

        return Task.FromResult(productCard);
    }

    /// <summary>
    /// Get all trouser card in the data file
    /// </summary>
    /// <returns>Trousers in the data file</returns>
    public Task<IEnumerable<TrouserCard>> GetAsync()
    {
        IEnumerable<TrouserCard> result = context.TrouserCards.AsEnumerable();
        return Task.FromResult(result);
    }
    
    public Task<IEnumerable<ProductCardBasicDto>> GetTitlesAsync(string title)
    {
        throw new NotImplementedException();
    }

    /// <summary>
    /// Get trouser card with an specific title
    /// </summary>
    /// <returns>The trouser card with the same title</returns>
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

    /// <summary>
    /// Get trouser card by id
    /// </summary>
    /// <param name="id">Id of the trouserCard</param>
    /// <returns>The trouser card with the same id</returns>
    /// <exception cref="Exception">If the trouser card does not exist</exception>
    public Task<TrouserCard?> GetById(int id)
    {
        TrouserCard? existing = context.TrouserCards.FirstOrDefault(productCard => productCard.Id == id);

        if (existing == null)
        {
            throw new Exception($"TrouserCard with id {id} does not exist!");
        }

        return Task.FromResult(existing);
    }

    /// <summary>
    /// Update a trouser card
    /// </summary>
    /// <param name="dto">The updated trouser card</param>
    /// <returns>The new trouser card</returns>
    /// <exception cref="Exception">If the trouser does not exist</exception>
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
    
    /// <summary>
    /// Delete a trouser card by Id
    /// </summary>
    /// <param name="id">Id of the trouser card to delete</param>
    /// <returns>The deleted trouser card</returns>
    /// <exception cref="Exception">If the trouser card does not exist</exception>
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

    /// <summary>
    /// Get all titles
    /// </summary>
    /// <param name="title">Title of the trouser card</param>
    /// <returns>The title of all the trouser cards</returns>
    public Task<TrouserCard?> GetByTitlesAsync(string title)
    {
        TrouserCard? existing = context.TrouserCards.FirstOrDefault(s => s.Title.Equals(title));
        return Task.FromResult(existing);
    }
}