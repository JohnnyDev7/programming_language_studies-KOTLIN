// **********
// NULL SAFETY
// **********

fun main() {
    // Declares a non-"null" String variable.
    var neverNull: String = "This can't be null"
    // When trying to assign "null" to non-nullable variable, a compilation error is produced.
    //neverNull = null

    // Declares a nullable String variable.
    var nullable: String? = "You can keep a null here"
    // Sets the "null" value to the nullable variable. This is OK.
    nullable = null

    // When inferring types, the compiler assumes non-"null" for variables that are initialized with a value.
    var inferredNonNull = "The compiler assumes non-null"
    // When trying to assign "null" to a variable with inferred type, a compilation error is produced.
    //inferredNonNull = null

    // Declares a function with a non-"null" string parameter.
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    // Calls the function with a "String" (non-nullable) argument. This is OK.
    strLength(neverNull)
    // When calling the function with a "String?" (nullable) argument, a compilation error is produced.
    //strLength(nullable)]

    println(describeString(null))
}

// -------------------------------------------------------------------
// Working with Nulls
// -------------------------------------------------------------------
// A function that takes in a nullable string and returns its description.
fun describeString(maybeString: String?): String {
    // If the given string is not "null" and not empty, return information about its length.
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
        // Otherwise, tell the caller that the string is empty or null.
    } else {
        return "Empty or null string"
    }
}