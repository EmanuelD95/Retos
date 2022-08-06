/**
 * Reto #4 - “I like turtles”
 *Escribe un programa que pida al usuario ingrese su animal favorito, si coloca ‘Tortuga’, ‘tortuga’, ‘TORTUGA’ o cualquier otra variante de la palabra entonces mostrar en pantalla “También me gustan las tortugas”. En caso contrario mostrar el mensaje “Ese animal es genial, pero prefiero las tortugas”.
 */
var animal: String = ""
fun main() {
    animalFavorito()
    Animales()
}
fun animalFavorito () {
    print("Ingresar Animal favorito: ")
    animal = readLine()!!
}
fun Animales() {

    if (animal.uppercase().equals("TORTUGA")) {
        println("Tambien me gustan las tortugas")
    } else {
        println("Ese animal es genial, pero prefiero las tortugas")
    }
}