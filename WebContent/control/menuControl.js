var app = angular.module('menuModule',[]);

app.controller('menuController',function($scope,$http){
	
	var url = 'http://localhost:8080/Seguranca/rs/sistema';
	
//	$scope.sistemas = [{"url":"http://localhost:8080/SistemaEcommerce","nome":"Sistema Ecommerce"},
//	                   {"url":"http://localhost:8080/Seguranca","nome":"Seguranca"}];

	$scope.pesquisar = function(){
		$http.get(url).success(function (sistemasRetorno) {
			$scope.sistemas = sistemasRetorno;
		}).error(function(mensagemErro) {
			alert(mensagemErro);
		});   
	}
	
	$scope.pesquisar();
		
});