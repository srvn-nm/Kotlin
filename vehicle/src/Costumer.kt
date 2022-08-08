class Costumer constructor(bankBalance:Int, choice:Vehicle){
        var bankBalance: Int
        lateinit var choice:Vehicle

        init{
            this.bankBalance = bankBalance
        }

        fun buy(choice:Vehicle):String{
            this.choice = choice
            return "Congratulations! You successfully buy ${this.choice}."
        }
}