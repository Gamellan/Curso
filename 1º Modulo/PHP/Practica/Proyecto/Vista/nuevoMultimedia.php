<?php
	
	require("../Modelo/ModeloDAO.php");
	$modelo = new ModeloDAO();
	$correto = true;
	for($i=0;$i<$_POST["numeroImagenes"];$i++){
		$datos[]=1;
		$datos[]="./imagenes/Multimedia_imagen".$i;
		move_uploaded_file($_FILES["imagen".$i]["tmp_name"], "./imagenes/Multimedia_imagen".$i);
		if(!$modelo->insertarMultimedia($datos)){
			$correcto = false;
		}
	}
	for($i=0;$i<$_POST["numeroVideos"];$i++){
		$datos[]=0;
		$datos[]=$_POST["urlVideo".$i];
		if(!$modelo->insertarMultimedia($datos)){
			$correcto = false;
		}
	}
	echo "<form action='multimedia.html' method='POST'><input type='submit' value='Volver'></form>";
	
	
?>