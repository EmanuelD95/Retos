/**
 * Reto #6 - Edad permitida
Pide al usuario que ingrese su edad y mostrarás un mensaje correspondiente si esta coincide con las siguientes condiciones:
Más de 30 años: Nunca es tarde para aprender ¿Qué curso tomaremos?
Entre 29 y 18 años: Es un momento excelente para impulsar tu carrera.
Menos de 18 años: ¿Sabes hacia dónde dirigir tu futuro? Seguro puedo ayudarte.
 */
var edad: Int = 0


fun main() {
    ingresarEdad()
    edadCorrespondiente()
}
fun ingresarEdad() {
    print("Ingrese su edad:")
    edad = readLine()!!.toInt()
}

fun edadCorrespondiente() {
    if (edad > 30) {
        println("Nunca es tarde para aprender Que curso tomaremos?")
    } else if (29>=edad && edad>18) {
        println("Es un momento excelente para impulsar tu carrera.")
    } else {
        println("Sabes hacia donde dirigir tu futuro? Seguro puedo ayudarte.")
    }
}