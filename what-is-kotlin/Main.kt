// global variables
var funds : Double = 100.0
val pswd = "password"
 
fun main() {
    var input : String
    var cmd : List<String>
 
    while (true) {
        print("Command: ")
        input = readLine()!!
        cmd = input.split(" ") 
        when (cmd[0]) {
            "balance" -> balance();
            "deposit" -> deposit(funds, cmd[1].toDouble());
            else -> println("Invalid command");
        }
    }
}

fun deposit(funds: Double, amount: Double) {
    funds += amount;
}

fun balance(): Unit = println("balance: $funds"); 
