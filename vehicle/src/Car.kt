open class Car(price: Int, number: Int, color: String, capacity: Int, model:String) : Vehicle(price, number, color, capacity) {

    var model:String

    init{
        this.price = price
        this.model = model
        this.color = color
        this.number = number
        this.capacity = capacity
    }

    fun start():String{
        return "starts and ready for a ride! ^-^"
    }

    fun stop():String{
        return "stops and safe to get off."
    }
}