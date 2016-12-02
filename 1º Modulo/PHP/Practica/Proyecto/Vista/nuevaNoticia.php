<?php

	require_once("../Modelo/ModeloDAO.php");

		$noticias[] = $_POST["titulo"];
		$noticias[] = $_POST["subtitulo"];
		$noticias[] = $_POST["cuerpo"];		
		$ruta = "./imagenes/Noticias_".$noticias[0]. '.jpg';
		$noticias[] = $ruta;
		$noticias[] = $ruta;
		move_uploaded_file($_FILES["imagen"]["tmp_name"], $ruta);

		$noticias[] = $ruta;
		/*$tipo_fichero = $dir_subida.$_FILES['imagen']['type'];
		$tamano_fichero = $dir_subida.$_FILES['imagen']['size'];
		$error_fichero = $dir_subida.$_FILES['imagen']['error'];*/

		$fechaCreacion = new DateTime();
		$noticias[] = $fechaCreacion->format("y-m-d");
	
		$fechaMod = new DateTime();
		$noticias[] = $fechaMod->format("y-m-d");
		$objeto = new ModeloDAO();		
		if($objeto->insertarNoticia($noticias)){
			echo "correcto";
		}else{
			echo "error";
		}
		echo "<form action='noticias.html' method='POST'><input type='submit' value='Volver'></form>";
	
?>