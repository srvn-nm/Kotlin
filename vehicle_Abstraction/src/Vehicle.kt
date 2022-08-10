open class Vehicle constructor(price:Int, number:String, color:String, capacity:Int) {

    //properties
    private var price: Int
    private var color: String
    private var capacity: Int
    private var number: String

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
    fun getNumber(): String {
        return this.number
    }

    @JvmName("getCapacity1")
    fun getCapacity(): Int {
        return this.capacity
    }

    fun getInfo(): String {
        return "This ${this.color} car with ${this.capacity} capacity numbered ${this.number} and costs ${this.price}."
    }

    open fun energy(): String {
        return "Have fun riding using "
    }

}