using Microsoft.Extensions.DependencyInjection;

namespace Shared.Auth;

public class AuthorizationPolicies
{
    public static void AddPolicies(IServiceCollection services)
    {
        services.AddAuthorizationCore(options =>
        {
            options.AddPolicy("MustBeRegisterdCustomer", a =>
                a.RequireAuthenticatedUser().RequireClaim("Auth", "Customer"));
            
            options.AddPolicy("MustBeManager", a =>
                a.RequireAuthenticatedUser().RequireClaim("Auth", "Manager"));
        });
    }
}