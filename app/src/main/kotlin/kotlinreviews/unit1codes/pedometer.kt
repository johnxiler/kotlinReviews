/*
Pedometer
Function names and variable names should follow the camel case convention.

If the names contain multiple words, lowercase the first letter of the first word, capitalize the first letter of subsequent words, and remove any spaces between the words.

Example function names include:

calculateTip
displayMessage
takePhoto
Example variable names include:

numberOfEmails
cityName
bookPublicationDate
To learn more about names, see Naming rules.

Avoid using a Kotlin keyword as a function name because those words are already assigned specific meanings in the Kotlin language.

Your solution code should look something like this code snippet:
*/

fun main() {
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps)
    println("Walking $steps steps burns $caloriesBurned calories") 
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}