using Application.DaoInterfaces;
using Shared.DTOs;
using Shared.Models;

namespace FileData.DAOs;

public class OrderFileDao:IOrderDao
{
    private readonly FileContext context;

    public OrderFileDao(FileContext context)
    {
        this.context = context;
    }

    public Task<Order> CreateAsync(Order order)
    {
        int Id = 1;
        if (context.Orders.Any())
        {
            Id = context.Orders.Max(u => u.Id);
            Id++;
        }

        order.Id= Id;
        
        context.Orders.Add(order);
        context.SaveChanges();

        return Task.FromResult(order);
    }
}