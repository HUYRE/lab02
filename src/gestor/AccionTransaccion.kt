package gestor

interface AccionTransaccion {
    fun agregarTransaccion(transaccion: Transaccion)
    fun mostrarBalance(): Double
    fun mostrarHistorial()
}
