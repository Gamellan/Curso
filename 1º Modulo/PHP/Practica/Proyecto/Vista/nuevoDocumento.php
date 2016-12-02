<?php
	
	$datos[] = $_POST['titulo'];
	$datos[] = $_POST["descripcion"];
	$datos[] = $_POST["fPublicacion"];
	$datos[] = "./documentacion/Documentos_".$datos[0]."_".$datos[2];
	if($_POST["zona"]){
		$datos[]=1;
	}else{
		$datos[]=0;
	}
	if($_POST["tipo"]=="Ley"){
		$datos[]=1;
	}else{
		$datos[]=0;
	}
	$fecha = new DateTime();
	$datos[] = $fecha->format("y-m-d");
	move_uploaded_file($_FILES["archivo"]["tmp_name"], "./documentacion/Documentos_".$datos[0]."_".$datos[2]);
	require("../Modelo/ModeloDAO.php");
	$modelo = new ModeloDAO();
	if($modelo->insertarDocumentacion($datos)){
		echo "Insertado correctamente.";
	}else{
		echo "Error al insertar.";
	}
	echo "<form action='eventos.html' method='POST'><input type='submit' value='Volver'></form>";
	
	
?>