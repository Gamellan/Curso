<?php
class Noticia{
	private $id;
	private $titulo;
	private $subtitulo;
	private $cuerpo;
	private $imagen;
	private $pieImagen;
	private $imagenMiniatura;
	private $fechaCreacion;
	private $fechaModificacion;
	
	public function __construct(/*$id,*/$titulo,$subtitulo,$cuerpo,$imagen,$pieImagen,$imagenMiniatura,$fechaCreacion,$fechaModificacion){
		//$this->id = $id;
		$this->titulo=$titulo;
		$this->subtitulo=$subtitulo;
		$this->cuerpo=$cuerpo;
		$this->imagen=$imagen;
		$this->pieImagen=$pieImagen;
		$this->imagenMiniatura=$imagenMiniatura;
		$this->fechaCreacion=$fechaCreacion;
		$this->fechaModificacion=$fechaModificacion;		
	}	
	/*public function setId($id){
		$this->id=$id;
	}*/
	public function setTitulo($titulo){
		$this->titulo=$titulo;
	}	
	public function setSubtitulo($subtitulo){
		$this->subtitulo=$subtitulo;
	}	
	public function setCuerpo($cuerpo){
		$this->cuerpo=$cuerpo;
	}	
	public function setImagen($imagen){
		$this->imagen=$imagen;
	}
	public function setPieImagen($pieImagen){
		$this->pieImagen=$pieImagen;
	}		
	public function setImagenMiniatura($imagenMiniatura){
		$this->imagenMiniatura=$imagenMiniatura;
	}		
	public function setFechaCreacion($fechaCreacion){
		$this->fechaCreacion=$fechaCreacion;
	}	
	public function setFechaModificacion($fechaModificacion){
		$this->fechaModificacion=$fechaModificacion;
	}		
	/*public function getId(){
		return $this->id;
	}*/	
	public function getTitulo(){
		return $this->titulo;
	}	
	public function getSubtitulo(){
		return $this->subtitulo;
	}	
	public function getCuerpo(){
		return $this->cuerpo;
	}
	public function getImagen(){
		return $this->imagen;
	}
	public function getPieImagen(){
		return $this->pieImagen;
	}	
	public function getImagenMiniatura(){
		return $this->imagenMiniatura;
	}	
	public function getFechaCreacion(){
		return $this->fechaCreacion;
	}	
	public function getFechaModificacion(){
		return $this->fechaModificacion;
	}	
}
?>