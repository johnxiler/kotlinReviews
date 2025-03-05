/*
String templates
The compilation errors are the result from the assignment of the discountPercentage and
offer read-only variables to new values; this assignment isn't allowed.
*/

fun main() {
    val discountPercentage = 20
    val item = "Google Chromecast"
    val offer = "Sale  - Up to $discountPercentage% discount off $item! Hurry Up!"

    println(offer)
}

/*
As an alternative solution, you could declare the discountPercentage integer and offer string with the var keyword. 
However, their values are immutable in the context of the program, so you can stick with the val keyword.
*/