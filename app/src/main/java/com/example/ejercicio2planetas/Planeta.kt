package com.example.ejercicio2planetas

class Planeta(var nombre:String, var tipo:String, var masa:Double) {
    constructor(): this("Jupiter","Gaseoso",343223.0)


    fun gaseosos():String{
        return
    }

    override fun toString():String{
        return "Planeta(nombre='$nombre', tipo='$tipo',masa='$masa)"
    }

}
