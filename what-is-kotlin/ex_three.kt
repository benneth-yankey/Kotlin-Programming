fun main() {
    // given the line, y = 3x - 1
    val m = 3; val c = -1; val start = -5; val stop = 5;

    for (i in start..stop) println(calculate(m, i, c)) 
}

// calculate returns the value of y for all x values
// in the range of -5 and 5
fun calculate(m: Int, x: Int, c: Int): Int = m * x + c