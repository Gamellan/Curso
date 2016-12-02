	
	var tipo = 0;
	var indice = 1;
	var textArchivos = "";
	
	
	function habilitarTipo(){
		var elementoSeleccionado =  document.getElementsByName("tipo");
		if(elementoSeleccionado[0].checked){
			document.getElementById('adjuntarImagen').disabled = "false";
			document.getElementById('adjuntarImagen').style.cursor = "pointer";
			document.getElementById('adjuntarImagen').style.backgroundColor = "#4D8ECB";
			document.getElementById('adjuntarImagen').onmouseover = function() {
				this.style.transform = "scale(1.05,1.05)";
			}
			
			document.getElementById('adjuntarVideo').disabled = "true";
			document.getElementById('adjuntarVideo').style.cursor = "none";
			document.getElementById('adjuntarVideo').style.backgroundColor = "grey";
			document.getElementById('adjuntarVideo').style.transform = "none";
			document.getElementById("files").innerHTML = "Imagen: imagen1.jpg";
			tipo=0;
		}else if(elementoSeleccionado[1].checked){
			document.getElementById('adjuntarVideo').disabled = "false";
			document.getElementById('adjuntarVideo').style.cursor = "pointer";
			document.getElementById('adjuntarVideo').style.backgroundColor = "#4D8ECB";
			document.getElementById('adjuntarVideo').onmouseover = function() {
				this.style.transform = "scale(1.05,1.05)";
			}
			
			document.getElementById('adjuntarImagen').disabled = "true";
			document.getElementById('adjuntarImagen').style.cursor = "none";
			document.getElementById('adjuntarImagen').style.backgroundColor = "grey";
			document.getElementById('adjuntarImagen').style.transform = "none";
			document.getElementById("files").innerHTML = "Video: video1.mp4";
			tipo=1;
		}
		
	}
	
	function habilitarArchivo(indice){
		document.getElementById("adjuntar").style.visibility  = "visible";
		document.getElementById("introducir").style.visibility   = "hidden";
	}
	
	function habilitarURL(indice){
		document.getElementById("introducir").style.visibility  = "visible";
		document.getElementById("adjuntar").style.visibility  = "hidden";
	}
	
	function limpiarArchivos(){
		document.getElementById("files").innerHTML = "sfs";
	}
	

