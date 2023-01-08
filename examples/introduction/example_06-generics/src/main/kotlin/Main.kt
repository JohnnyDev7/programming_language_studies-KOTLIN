// **********
// GENERICS
// **********

fun main() {
    val stack = MutableStack(0.62, 3.14, 2.7)
    stack.push(9.87)
    println(stack)

    println("peek(): ${stack.peek()}")
    println(stack)

    for (i in 1..stack.size()) {
        println("pop(): ${stack.pop()}")
        println(stack)
    }

    val stackFun = mutableStackOf(0.62, 3.14, 2.7)
    println(stackFun)
}

// -------------------------------------------------------------------
// Generic Classes
// -------------------------------------------------------------------
// Defines a generic class "MutableStack<E>" where "E" is called the generic type parameter.
// At use-site, it is assigned to a specific type such as "Int" by declaring a "MutableStack<Int>".
class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    // Inside the generic class, "E" can be used as a parameter like any other type.
    fun push(element: E) = elements.add(element)

    // You can also use "E" as a return type.
    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

// -------------------------------------------------------------------
// Generic Functions
// -------------------------------------------------------------------
fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)