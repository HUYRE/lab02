package gestor

class GestorFinanzas : AccionTransaccion {
    private val transacciones = mutableListOf<Transaccion>()
    private var balance: Double = 0.0

    override fun agregarTransaccion(transaccion: Transaccion) {
        transacciones.add(transaccion)
        balance += if (transaccion is Ingreso) transaccion.monto else -transaccion.monto
    }

    override fun mostrarBalance(): Double {
        return balance
    }

    override fun mostrarHistorial() {
        println("Historial de transacciones:")
        transacciones.forEach {
            println("${it.tipo}: ${it.descripcion} - Monto: ${it.monto}")
        }
    }
}
