/**
 * Reto #2 - En el rango, por favor.
 * Pide al usuario que indique 2 números: uno que servirá como límite y otro para comparar. Si el segundo número es menor al primero, mostrarás un mensaje diciendo “El número ‘x’ se encuentra en el rango, gracias” y en caso contrario dirá “El número ‘x’ excede el límite permitido”.
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
        println("El numero $segundoNumero se encuentra en el rango, gracias:")
    } else {
        println("El numero excede el numero permitido")
    }
}
