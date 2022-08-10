fun main() {
    val arraylist = ArrayList<String>()

    val bmw =Car(2000,"tg123", "black", 2, "i8")
    arraylist.add(bmw.toString())

    val tesla = AutoRiderCars(30000, "yh568","red", 5, "3", 120)
    arraylist.add(tesla.toString())

    val hikingBike = Bike(100, "ow987", "white", 1, true)
    arraylist.add(hikingBike.toString())

    val p1 = Costumer(5000)

    println("Please choose one vehicle: \n1)${bmw.getInfo()}\n2)${tesla.getInfo()}\n3)${hikingBike.getInfo()}")
    val choice = readLine()
    if (choice == "1" && p1.bankBalance >= bmw.getPrice()){
        p1.buy(bmw)
        println(bmw.energy())
        println(bmw.start())
        println(bmw.stop())
        bmw.rideable()
    }
    else if(choice == "2" && p1.bankBalance >= tesla.getPrice()){
        p1.buy(tesla)
        println(tesla.energy())
        println(tesla.start())
        println(tesla.stop())
        tesla.rideable()
    }
    else if(choice == "3" && p1.bankBalance >= hikingBike.getPrice()){
        p1.buy(hikingBike)
        println(hikingBike.energy())
        hikingBike.ride()
    }
    else if(choice != "1" && choice!= "2" && choice!="3"){
        println("Oops wrong input!")
    }
    else{
        println("Oops You don't have enough money! >-<")
    }
}