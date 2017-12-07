/**
 * Created by amino on 10/10/2017
 */
app.controller("mainController",function ($scope,$http,$location) {

    $scope.user = null;
    $scope.notif = [];

    $scope.logout = function () {
        $scope.credentials = null;
        $location.url("/login");
    };
    $scope.$on('LoginSuccessful', function () {

    });
});
