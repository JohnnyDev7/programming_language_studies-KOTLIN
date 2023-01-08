// **********
// FUNCTIONS
// **********

fun main() {
    // Calls the first function with the argument "Hello".
    printMessage("Hello")
    // Calls the function with two paramenters, passing values for both of them.
    printMessageWithPrefix("Hello", "Log")
    // Calls the same function ommiting the second one. The default value
    // "Info"  is used.
    printMessageWithPrefix("Hello")
    // Calls the same function using named arguments and changing the
    // order of the arguments.
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    // Prints the result of the "sum" function call.
    println(sum(1, 2))
    // Prints the rsult of the "multiply" function call
    println(multiply(2, 4))



    // -------------------------------------------------------------------
    // Infix Functions
    // -------------------------------------------------------------------
    // Defines an infix extension function on "Int".
    infix fun Int.times(str: String) = str.repeat(this)
    // Calls the infix function.
    println(2 times "Bye ")

    // Creates a "Pair" by calling the infix function "to" from the standard library.
    val pair = "Ferrari" to "Katrina"
    println(pair)

    // Here's your own implementation of "to" creatively called "onto".
    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)


    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    // Infix notation also work on members functions (methods).
    sophia likes claudia



    // -------------------------------------------------------------------
    // Functions with "vararg" Parameters
    // -------------------------------------------------------------------
    // The "vararg" modifier turns a parameter into a vararg.
    fun printAll(vararg  messages: String) {
        for (m in messages) println(m)
    }
    // This allows calling "printAll" with any number of string arguments.
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")

    // Thanks to named parameters, you can even add another parameter of the same
    // type after the vararg. This wouldn't be allowed in Java because there's no way
    // to pass a value.
    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println(prefix + m)
    }
    // Using named parameters you can set a value to "prefix" separately from the vararg.
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "
    )

    // At runtime, a vararg is just an array. To pass it along into a vararg parameter, use the
    // special spread operator "*" that lets you pass in "*entries" (a vararg of "String")
    // instead of "entries" (an "Array<String>").
    fun log(vararg entries: String) {
        printAll(*entries)
    }
    log("Hello", "Hallo", "Salut", "Hola", "你好")
}

// -------------------------------------------------------------------
// Default Paramenter Values and Named Arguments
// -------------------------------------------------------------------

// A simple function that takes a parameter of type "String" and returns
// "Unit" (i.e., no return value).
fun printMessage(message: String): Unit {
    println(message)
}

// A function that takes a second optional parameter with default value
// "Info". The return type is ommited, meaning that's acctually "Unit".
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

// A function that returns an integer.
fun sum(x: Int, y: Int): Int {
    return x + y
}

// A single-expression function that returns an integer (inferred).
fun multiply(x: Int, y: Int) = x * y

// Class used to demonstrate "infix function"
class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    // The containing class becomes the first parameter.
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }
}