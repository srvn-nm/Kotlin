class Costumer constructor(bankBalance:Int){
        var bankBalance: Int
        private lateinit var choice:Vehicle

        init{
            this.bankBalance = bankBalance
        }

        fun buy(choice:Vehicle):String{
            this.choice = choice
            return "Congratulations! You successfully buy ${this.choice}."
        }
}