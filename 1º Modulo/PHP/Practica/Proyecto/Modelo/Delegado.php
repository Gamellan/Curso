<?php
class Delegados{
	private usuario;
	private password;
	private nombre;
	private apellidos;
	public function __construct(/*$id,*/$usuario,$password,$nombre,$apellidos){
		//$this->id = $id;
		$this->usuario=$usuario;
		$this->password=$password;
		$this->nombre=$nombre;
		$this->apellidos=$apellidos;		
	}
	public function setUsuario($usuario){
		$this->usuario=$usuario;
	}	
	public function setPassword($password){
		$this->password=$password;
	}	
	public function setNombre($nombre){
		$this->nombre=$nombre;
	}	
	public function setApellidos($apellidos){
		$this->apellidos=$apellidos;
	}			
	/*public function getId(){
		return $this->id;
	}*/	
	public function getUsuario(){
		return $this->usuario;
	}	
	public function getPassword(){
		return $this->password;
	}	
	public function getNombre(){
		return $this->nombre;
	}
	public function getApellidos(){
		return $this->apellidos;
	}	
}
?>