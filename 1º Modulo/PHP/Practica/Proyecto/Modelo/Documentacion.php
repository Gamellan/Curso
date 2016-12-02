<?php
class Documentacion{
	private $id;
	private $titulo;
	private $descripcion;
	private $fechaPublicacion;
	private $archivo;
	private $privado;
	private $ley;
	private $fechaModificacion;
	
	function __construct($titulo,$descripcion,$fechaPublicacion,$archivo,$privado,$ley,$fechaModificacion){
		$this->titulo=$titulo;
		$this->descripcion=$descripcion;
		$this->fechaPublicacion=$fechaPublicacion;
		$this->archivo=$archivo;
		$this->privado=$privado;
		$this->ley=$ley;
		$this->fechaModificacion=$fechaModificacion;
	}	
	
	/*public function setId($id){
		$this->id=$id;
	}*/	
	public function setTitulo($titulo){
		$this->titulo=$titulo;
	}	
	public function setDescripcion($descripcion){
		$this->descripcion=$desripcion;
	}	
	public function setFechaPublicacion($fechaPublicacion){
		$this->fechaPublicacion=$fechaPublicacion;
	}	
	public function setArchivo($archivo){
		$this->archivo=$archivo;
	}		
	public function setPrivado($privado){
		$this->privado=$privado;
	}	
	public function setLey($ley){
		$this->ley=$ley;
	}
	public function setFechaModificacion($fecha){
		$this->fechaModificacion = $fecha;
	}
	/*public function getId(){
		return $this->id;
	}*/
	public function getTitulo(){
		return $this->titulo;
	}	
	public function getDescripcion(){
		return $this->descripcion;
	}	
	public function getFechaPublicacion(){
		return $this->fechaPublicacion;
	}
	public function getArchivo(){
		return $this->archivo;
	}	
	public function getPrivado(){
		return $this->privado;
	}		
	public function getLey(){
		return $this->ley;
	}
	public function setFechaModificacion($fecha){
		return $this->fechaModificacion;
	}
	
}
?>