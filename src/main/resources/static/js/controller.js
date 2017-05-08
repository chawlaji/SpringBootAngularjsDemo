var app = angular.module('app', []);
app.controller('postcontroller', function($scope, $http, $location) {
	$scope.submitForm = function(){
		var url = $location.absUrl() + "topic";
		
		var config = {
                headers : {
                    'Content-Type': 'application/json;charset=utf-8;'
                }
        }
		var data = {
				 id: $scope.id,
		         name: $scope.name,
		         weightage: $scope.weightage
        };
		
		
		$http.post(url, data, config).then(function (response) {
			$scope.postResultMessage = "Sucessful!";
		}, function (response) {
			$scope.postResultMessage = "Fail!";
		});
		
		 $scope.id = "";
         $scope.name = "";
         $scope.weightage = "";
	}
});

app.controller('getcontroller', function($scope, $http, $location) {
	$scope.getfunction = function(){
		var url = $location.absUrl() + "topics";
		
		var config = {
                headers : {
                    'Content-Type': 'application/json;charset=utf-8;'
                }
        }
		
		$http.get(url, config).then(function (response) {
			$scope.response = response.data
		}, function (response) {
			$scope.getResultMessage = "Fail!";
		});
	}
});