open class Car(price: Int, number: Int, color: String, capacity: Int) : Vehicle(price, number, color, capacity) {
    fun start():String{
        return "starts and ready for a ride! ^-^"
    }

    fun stop():String{
        return "stops and safe to get off."
    }
}