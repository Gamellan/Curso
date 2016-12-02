# -*- coding: utf-8 -*-
edad = input("Introduzca la edad del perro: ")
if(edad < 3):
    if(edad == 1):
        anios = 14
    else:
        anios = 22
elif(edad<=0):
    print "El valor no puede ser negativo"
else:
    anios = ((edad - 2) * 5) + 22
print "Tu perro tiene: ", anios," años"