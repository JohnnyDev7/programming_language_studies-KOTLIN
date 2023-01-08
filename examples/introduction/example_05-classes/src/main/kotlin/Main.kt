// **********
// CLASSES
// **********

fun main() {
    // Creates an instance of the class "Customer" via the default constructor. Note that there is no "new"
    // keyword in Kotlin.
    val customer = Customer()

    // Creates an instance of the class "Contact" using the constructor with two arguments.
    val contact = Contact(1, "mary@gmail.com")

    // Access the property "id".
    println(contact.id)
    // Updates the value of the property "email".
    contact.email = "jane@gmail.com"
}

// Creates a class named "Customer" without any properties or user-defined constructors.
// A non-parameterized default constructor is created by Kotlin automatically.
class Customer

// Declares a class with two properties: immutable "id" and mutable "email", and a constructor with two
// parameters, "id" and "email".
class Contact(val id: Int, var email: String)



