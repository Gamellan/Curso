# -*- coding: utf-8 -*-
subtotal = input("Introduce el subtotal: ")
descuento = input("Introduce el % de descuento: ")
iva = input("Introduce la tasa de IVA: ")
descuento = subtotal * (descuento / 100.00)
subtotal_menos_descuento = subtotal - descuento
importe_iva = subtotal_menos_descuento * (iva / 100.00)
total = subtotal_menos_descuento + importe_iva
print "========================"
print "Total: ",total
print "Descuento: ", descuento
print "IVA: ", iva
# ---------- Lista de parametros indeterinados --------------------------
print "========================"
def sumatorio(*numeros):
    resultado = 0
    for n in numeros:
        resultado += n
    return resultado
print sumatorio(2,3,4,5,6)
print "========================"
def frutas(**kwargs):
    for key, value in kwargs.items():
        print "{} = {}".format(key, value)
frutas(pera="verde",manzana="rojo",limon="amarillo")