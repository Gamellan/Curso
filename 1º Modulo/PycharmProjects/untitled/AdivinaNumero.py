# -*- coding: utf-8 -*-
import random
intentos = 1

num_al = random.randint(0,100)
linea = "==============================================================="
print linea
print "Bienvenido a: 'Adivina el numero'"
nombre=""
while(nombre.strip()==""):
    nombre = raw_input("Por favor, introduzca su nombre de usuario: ").strip()
    intentos+=1
print "Intentaste introducir el nombre",intentos,"veces..."
intentos=1
num = input("Introduce un numero entre 0 y 100. ")
while(num!=num_al):
    print linea
    if(num<num_al):
        print linea
        print "Lo siento",nombre,"Tu numero es demasiado bajo..."
    if(num>num_al):
        print linea
        print "Tu numero es demasiado alto..."
    intentos+=1
    num = input("Introduce un numero entre 0 y 100. ")
print linea
print "                         O_O                                   "
print "¡Vaya! Parece que has ACERTADO.",nombre,"¡¡ENHORABUENA!!"
print "Lo conseguiste en",intentos,"intentos"