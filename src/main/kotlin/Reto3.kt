/**
 * Reto #3 - Rangos cambiantes.
 * Nuevamente pide a tu usuario que indique 3 números: un límite superior, un límite inferior y uno de comparación. Si el número de comparación se encuentra entre los 2 primeros, comunicarlo en pantalla. En caso estar por debajo del límite inferior o por arriba del límite superior, también mostrarlo en pantalla.
 */

private var limiteSuperior: Int =0
private var limiteInferior: Int =0
private var numeroDeComparacion: Int =0

fun main(){
    ingresarNumeros()
    comparacionNumerica()
}
private fun ingresarNumeros(){
    print("Ingresar Limite superior: ")
    limiteSuperior = readLine()!!.toInt()
    print("Ingresar Limite inferior: ")
    limiteInferior = readLine()!!.toInt()
    print("Ingresar Numero de comparacion: ")
    numeroDeComparacion = readLine()!!.toInt()
}
private fun comparacionNumerica() {
    if (limiteSuperior>numeroDeComparacion && numeroDeComparacion>limiteInferior){
        println("El numero $limiteInferior se encuentra en el rango, gracias:")
    } else if (limiteInferior>numeroDeComparacion){
        println("El numero $numeroDeComparacion esta por debajo del limite inferior")
    } else {
        println("el numero $numeroDeComparacion esta por ensima de limite superior")
    }
}
