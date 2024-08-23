package gestor

abstract class Transaccion {
    abstract val monto: Double
    abstract val descripcion: String
    abstract val tipo: String
}
