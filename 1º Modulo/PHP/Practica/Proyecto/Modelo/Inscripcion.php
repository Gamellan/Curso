<?php

class Incripcion{
		
		private $id_evento
		private $nombre;
		private $apellidos;
		private $email;
		private $telefono;
		
		function __construct($id_evento, $nombre, $apellidos, $email, $telefono){
			$this->id_evento = $id_evento;
			$this->nombre = $nombre;
			$this->apellidos = $apellidos;
			$this->email = $email;
			$this->telefono = $telefono;
		}
		
		function __destruct()
		{
        /**Destructor por defecto**/
		}
		
		function getId_evento(){
			return $this->id_evento;
		}
		
		function getNombre(){
			return $this->nombre;
		}
		
		function getApellidos(){
			return $this->apellidos;
		}
		
		function getEmail(){
			return $this->email;
		}
		
		function getTelefono(){
			return $this->telefono;
		}
		
		function setId_evento($id_evento){
			$this->id_evento = $id_evento;
		}
		
		function setNombre($nombre){
			$this->nombre = $nombre;
		}
		
		function setApellidos($apellidos){
			$this->apellidos = $apellidos;
		}
		
		function setEmail($email){
			$this->email = $email;
		}
		
		function setTelefono($telefono){
			$this->telefono  = $telefono;
		}
	}
	
?>