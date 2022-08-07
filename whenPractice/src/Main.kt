fun main() {
    print("Enter a number between 0 to 6 here: ")
    val dayNumber = readLine()!!
    var dayString = when (dayNumber.toInt()){
        0 -> {"Saturday"}
        1 -> {"Sunday"}
        2 -> {"Monday"}
        3 -> {"Tuesday"}
        4 -> {"Wednesday"}
        5 -> {"Thursday"}
        6 -> {"Friday"}
        else -> {"Oops! You entered a number out of range!"}
    }
    if(dayNumber.toInt() !in 0..6){
        println(dayString)
    }
    else{
        println("$dayString is equal to the number you entered! ^-^")
    }
}