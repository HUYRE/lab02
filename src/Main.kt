package gestor

fun main() {
    val gestor = GestorFinanzas()

    while (true) {
        println("Seleccione una opción:")
        println("1. Agregar Ingreso")
        println("2. Agregar Gasto")
        println("3. Mostrar Balance")
        println("4. Mostrar Historial")
        println("5. Salir")

        when (readLine()?.toInt()) {
            1 -> {
                println("Ingrese la descripción del ingreso:")
                val descripcion = readLine() ?: ""
                println("Ingrese el monto del ingreso:")
                val monto = readLine()?.toDouble() ?: 0.0
                val ingreso = Ingreso(monto, descripcion)
                gestor.agregarTransaccion(ingreso)
            }
            2 -> {
                println("Ingrese la descripción del gasto:")
                val descripcion = readLine() ?: ""
                println("Ingrese el monto del gasto:")
                val monto = readLine()?.toDouble() ?: 0.0
                val gasto = Gasto(monto, descripcion)
                gestor.agregarTransaccion(gasto)
            }
            3 -> {
                val balance = gestor.mostrarBalance()
                println("El balance actual es: $balance")
            }
            4 -> {
                gestor.mostrarHistorial()
            }
            5 -> {
                println("Saliendo de la aplicación...")
                break
            }
            else -> println("Opción no válida. Intente nuevamente.")
        }
    }
}
