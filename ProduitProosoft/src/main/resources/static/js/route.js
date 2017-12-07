var app = angular.module("gestionCommerciale",['ngRoute']);
app.config(function($routeProvider, $locationProvider) {
    $locationProvider.html5Mode({
        enabled: true,
        requireBase: false
    });
    $routeProvider
        .when("/login", {
           templateUrl : "login.html",
            controller:"loginController"
       })
        .when("/home", {
            templateUrl : "dashboard.html",
            controller:"dashboardController"
        })
        .otherwise({redirectTo:'/login'});

});