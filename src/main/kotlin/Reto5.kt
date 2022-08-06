/**
 * Reto #5 - ¿Cómo está el clima?
Crea un programa que pregunte al usuario si está lloviendo, en caso de responder “sí” pregunta si está haciendo mucho viento y si responde “sí” nuevamente muestra un mensaje indicando que hace mucho viento para salir con una sombrilla. En caso contrario, anima al usuario a que lleve una sombrilla. Para el caso de responder “no” en la primer pregunta, entonces solo desea un bonito día.
Considera que las respuestas pueden pasarse a minúsculas para evitar posibles errores
 */
var clima: String = ""
fun main() {
    preguntas()
    usuario()
}
fun preguntas() {
    print("esta lloviendo: ")
    clima = readLine()!!
    print("esta haciendo mucho viento: ")
    clima = readLine()!!
}
fun usuario() {

    if ("Si".equals(clima)) {
        println()
    } else if ("No".equals(clima)) {
        println("que tenga un bonito dia")
    } else if ("si".equals(clima)) {
        println("hace mucho viento para salir con una sombrilla")
    } else {
        println("lleve una sombrilla")
    }
}