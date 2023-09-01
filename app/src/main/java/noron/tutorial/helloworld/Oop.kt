package noron.tutorial.helloworld

data class User(val id: Long, var name: String)
// abstract key word: should be overwritten by sub classes
//extend class
interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The driver is braking")
    }

}

fun main() {

    /* List */
    val mixedTypeList: List<Any> = listOf("Mohi", 1, 8)
    for(value in mixedTypeList) {
        if(value is Int)
            println("Int")
    }

    /* Smart Cast */
    val obj1: Any = "I have a dream"
    /* Cast to string*/
    val str1: String = obj1 as String
    val str2: String? = obj1 as? String  //safe


    /* User */
//    val user1 = User(1, "Denis")
//    val user2 = User(2 , "K0u9")
    // user.copy()
//    println(user1.equals(user2))

    /* Property */
//    println(user1.component1()) //id
//    val (id, name) = user2

    /* Person */
//    var mohi = Person("Mohi","Sadeghi", 21 )
//    var john = Person()
//    mohi.age = 98
//    mohi.hobby = "to skateboard"
//    john.hobby = "play video games"
//    print( mohi.age)
}

class Person (firstName: String = "John", lastName: String = "Doe", age : Int = 0 ){

    /* Initializer */
    var age : Int? = null
    var hobby : String = "watch Netflix "
    var firstName: String? = null
    var lastName: String? = null

    /* Getter and Setter */
    val myBrand: String = "BWM"
        get() {
            return field.toLowerCase()
        }

    var maxSpeed: Int = 200
//        private set  // only can change in class
        set(value){
            field = if(value > 0) value else throw IllegalAccessException("Max speed cannot be less than 0")
        }

//    constructor(firstName: String, lastName: String, age: Int)
//            : this(firstName, lastName){
//        this.age = age
//    }

    init {
       this.firstName = firstName
        this.lastName = lastName
        this.age = age
    }

//    fun stateAge() {
//        println("age:$age")
//    }

//    fun stateHobby(){
//        println("My hobby is $hobby")
//    }


}

//sub
open class Car(override val maxSpeed: Double, val name: String, val brand: String ):
    Drivable  {
   open var range: Double = 0.0

   fun extendRange(amount: Double){
       if(amount > 0)
           range += amount
   }

   open fun drive(distance: Double){
      println("Drove for $distance KM")
  }


    override fun drive(): String {
        return "Driving the interface"
    }

    // run parent brake
    override fun brake() {
        super.brake()
    }
}

//here we have access to all the methods and variables in car class
class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double ): Car(maxSpeed, name, brand){
    override var range = batteryLife * 7  //need open in original class
}
