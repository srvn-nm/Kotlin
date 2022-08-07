fun main(){

    var birth=23

    var A:String

    A = when(birth){

        in 1..31 -> "farvardin"

        in 32..62->"ordibehesht"

        !in 63..93->"not khordad"

        else -> {

            "mohem nist"

        }

    }

    println(A)

}