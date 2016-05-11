/**
 * 
 */
var app = angular.module("flight", []);

app.controller('searchController', function newSearchController($scope, $http) {
	$scope.flightNumber = '';
	$scope.date='';

	$scope.search = function() {
		$http({

			method : 'GET',
			url : '/SchedulePredict/predict',
			data : $scope.flightNumber,

		}).success(function(data, status, headers, config) {
			$scope.createStatus = 'success';
		}).error(function(data, status, headers, config) {
			$scope.createStatus = 'failure';
		});

		if ($scope.createStatus = 'success') {
			$scope.errorClass = '';
		} else {
			$scope.errorClass = '';
		}
	};

});