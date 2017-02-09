/**
 * 
 */
app.service('Accountservice',function($http, $q){
return {
	getAccountData: function(){
		debugger;
		return $http.get('get_AccountData').then(function(response){
			debugger;
			if(typeof response.data=='object'){
				return response.data;
			}else{
				return $q.reject(response.data);
			}
			
			}, function(response){
				return $q.reject(response.data);
			})
		}
}
});