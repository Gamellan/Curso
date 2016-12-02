<?php
class Album{
		
		private $titulo;
		private $tipo;
		private $fechaModificacion;
		
		function __construct($titulo, $tipo, $fechaMod){
			$this->titulo = $titulo;
			$this->tipo = $tipo //BOOLEAN imagenes = 0, videos = 1;
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
		
		function getFechaModificacion(){
			return $this->fechaModificacion;
		}
		
		function setTitulo($titulo){
			$this->titulo = $titulo;
		}
		
		function setTipo($tipo){
			$this->tipo = $tipo;
		}
		
		function setFechaModificacion($fecha){
			$this->fechaModificacion = $fecha;
		}
		
	}

?>