class caja <T>(val contenido: T){
    fun obtenerContenido(): T  {
        return contenido
    }
}



    //ejemplo2
    fun <T> imprimirDato(elemento: T){
        println(elemento)
    }
    //ejemplo 3
    fun <T:Number> sumar(a: T, b: T):Doule{
        return a.toDouble() + b.toDouble()
    }

    //ejemplo 4
    fun <T> imprimirSIEsNumero(valor: T ) where T: Number{
        println(valor.toDouble())
    }

fun main(args:Array<String>){

    val cajaint = caja(42)
    val cajastring = caja("soy una cadena")
    val nombre="Frank"
    val entero=1234567
    val suma = (10.7541, 45)


    println("**** ejemplo 1 ****")
    println(cajaInt.obtenerContenido())
    println(cajastring.obtenerContenido())
    println("**** fin del ejemplo 1 ****")

    
    println("\n **** ejemplo 2 ****")
    println(nombre())
    println(entero())
    println("**** fin del ejemplo 2  ****")

    println("\n **** ejemplo 3 ****")
    println("la suma es: $(suma)")
    println("**** fin del ejemplo 3  ****")

    println("\n **** ejemplo 4 ****")
    imprimirSIEsNumero(suma)
    println("**** fin del ejemplo 5  ****")
}

