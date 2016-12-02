class Dog():

    __name = ""

    def __init__(self, name):
        self.name = name

    def bark(self):
        print"{}, guau... guau... ".format(self.getName())
        print

    def setName(self, name):
        self.name = name

    def getName(self):
        return self.name

#---Instancia 1---
perro1 = Dog("Doqui")

#---Instancia 2-----
perro2 = Dog("Firulaes")

#---Los perros ladran---
perro1.bark()
perro2.bark()