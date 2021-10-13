fun main() {
    // given the lines y = 3x + 5 and y = 4x + 2
    val m1 = 3; val c1 = 5; val m2 = 4; val c2 = 2;

    intersection(m1, c1, m2, c2)
}

fun intersection(m1: Int, c1: Int, m2: Int, c2: Int) {
    var notFound = true;
    for (x1 in 0..100) { 
        var found = false;
        var y1 = calculate(m1, x1, c1);
        for (x2 in 0..100) {
            var y2 = calculate(m2, x2, c2)
            if (y1 == y2) {
                print("The two lines intersect at: "); print(y1);
                found = true;
                notFound = false;
                break;
            }
        }
        if (found) break;
    }
    if (notFound) {
        println("Don't intersect");
    }
}

fun calculate(m: Int, x: Int, c: Int): Int = m * x + c;