package b
import a.A
import a.AA

fun B(x: Int): Int {
    AA()
    print("hello B")
    return 2 * A(x)
}
