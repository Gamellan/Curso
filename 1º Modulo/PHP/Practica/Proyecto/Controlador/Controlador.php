<?php

	class Controlador{
		
		require("./Modelo/ModeloDAO.php");
		$modeloDAO;
		
		function __construct(){
			
			$this->modeloDAO = new ModeloDAO();
			
		}
		
		function conectarse($user, $pass){
			
			if($this->modeloDAO->login(trim($user), $pass)){
				session_start();
				$_SESSION["delegado"]=$user;
				return true;
			}
			return false;
		}
		
		function comprobarSesion(){
			
			return $this->modeloDAO->sesion()
			
		}
		
		function desconectarse(){
			session_destroy();
		}
		
		function mostrar($int){
			
			
			
		}
		/*Este metodo va a enviar todas las solicitudes de insert,
			@datos = array con los datos*/
		function enviar($datos){
			
			return $this->modeloDAO->insertar($datos);
			
		}
		
	}

?>