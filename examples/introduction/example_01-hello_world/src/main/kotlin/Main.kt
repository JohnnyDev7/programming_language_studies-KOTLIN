/*
fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}
*/

// Kotlin code is usually difined in packages. Package specification
// is optional: If you don't specify a package in a source file,
// its content goes to the default package.
package org.kotlinlang.play

// An entry point to a Kotlin application is the "main" function.
// Since Kotlin 1.3, you can declare "main" without any parameters.
// The return type is not defined, which means that the function returns nothing.
fun main() {
    // "println"writes a line to the standard output. It is imported implicitly.
    // Also note that semicolons are optional.
    println("Hello, World!!!")
}

// In Kotlin versions earlier than 1.3, the "main" function must have a parameter of type "Array<String>"
/*
fun main(args: Array<String>) {
    println("Hello, World!!!")
}
*/