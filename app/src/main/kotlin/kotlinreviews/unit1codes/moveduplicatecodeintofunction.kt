/*
Move duplicate code into a function
Create a function that prints out the weather details for the city of Ankara after the main() function.
For the function name, you can use printWeatherForCity() or something similar.

Call the function from the main() function.
The program should print the weather details for Ankara.


fun main() {
    printWeatherForCity()
}

fun printWeatherForCity() {
    println("City: Ankara")
    println("Low temperature: 27, High temperature: 31")
    println("Chance of rain: 82%")
    println()
}
Now you can create another function that's more flexible so that it can print weather details for other cities.

Replace the Ankara-specific parts of the println() statements with variables.
Remember to use camel case convention for the variable names and the $ symbol before the variable so that the value of the variable gets used instead of the variable name. These are string templates which you learned about in an earlier codelab.


fun printWeatherForCity() {
    println("City: $cityName")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceOfRain%")
    println()
}
Change the function definition so that those variables are parameters that must be passed into the function when it's called and specify the data type for each parameter.
The cityName parameter is of String type, while the lowTemp, highTemp, and chanceOfRain parameters are of Int type.

There's no return value needed in the function definition because the messages are printed to the output.


fun printWeatherForCity(cityName: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    println("City: $cityName")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceOfRain%")
    println()
}
Update the main() function to call the printWeatherForCity() function and pass in the weather details for Ankara.
The city name is "Ankara", the low temperature is 27, the high temperature is 31, and the chance of rain is 82.


fun main() {
    printWeatherForCity("Ankara", 27, 31, 82)
}

fun printWeatherForCity(cityName: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    println("City: $cityName")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceOfRain%")
    println()
}
Run the program to verify that the output shows the weather details for Ankara.
Call the printWeatherForCity() function with the weather details for the other cities.
*/

fun main() {
    printWeatherForCity("Ankara", 27, 31, 82)
    printWeatherForCity("Tokyo", 32, 36, 10)
    printWeatherForCity("Cape Town", 59, 64, 2)
    printWeatherForCity("Guatemala City", 50, 55, 7)
}

fun printWeatherForCity(cityName: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    println("City: $cityName")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceOfRain%")
    println()
}

/*
8. Run the program.
It should print the same output as the original program, but now your code is more concise and doesn't contain unnecessary repetition! All the code for printing weather details of a city is centralized in a single place: the printWeatherForCity() function. If you ever want to change how weather details are displayed, 
you can change them in a single place that applies to all the cities.
*/