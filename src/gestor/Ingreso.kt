package gestor

class Ingreso(override val monto: Double, override val descripcion: String) : Transaccion() {
    override val tipo = "Ingreso"
}
