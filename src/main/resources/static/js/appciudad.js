clienteRest=(function(){

	return {
		getCiudadByName:function(name,callback){
			$.getJSON( "/exams/"+name, function( data ) {				
				callback(data);				
			});
		}
	}
})();