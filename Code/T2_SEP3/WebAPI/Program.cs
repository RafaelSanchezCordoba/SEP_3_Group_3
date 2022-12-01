using Application.DaoInterfaces;
using Application.Logic;
using Application.LogicInterfaces;
using FileData;
using FileData.DAOs;
using GrpcDataAccess.DAOs;
using Shared.DTOs;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.

builder.Services.AddControllers();
// Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();

builder.Services.AddScoped<FileContext>();
builder.Services.AddScoped<ISockCardDao, SockCardsGrpcDao>();
builder.Services.AddScoped<ISockCardLogic, SockCardLogic>();
builder.Services.AddScoped<ISocksInventoryDao, SocksInventoryFileDao>();
builder.Services.AddScoped<ISocksInventoryLogic, SocksInventoryLogic>();




var app = builder.Build();

// Configure the HTTP request pipeline.
if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}

app.UseHttpsRedirection();

app.UseAuthorization();

app.MapControllers();

app.UseCors(x => x
    .AllowAnyMethod()
    .AllowAnyHeader()
    .SetIsOriginAllowed(origin => true)
    .AllowCredentials());


app.Run();