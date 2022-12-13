using Microsoft.AspNetCore.Components.Web;
using Microsoft.AspNetCore.Components.WebAssembly.Hosting;
using BlazorOS;
using BlazorOS.Auth;
using HttpClients.ClientInterfaces;
using HttpClients.ClientInterfaces.Trouser;
using HttpClients.Implementations;
using HttpClients.Implementations.Trouser;
using Microsoft.AspNetCore.Components.Authorization;
using Shared.Auth;
using Smart.Blazor;

var builder = WebAssemblyHostBuilder.CreateDefault(args);
builder.RootComponents.Add<App>("#app");
builder.RootComponents.Add<HeadOutlet>("head::after");
builder.Services.AddScoped<InterfaceInventoryService, InventoryHttpClient>();
builder.Services.AddScoped<ISockCardService, SockCardHttpClient>();

builder.Services.AddScoped<IUserService,JwtUserService>();
builder.Services.AddScoped<AuthenticationStateProvider, CustomAuthProvider>();

builder.Services.AddScoped<InterfaceInventoryService, InventoryHttpClient>();
builder.Services.AddScoped<ISocksService, SocksHttpClient>();
builder.Services.AddScoped<IShoppingCartService, ShoppingCartHttpClient>();
builder.Services.AddScoped<ICartItemService, CartItemHttpClient>();
builder.Services.AddScoped<IOrderService, OrderHttpClient>();
builder.Services.AddScoped<IAdressService, AdressHttpClient>();
builder.Services.AddScoped<ITrouserCardService, TrouserCardHttpClient>();
builder.Services.AddScoped<ITrouserService, TrouserHttpClient>();



builder.Services.AddSmart();
builder.Services.AddScoped(sp => new HttpClient { BaseAddress = new Uri("https://localhost:7999") });

AuthorizationPolicies.AddPolicies(builder.Services);

await builder.Build().RunAsync();