class Bike(price: Int, number: Int, color: String, capacity: Int, helmet: Boolean) : Vehicle(price, number, color, capacity) {

    private var helmet:Boolean

    init{
        this.helmet = helmet
    }

    fun ride(): String {
        return "Happy riding this beautiful bike! ^-^"
    }

    override fun energy(): String {
        return "${super.energy()} your muscles! You Strong *-*"
    }
}