<?php

class Multimedia{
		
		private $titulo;
		private $tipo; //Boolean imagen = true, video = false;
		private $idAlbum;
		private $fechaMod;
		
		function __construct($titulo, $tipo, $idAlbum, $fechaMod){
			$this->titulo = $titulo;
			$this->tipo = $tipo //BOOLEAN imagenes = 0, videos = 1;
			$this->idAlbum = $idAlbum;
			$this->fechaModificacion = $fechaMod;
		}
		
		function __destruct()
		{
        /**Destructor por defecto**/
		}
		
		function getTitulo(){
			return $this->Titulo;
		}
		
		function getTipo(){
			return $this->tipo;
		}
		
		function getIdAlbum(){
			return $this->idAlbum;
		}
		
		function getFechaModificacion(){
			return $this->fechaModificacion;
		}
		
		function setTitulo($titulo){
			$this->titulo = $titulo;
		}
		
		function setTipo($tipo){
			$this->tipo = $tipo;
		}
		
		function setIdAlbum($idAlbum){
			$this->idAlbum = $idAlbum;
		}
		
		function setFechaModificacion($fecha){
			$this->fechaModificacion = $fecha;
		}
		
	}
	
?>