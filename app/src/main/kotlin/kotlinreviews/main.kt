package kotlinReviews

import java.util.*
// fun sum(a:Int, b:Int):Int {
    
//     return a / b
// }

// fun add(first:Int, second:Int) = first + second

fun main() {
//     val summedup = sum(67, 100)
//     println(summedup)
//     val added = add(45, 99)
//     added.toByte()
//     println(added)
//     val age = 25
//     println(age+25)
// //     var nem:String? = null //question mark(?) will used to indicate as null value
// //     val nim:Int? = null
// //     println(nem)
// //     println(nim)
//     val name: String? = null
//     val length: Int
//     length = name?.length ?: 0 //length, or 0 if name is null
//     //length = name?.length ?: return // length, or return when name is null
//     //length = name?.length ?: throw Error() //length, or throw error when name is null
//     println(length)
//     fun bigger(a:Int, b:Int) = if(a>b) a else b
//     val biggest = bigger(23, 25)
//     println(biggest)
//     val list = listOf(1,2.2,3.6,"4.4",5.3,"6.6")
//     for (element in list){
//         println(element)
//     }
// 	val list = listOf("A", "B", "C")
//     for (element in list) {
//         Log.d("MyApp", element)  // This will print to Android Logcat
//    	 }
//    	 
//when expression
// 	fun numberTypes(x:Number) = when(x){
//         0 -> "zero"
//         in 1..4 -> "four or less"
//         5,6,7 -> "5 to 7"
//         is Byte -> "Byte"
//         else -> "some number"
//     }
//     println(numberTypes(0))      // Output: "zero"
// 	println(numberTypes(3))      // Output: "four or less"
// 	println(numberTypes(6))      // Output: "5 to 7"
// 	println(numberTypes(10))     // Output: "some number"
// 	println(numberTypes(100.toByte()))  // Output: "Byte"
	
    handleApiResponse(200) // Output: "Success!"
    handleApiResponse(404) // Output: "Not Found. The resource could not be found."
    handleApiResponse(503) // Output: "Unknown error occurred."
    handleApiResponse(500) //Output: "Server Error. Please try again later."
    handleApiResponse(401) //Output: "Unauthorized. Please log in."
    handleApiResponse(400) //Output: Bad Request. Check the input.
    
    getUserPermissions("Admin")  // Output: "Full access to the app."
    getUserPermissions("Guest")  // Output: "Read-only access."
    getUserPermissions("User")   // Output: "Limited access to basic features."
    getUserPermissions("Unknown") // Output: "Unknown role, access denied."
    getUserPermissions("Premium") //Output: "Premium access to paid features."

	val temperature = 100
    val message = "The water temperature is ${ if (temperature > 50) "too hot" else "OK" }."
    println(message)
    
   val day = randomDay()
   println("Today is $day")
   
}

fun getUserPermissions(role: String) {
    val permissions = when(role) {
        "Admin" -> "Full access to the app."
        "User" -> "Limited access to basic features."
        "Guest" -> "Read-only access."
        "Premium" -> "Premium access to paid features."
        else -> "Unknown role, access denied."
    }
    println(permissions) // Displaying permissions based on user role
}
fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
	}
fun handleApiResponse(responseCode: Int) {
    val result = when (responseCode) {
        200 -> "Success!"
        400 -> "Bad Request. Check the input."
        401 -> "Unauthorized. Please log in."
        404 -> "Not Found. The resource could not be found."
        500 -> "Server Error. Please try again later."
        else -> "Unknown error occurred."
    	}
    	println(result) // In an Android app, you could display this message in a Snackbar or Toast.
}