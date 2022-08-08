open class Car(price: Int, number: Int, color: String, capacity: Int, model:String) : Vehicle(price, number, color, capacity) {

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
}