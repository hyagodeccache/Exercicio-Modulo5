

fun main() {

    var veiculo = Veiculo("Corsa")
    veiculo.incrementVelocity(80)
    veiculo.decrementVelocity(30)
    veiculo.print()

}

class Veiculo(var model: String) {
    var longVelocity: Int = 0
    var longAcceleration: Int = 10

    fun incrementVelocity(velocity: Int){
        longVelocity += velocity
    }

    fun decrementVelocity(velocity: Int){
        longVelocity -= velocity

        if(longVelocity < 0)
            longVelocity = 0
    }


    fun print(){
        println("Modelo: $model, velocidade atual: $longVelocity km/h")
    }
}

