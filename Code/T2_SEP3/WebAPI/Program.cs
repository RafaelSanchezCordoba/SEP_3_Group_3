using System.Text;
using Application.DaoInterfaces;
using Application.Logic;
using Application.LogicInterfaces;
using FileData;
using FileData.DAOs;

using GrpcDataAccess.DAOs;
using Microsoft.AspNetCore.Authentication.JwtBearer;
using Microsoft.IdentityModel.Tokens;
using Shared.Auth;

using Microsoft.AspNetCore.WebSockets;

using Shared.DTOs;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.

builder.Services.AddControllers();
// Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();

builder.Services.AddScoped<FileContext>();


builder.Services.AddScoped<ISockCardDao, SockCardsFileDao>();

builder.Services.AddScoped<ISockCardDao,SockCardsFileDao >();

builder.Services.AddScoped<ISockCardLogic, SockCardLogic>();
builder.Services.AddScoped<IShoppingCartLogic, ShoppingCartLogic>();
builder.Services.AddScoped<IShoppingCartDao, ShoppingCartFileDao>();
builder.Services.AddScoped<InterfaceInventoryDao, InventoryFileDao>();
builder.Services.AddScoped<InterfaceInventoryLogic, InventoryLogic>();
builder.Services.AddScoped<IUserLogic,UserLogic>();
builder.Services.AddScoped<IUserDao,UserDaoFile>();
builder.Services.AddScoped<IOrderDao, OrderFileDao>();
builder.Services.AddScoped<IOrderLogic, OrderLogic>();

builder.Services.AddAuthentication(JwtBearerDefaults.AuthenticationScheme).AddJwtBearer(options =>
{
    options.RequireHttpsMetadata = false;
    options.SaveToken = true;
    options.TokenValidationParameters = new TokenValidationParameters()
    {
        ValidateIssuer = true,
        ValidateAudience = true,
        ValidAudience = builder.Configuration["Jwt:Audience"],
        ValidIssuer = builder.Configuration["Jwt:Issuer"],
        IssuerSigningKey = new SymmetricSecurityKey(Encoding.UTF8.GetBytes(builder.Configuration["Jwt:Key"]))
    };
});

AuthorizationPolicies.AddPolicies(builder.Services);


builder.Services.AddScoped<ISocksLogic, SocksLogic>();
builder.Services.AddScoped<ISocksDao, SocksFileDao>();
builder.Services.AddScoped<IAddressDao, AddressFileDao>();
builder.Services.AddScoped<ICartItemDao, CartItemFileDao>();
builder.Services.AddScoped<ICartItemLogic, CartItemLogic>();
builder.Services.AddScoped<IAddressLogic, AddressLogic>();



var app = builder.Build();

// Configure the HTTP request pipeline.
if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}

app.UseHttpsRedirection();

app.UseAuthorization();
app.UseAuthentication();

app.MapControllers();

app.UseCors(x => x
    .AllowAnyMethod()
    .AllowAnyHeader()
    .SetIsOriginAllowed(origin => true)
    .AllowCredentials());


app.Run();