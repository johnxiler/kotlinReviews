/*
String concatenation
Step 1
The program prints this output:


The total party size is: 2030 
This was a trick question. When the + operator is used on String values, it produces a concatenated string. 
The integers are wrapped in double quotation marks, so they're treated as strings instead of integers, hence the output of 2030.

Step 2
You could remove the double quotation marks around the numberOfAdults and numberOfKids variables to convert them to Int variables.
*/

fun main() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

/*
If you remember, the Kotlin compiler can infer the type of variables based on the values assigned to them. In this case, 
the compiler infers that the numberOfAdults and numberOfKids variables are Int types.
*/