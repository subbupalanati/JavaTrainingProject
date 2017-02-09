/**
 * 
 */
app.config(function ($routeProvider){
	$routeProvider
	.when('/account', {
		templateUrl : 'resources/pages/account.html',
		controller : 'AccountController'
	})
	.when('/Transfers', {
		templateUrl : 'resources/pages/Transfers.html',
		controller : 'transferController'
	})
	.when('/AddRecipient', {
		templateUrl : 'resources/pages/addRecipients.html',
		controller : 'addRecipientController'
	})
	.otherwise({
		templateUrl : 'resources/pages/home.html',
		controller : 'defaultController'
	})
});

app.controller('AccountController', function($scope,Accountservice){
	HeaderService.getAccountData().then(function(data){
		var j=data;
		$scope.data=JSON.parse(j.data);
		$scope.user=JSON.parse($scope.data.accountdata);
	})
	$scope.message ='This is Accounts Page';
});

app.controller('transferController', function($scope){
	$scope.message ='This is about Page';
});

app.controller('addRecipientController', function($scope){
	$scope.message ='This is contact Page';
});
app.controller('defaultController', function($scope){
	$scope.message ='This is Home Page';
});
	