open class Vehicle constructor(price:Int, number:Int, color:String, capacity:Int) {

    //properties
    private var price: Int
    private var color: String
    private var capacity: Int
    private var number: Int

    //constructor
    init {
        this.price = price
        this.color = color
        this.number = number
        this.capacity = capacity
    }

    //methods
    fun getPrice(): Int {
        return this.price
    }

    fun getColor(): String {
        return this.color
    }

    fun getNumber(): Int {
        return this.number
    }

    fun getCapacity(): Int {
        return this.capacity
    }

    fun getInfo(): String {
        return "This ${this.color} car with ${this.capacity} capacity numbered ${this.number} and costs ${this.price}."
    }

    

}