angular.module('starter.controllers', [])


  .controller('LoginCtrl', function($scope, LoginService, $ionicPopup, $state) {
    $scope.data = {};

    $scope.login = function() {
      LoginService.loginUser($scope.data.username, $scope.data.password).success(function(data) {
        $state.go('hh');
      }).error(function(data) {
        var alertPopup = $ionicPopup.alert({
          title: 'Login failed!',
          template: 'Please check your credentials!'
        });
      });
    }
  })


  .controller('myCtrl', function($scope, $cordovaGeolocation){

    $scope.toggle = function(){

      var posOption = {timeout: 10000,enableHighAccuracy: true};
      $cordovaGeolocation
        .getCurrentPosition(posOption)
        .then(function (position)  {

            $scope.lat = position.coords.latitude;
            $scope.long = position.coords.longitude;
            $scope.diss = mark;

          }, function(err){
            //error
          }

        );

    }



  })

;
