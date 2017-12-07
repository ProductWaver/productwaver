/**
 * Created by amino on 24/11/2017
 */
app.controller("loginController",function ($scope,$http,$location,$rootScope,$httpParamSerializerJQLike) {
    $scope.loginParams = true;
    $scope.credentials= {};
    $scope.errorMessageLogin = null;

    $scope.authentifier = function () {
        console.log($scope.credentials);
        $http({
            url: '/login',
            method: 'POST',
            data: $httpParamSerializerJQLike($scope.credentials),
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            }
        })
            .then(function(res) {
                $rootScope.authenticated = true;
                $http.defaults.headers.common.Authorization = 'Bearer '+res.data.token;
                $rootScope.$broadcast('LoginSuccessful');
                console.log(res.data);
                $location.path("/home");
            })
            .catch(function(res) {
                console.log(res.data);
                $rootScope.authenticated = false;
                $scope.errorMessageLogin = "Login ou mot de passe incorrect";
            });
    };
});
