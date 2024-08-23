package gestor

class Gasto(override val monto: Double, override val descripcion: String) : Transaccion() {
    override val tipo = "Gasto"
}
