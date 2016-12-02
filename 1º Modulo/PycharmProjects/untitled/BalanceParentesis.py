# -*- coding: utf-8 -*-
cadena = ""
while(cadena!="Salir"):
    parentensis = 0
    corchete = 0
    llave = 0
    lista = []
    cadena = raw_input("Introduzca la cadena de caracteres: ")
    for x in cadena:
        #------Comprobacion de aberturas----------
        if(x == "("):
            parentensis += 1
            #------Añadir la ultima a la lista-------
            lista.append(")")
        if(x == "["):
            corchete += 1
            #------Añadir la ultima a la lista-------
            lista.append("]")
        if( x == "{"):
            llave += 1
            #------Añadir la ultima a la lista-------
            lista.append("}")

        #------Comprobacion de cierres----------
        longitud = len(lista)-1
        if (x == ")"):
            parentensis -= 1
            #----Comprobacion de que la ultima introducida es esta----------
            if(longitud>=0 and x == lista[longitud]):
                lista.pop(longitud)
        if (x == "]"):
            corchete -= 1
            #----Comprobacion de que la ultima introducida es esta----------
            if (longitud>=0 and x == lista[longitud]):
                lista.pop(longitud)
        if (x == "}"):
            llave -= 1
            #----Comprobacion de que la ultima introducida es esta----------
            if (longitud>=0 and x == lista[longitud]):
                lista.pop(longitud)

    longitud = len(lista)
    if(parentensis != 0 or corchete != 0 or llave != 0 or longitud!=0):
        print "La cadena:",cadena,"NO ES VALIDA"
    else:
        print "La cadena: '", cadena,"' ES VALIDA"
    print "Parentesis:",parentensis
    print "Corchetes:",corchete
    print "Llaves:",llave
    print "Longitud:",longitud