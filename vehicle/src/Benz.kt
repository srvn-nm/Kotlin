class Benz(price: Int, number: Int, color: String, capacity: Int, model:String) :Car(price, number, color, capacity,model) {

    init{
        this.model = model
        this. price = price
        this. number = number
        this. color = color
        this. capacity = capacity
    }
}