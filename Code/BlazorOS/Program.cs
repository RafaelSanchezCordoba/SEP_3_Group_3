using Microsoft.AspNetCore.Components.Web;
using Microsoft.AspNetCore.Components.WebAssembly.Hosting;
using BlazorOS;
using HttpClients.ClientInterfaces;
using HttpClients.Implementations;
using Smart.Blazor;

var builder = WebAssemblyHostBuilder.CreateDefault(args);
builder.RootComponents.Add<App>("#app");
builder.RootComponents.Add<HeadOutlet>("head::after");
builder.Services.AddScoped<ISockService, SockHttpClient>();

builder.Services.AddScoped(sp => new HttpClient { BaseAddress = new Uri("https://localhost:7999") });
builder.Services.AddSmart();  


await builder.Build().RunAsync();