package com.example.add.begibkotlin.coursepeewee

class Greetter(val name : String){
    fun greet(){
        println("Hello , ${name}");
    }
}
fun main(args : Array<String>){

    Greetter(args[0]).greet()

}
