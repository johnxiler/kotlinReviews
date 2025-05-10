/*
Compare two numbers
Create a compareTime() function that accepts a timeSpentToday parameter and a timeSpentYesterday parameter, both of Int type, and returns a Boolean value.
The solution relies on the > comparison operator. The operator evaluates to a Boolean value, so the compareTime() function simply returns the result of timeSpentToday > timeSpentYesterday.

For example, if you pass a 300 argument to the timeSpentToday parameter and a 250 argument to the timeSpentYesterday parameter, the function body evaluates to 300 > 250, 
which returns a true value because 300 is greater than 250.
*/

fun main() {
    println("Have I spent more time using my phone today: ${compareTime(300, 250)}")
    println("Have I spent more time using my phone today: ${compareTime(300, 300)}")
    println("Have I spent more time using my phone today: ${compareTime(200, 220)}")
}

fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}

/*
Have I spent more time using my phone today: true
Have I spent more time using my phone today: false
Have I spent more time using my phone today: false
*/