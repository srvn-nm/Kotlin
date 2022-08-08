open class Vehicle constructor(price:Int, number:Int, color:String, capacity:Int) {

    //properties
    protected var price: Int
    protected var color: String
    protected var capacity: Int
    protected var number: Int

    //constructor
    init {
        this.price = price
        this.color = color
        this.number = number
        this.capacity = capacity
    }

    //methods
    @JvmName("getPrice1")
    fun getPrice(): Int {
        return this.price
    }

    @JvmName("getColor1")
    fun getColor(): String {
        return this.color
    }

    @JvmName("getNumber1")
    fun getNumber(): Int {
        return this.number
    }

    @JvmName("getCapacity1")
    fun getCapacity(): Int {
        return this.capacity
    }

    fun getInfo(): String {
        return "This ${this.color} car with ${this.capacity} capacity numbered ${this.number} and costs ${this.price}."
    }

    fun energy(): String {
        return "Have fun riding using "
    }

}