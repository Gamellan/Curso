<?php

class ModeloDAO{
	
	private $mysqli;
	
	function __construct(){
		require("Database.php");
		$db = Database::getInstance();
		$this->mysqli = $db->getConnection();
	}
	//Realizar consultas.
	function consulta($sentencia){
		
		$result = $this->mysqli->query($sentencia);
		$i=0;
		$resultado = array();
		while($row = $result->fetch_array()) {
			$resultado[]= $row; 
			$i++;
		}
		return $resultado;
		
	}		
	//Conectarse
	function login($pass, $user){
		
		$result=consulta("SELECT usuario, password FROM delegados WHERE usuario=$user;");
		if(count($result)>0){
			if($pass == $result[0][1]){
				return true;
			}
		}
		return false;
	}	
	//Comprobar en la sesion si esta conectado como delegado
	function sesion(){
		//comprobamos si el usuario es administrador;
		
		//hacemos una peticion de informacion a los delegados y comprobamos si algunos de ellos es delegado (tiene privilegios)
		$query = "SELECT usuario FROM delegados"; 
		$result = consulta($query); 
		for($i=0;$i<count($result);$i++){
			if($result[$i][0] == $_SESSION["delegado"]){
				return true;
			}
		}		
		return false;	
	}	
	//Mostrar las solicitudes de delegado
	public function mostrarSolicitudAdmin(){		
		$sentencia = "SELECT * FROM SolicitudesDelegados;";
		return consulta($sentencia);	
	}	
	//Solicitar ser delegado
	function enviarSolicitudAdmin(){		
		$sentencia = "INSERT INTO usuarios values(".$nombre.",".$apellidos.",".$telefono.",".$email.",".$razon.")";
		//TRUE O FALSE
		return $this->mysqli->query($sentencia) or trigger_error($this->mysqli->error."[$sentencia]");		
	}	
	
	//Mostrar las noticias
	public function mostrarNoticias(){		
		$sentencia = "SELECT * FROM Noticias;";
		return consulta($sentencia);
	}	
	//Insertar noticias
	function insertarNoticia($datos){		
		$sentencia = 'INSERT INTO Noticias values(null, "'.$datos[0].'","'.$datos[1].'","'.$datos[2].'","'.$datos[3].'","'.$datos[4].'","'.$datos[5].'","'.$datos[6].'","'.$datos[7].'");';
		return $this->mysqli->query($sentencia) or trigger_error($this->mysqli->error."[$sentencia]");		
	}
	
	//Mostrar la documentacion
	function mostrarDocumentacion($ley){
		$sentencia = "";
		if($ley){
			$sentencia = "SELECT privado, titulo, descripcion FROM documentacion WHERE ley=TRUE;";
		}else{
			$sentencia = "SELECT privado, titulo, descripcion FROM documentacion WHERE ley=FALSE;";
		}
		//Matriz con los primeros indices como filas y con los segundos como 0=titulo y 1=descripcion.
		return consulta($sentencia);		
	}	
	//<a href="descargaFichero.php> </a>
	//llamamos a la funcion pasandole la ruta y la extension del fichero;
	function descargaFichero($nombreFichero){
		
		header("Content-disposition: attachment; filename='$nombreFichero'");
		header("Content-type: MIME");
		readfile($nombreFichero);
		
	}//Insertar documentacion
	function insertarDocumentacion($datos){		
		$sentencia = 'INSERT INTO documentacion values(null, "'.$datos[0].'","'.$datos[1].'","'.$datos[2].'","'.$datos[3].'",'.$datos[4].','.$datos[5].',"'.$datos[6].'");';
		return $this->mysqli->query($sentencia) or trigger_error($this->mysqli->error."[$sentencia]");		
	}
	
	//Mostrar multimedia
	function mostrarMultimedia(){		
		$sentencia = "SELECT imagen, titulo FROM multimedia;";
		$resul=consulta($sentencia);
		for($x=0;$x<count($resul);$x++){
			if($resul[$x][0]){
				$datos[] = "<img src='".$resul[$x][1]."' width='600px'><br/><br/>";
			}else{
				$datos[] = "<video width='600px' height='300px' controls>
					<source src='".$resul[$x][1]."' type='video/mp4'>
					Your browser does not support the video tag. 
				</video>";
			}
		}
		//Devuelvo array con los archivos multimedia sin diferenciacion.
		return $datos;		
	}	
	//Insertar multimedia
	function insertarMultimedia($datos){	
		$dia = new DateTime();
		$sentencia = "INSERT INTO multimedia VALUES(null,".$datos[0].",'".$datos[1]."',0, ".$dia->format("y-m-d").");";
		return $this->mysqli->query($sentencia);		
	}
	
	//Mostrar eventos
	function mostrarEventos(){		
		$sentencia = "SELECT tipo, fechaInicio, hora, fechaFin, duracion, lugar, descripcion, cupo FROM eventos;";
		//0=tipo, 1=fechaInicio, 2=hora, 3=fechaFin, 4=duracion, 5=lugar, 6=descripcion, 7=cupo
		return consulta($sentencia);		
	}	
	//Insertar eventos
	function insertarEvento($datos){		
		$tipo = $datos[0];
		$fechaInicio = new DateTime($datos[1]);
		$hora = $datos[2];
		$fechaFin = $datos[3];
		$duracion = $datos[4];
		$lugar = $datos[5];
		$cupo = $datos[6];
		$descripcion = $datos[7];
		$fechaModificacion = new DateTime();
		
		$sentencia ='INSERT INTO evento VALUES(null,"'.$tipo.'",
		"'.$fechaInicio->format("y-m-d").'",
		"'.$hora.'",
		"'.$fechaFin.'",
		"'.$duracion.'",
		"'.$lugar.'",
		"'.$descripcion.'",
		'.$cupo.',
		"'.$fechaModificacion->format("y-m-d").'");';
		return $this->mysqli->query($sentencia) or trigger_error($this->mysqli->error."[$sentencia]");
	}
	
}

?>