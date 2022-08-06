/**
 * Reto #1 - Número mayor y menor
 * Escribe un programa que pida al usuario 2 números, mostrando como salida cuál es el número mayor y la diferencia de uno respecto al otro. En caso de que los números sean iguales, mostrarlo también en pantalla.
 */

private var primerNumero: Int =0
private var segundoNumero: Int =0

fun main(){
    ingresarNumeros()
    comparacionNumerica()
}
private fun ingresarNumeros(){
    print("Ingresar primer numero: ")
    primerNumero = readLine()!!.toInt()
    print("Ingresar segundo numero: ")
    segundoNumero = readLine()!!.toInt()
}
private fun comparacionNumerica() {
    if (primerNumero>segundoNumero){
        println("El mayor es: $primerNumero \nLa diferencia es: ${primerNumero-segundoNumero}")
    } else if (primerNumero<segundoNumero){
        println("el mayor es: $segundoNumero \nla diferencia es: ${segundoNumero-primerNumero}")
    } else {
        println("Son iguales")
    }
}
