var ControllerModule=(function(){

	CiudadByName =function(ciudad){
		console.log(ciudad);
	};

	/**CinemaByname =function(cine){
		var tabla= $('#Cine');
		var html;
		tabla.empty();
		if(cine!=null){			
			html =' <tr style="border: 1px solid black"> <th colspan="2">Cinema</th> </tr>	<tr style="border: 1px solid black">'
				html+='<th>Name</th>	<th>NumFunciones</th> </tr>'
					html+='<tr>'+"\n	<td>"+cine[0].name+"</td>"+"\n	<td>"+cine[0].functions.length+"</td>"+'\n</tr>';		    
		}		

		tabla.append(html);

		var tabla2=$('#funcion');
		html="";
		tabla2.empty();
		if(cine!=null){
			var funciones=cine[0].functions;				
			html='<tr style="border: 1px solid black"> <th colspan="4">Funciones</th></tr><tr><th>Name</th>	<th>genero</th>	<th>asientos</th><th>fechas</th> </tr>';
			tabla2.append(html);
			for(var i =0;i<funciones.length;i++){
				var asientos=funciones[i].seats.length*funciones[i].seats[0].length;
				html='<tr>';
				html+='<td><input type="checkbox" value='+funciones[i]+'>'+funciones[i].movie+' <span class="checkmark"></span> </input></td>';
				html+='<td>'+funciones[i].movie.genre + '</td>';
				html+='<td>'+asientos + '</td>';
				html+='<td>'+funciones[i].date + '</td>';
				html+='</tr>'
					tabla2.append(html);					
			}				
		}
		else{
			alert("cine no encontrado");
		}	    

	};	*/

	return {		
		metodoGetCity:function (){			
			var ciudad= $('#ciudad').val();
			console.log(ciudad)
			clienteRest.getCiudadByName(ciudad,CiudadByName);			
		}		
	}
})();