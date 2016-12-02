<?php
class SolicitudDelegado{
	private $id;
	private $nombre;
	private $apellidos;
	private $telefono;
	private $email;
	private $razon;
	/*public function setId($id){
		$this->id=$id;
	}*/	
	public function __construct(/*$id,*/$nombre,$apellidos,$telefono,$email,$razon){
		//$this->id = $id;
		$this->nombre=$nombre;
		$this->apellidos=$apellidos;
		$this->telefono=$telefono;
		$this->email=$email;
		$this->razon=$razon;
	}	
	
	public function setNombre($nombre){
		$this->nombre=$nombre;
	}	
	public function setApellidos($apellidos){
		$this->apellidos=$apellidos;
	}	
	public function setTelefono($telefono){
		$this->telefono=$telefono;
	}	
	public function setEmail($email){
		$this->email=$email;
	}		
	public function setRazon($razon){
		$this->razon=$razon;
	}	
	/*public function getId(){
		return $this->id;
	}*/	
	public function getNombre(){
		return $this->nombre;
	}	
	public function getApellidos(){
		return $this->apellidos;
	}	
	public function getTelefono(){
		return $this->telefono;
	}
	public function getEmail(){
		return $this->email;
	}	
	public function getRazon(){
		return $this->razon;
	}	
}
?>