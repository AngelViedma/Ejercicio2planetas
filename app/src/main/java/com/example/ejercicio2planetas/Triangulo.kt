package com.example.ejercicio2planetas

class Triangulo {
    var longitud1: Int
    var longitud2: Int
    var longitud3: Int
    var perimetro: Int
    var tipo:String

    constructor(longitud1:Int,longitud2:Int,longitud3:Int,perimetro:Int,tipo:String){
        this.longitud1=longitud1
        this.longitud2=longitud2
        this.longitud3=longitud3
        this.perimetro=perimetro
        this.tipo=tipo
    }

    fun rectangulo():Boolean{
        return ((longitud1*longitud1)+(longitud2*longitud2))==(longitud3*longitud3)
    }
}

fun main(){
    val triangulo1 = Triangulo(3,4,5,5,"Rectangulo")
    println("El triangulo es ${triangulo1.rectangulo()}")

    val triangulo2= Triangulo(3,3,3,5,"Rectangulo")
    println("El triangulo es ${triangulo2.rectangulo()}")

}
