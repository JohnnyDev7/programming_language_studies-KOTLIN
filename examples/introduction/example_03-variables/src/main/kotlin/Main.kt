// **********
// VARIABLES
// **********

fun main() {
    // Declares a mutable variable and initializes it.
    var a: String = "initial"
    println(a)
    // Declares an immutable variable and initializes it.
    val b: Int = 1
    // Declares an immutable variable and initializes it without specifying the type.
    // The compiler infers the type "Int".
    val c = 3

    // Declares a variable without initialization
    var e: Int
    // An attempt to use variable causes a compile error: "Variable 'e' must be initialized".
    //println(e)

    // Declares variable without initialization.
    val d: Int
    // Initializes the variable with different values depending on some condition.
    if (someCondition()) {
        d = 1
    } else {
        d = 2
    }
    // Reading the variable is possible because it's already been initialized.
    println(d)
}

fun someCondition() = true