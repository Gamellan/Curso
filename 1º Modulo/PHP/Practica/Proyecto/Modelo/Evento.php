<?php
class Evento{
	private tipo;
	private fechaInicio;
	private hora;
	private fechaFin;
	private duracion;
	private lugar;
	private descripcion;
	private cupo;
	private fechaModificacion;
	
	public function __construct($tipo,$fechaInicio,$hora,$fechaFin,$duracion,$lugar,$descripcion,$cupo,$fechaModificacion){
		$this->tipo=$tipo;
		$this->fechaInicio=$fechaInicio;
		$this->hora=$hora;
		$this->fechaFin=$fechaFin;
		$this->duracion=$duracion;
		$this->lugar=$lugar;
		$this->descripcion=$descripcion;
		$this->cupo=$cupo;
		$this->fechaModificaion=$fechaModificacion;		
	}	
	
	public function setTipo($tipo){
		$this->tipo=$tipo;
	}	
	public function setFechaInicio($fechaInicio){
		$this->fechaInicio=$fechaInicio;
	}	
	public function setHora($hora){
		$this->hora=$hora;
	}	
	public function setFechaFin($fechaFin){
		$this->fechaFin=$fechaFin;
	}		
	public function setDuracion($duracion){
		$this->duracion=$duracion;
	}		
	public function setLugar($lugar){
		$this->lugar=$lugar;
	}	
	public function setDescripcion($descripcion){
		$this->descripcion=$descripcion;
	}		
	public function setCupo($cupo){
		$this->cupo=$cupo;
	}	
	public function setFechaModificacion($fechaModificacion){
		$this->fechaModificacion=$fechaModificacion;
	}

	public function getTipo(){
		return $this->tipo;
	}	
	public function getFechaInicio(){
		return $this->fechaInicio;
	}	
	public function getHora(){
		return $this->hora;
	}	
	public function getFechaFin(){
		return $this->fechaFin;
	}		
	public function getDuracion(){
		return $this->duracion;
	}		
	public function getLugar(){
		return $this->lugar;
	}	
	public function getDescripcion(){
		return $this->descripcion;
	}		
	public function getCupo(){
		return $this->cupo;
	}	
	public function getFechaModificacion(){
		return $this->fechaModificacion;
	}	
}
?>