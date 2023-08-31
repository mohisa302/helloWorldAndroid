package noron.tutorial.helloworld

fun main() {
    /* Null references */
//    var name: String = "Mohi"
//      var nullName: String? = "Mohi"  // can assign null value
//       nullName = null
//    var len = nullName?.length  // if variable is not null return length, else return null
//
//    /* Methods */
//    nullName?.let { println(it.length) }
//      var name = nullName ?: "Guest"  // if it's null assign Guest
//      println("name is $name")
//      println(nullName!!.toLowerCase())

    /* Chain safe call */
//    val wifeAge: String? = user?.wife?.age ?: 0 // if  user -> wife -> age == null then assign 0




    // var=>mutable, val=>immutable
    // TODO: Add new function
;
    /* Data Types /=, +=, *= */
//     Long / Byte / Short / Int / Float / Double
//     val myFloat: Float = 13.37F // more
//     var isSunny: Boolean  = true
//     isSunny = false

    /* Operator */
//    val a = 5.0
//    val b = 3
//    var resultDouble: Double
//    resultDouble = a / b

    /* Comparison operators */
//    val isEqual = 5==3
//    println("isEqual is ${"isEqual"}")

    /* String */
//    val letterChar = 'A'
//    val myStr = "Hello World"
//    var firstChar = myStr[0] // last one: myStr.length - 1
//    var myName = "Mohi"
//    print("Hello "+ myName +"\nLast char: "+ firstChar)

    /* When */
//    var season = 3
//    when(season){
//        1 -> println("Spring")
//        2 -> println("Summer")
//        3-> {
//            println("fall")
//        }
//        else -> println("Invalid Season")
//    }

//    var month = 4
//    when (month){
//        in 3..5 -> println("oops")
//        !in 12 downTo 2 -> println("winter")
//        12, 1, 2 -> println("Winter")
//    }

    /* is */
//    var x : Any = 13.37 //don't know about type of data
//    when(x) {
//        is Int -> println("$x is Int")
//    }

    /* Do while execute once */
//    x = 15
//    do {
//        print("k")
//        x++
//    }while(x <= 10)
//    println("\ndo")

    /* loop */
//     for(i in 10 downTo 1 step 2 ){
//         print("$i")
//     }

//    for(num in 1..10){ //1 until 10
//        print("count")
//    }



}

//parameters
fun myFunction(a: Int, b:Int) : Int{
    return  a + b
}