package com.example.ejercicio2planetas

class Planeta {
    var nombre: String
    var tipo: String
    var masa: Double

    constructor(nombre: String, tipo: String, masa: Double) {
        this.nombre = nombre
        this.tipo = tipo
        this.masa = masa
    }

    fun masaDoble():Double{
        val masadoble = masa*2
        return masadoble
    }

    fun orbitar() {
        println("$nombre está orbitando ")
    }

    fun rotar() {
        println("$nombre está rotando ")
    }


}

fun main() {
    val tierra = Planeta("Tierra", "Rocoso", 5.972e24)
    val marte = Planeta("Marte", "Rocoso", 6.39e23)

    tierra.orbitar()
    tierra.rotar()
    val masaDoble = tierra.masaDoble()
    println("Si la masa fuera doble en la Tierra seria de $masaDoble kg")

    marte.orbitar()
    marte.rotar()
    val masaDoble2 = marte.masaDoble()
    println("Si la masa fuera doble en marte seria de $masaDoble2 kg")
}
