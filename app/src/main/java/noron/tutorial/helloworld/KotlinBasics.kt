package noron.tutorial.helloworld

fun main() {
    // var=>mutable, val=>immutable
    // TODO: Add new function
    /* Data Types */
    //Long / Byte / Short / Int / Float / Double
    val myFloat: Float = 13.37F // more
    var isSunny: Boolean  = true
    isSunny = false
    val letterChar = 'A'
    val myStr = "Hello World"
    var firstChar = myStr[0] // last one: myStr.length - 1
    var myName = "Mohi"
    print("Hello "+ myName +"\nLast char: "+ firstChar)
}