class AutoRiderCars(price: Int, number: String, color: String, capacity: Int, model:String, time: Int) : Car(price, number, color, capacity, model) {

    private var time:Int

    init{
        this.time = time
    }

    override fun energy(): String {
        return "Enjoy riding using electricity!"
    }

}