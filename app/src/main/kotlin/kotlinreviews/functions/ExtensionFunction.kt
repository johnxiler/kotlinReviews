
fun main() {
    val age = 101
     println("Is legal age: ${isLegalAge(age)}")
     println("Is Centenarian age: ${age.isLegal()}")
     println("Is Legal: ${"Legal".isLegal()}")
     println("Is Illegal: ${"Illegal".isLegal()}")
}

// Normal function
fun isLegalAge(age: Int): Boolean {
    return age >= 18
}

// Extension function for Int
fun Int.isLegal(): Boolean {
    return this >= 100
}

// Extension function for String
fun String.isLegal(): Boolean {
    return this == "Legal"
}

// Extension function for List
fun List<String>.isLegal(): Boolean {
    return this.isNotEmpty()
}