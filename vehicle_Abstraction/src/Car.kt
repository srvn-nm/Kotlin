open class Car(price: Int, number: String, color: String, capacity: Int, model:String) : Vehicle(price, number, color, capacity), GivingRides {

    private var model:String

    init{
        this.model = model
    }

    fun start():String{
        return "starts and ready for a ride! ^-^"
    }

    fun stop():String{
        return "stops and safe to get off."
    }

    override fun energy(): String {
        return "Enjoy riding using Gas!"
    }

    override fun rideable() {
        println("You can give a ride to ${this.getCapacity()} other people!")
    }
}