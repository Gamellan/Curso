<?php
	
	$datos[] = $_POST['tipo'];
	$datos[] = $_POST["fInicio"];
	$datos[] = $_POST["hora"];
	$datos[] = $_POST["fFin"];
	$datos[] = $_POST["duracion"];
	$datos[] = $_POST["lugar"];
	$datos[] = $_POST["cupo"];
	$datos[] = $_POST["descripcion"];
	$datos[] = $_POST["radioInscripcion"];
	move_uploaded_file($_FILES["imagenEvento"]["tmp_name"], "./imagenes/Eventos_".$datos[1]."_".$datos[3]);
	require("../Modelo/ModeloDAO.php");
	$modelo = new ModeloDAO();
	if($modelo->insertarEvento($datos)){
		echo "Insertado correctamente.";
	}else{
		echo "Error al insertar.";
	}
	echo "<form action='eventos.html' method='POST'><input type='submit' value='Volver'></form>";
	
	
?>