package noron.tutorial.helloworld

fun main() {
    var mohi = Person("Mohi","Sadeghi", 21 )
    var john = Person()
//    mohi.age = 98
    mohi.hobby = "to skateboard"
    john.hobby = "play video games"
    print( mohi.age)
}

class Person (firstName: String = "John", lastName: String = "Doe", age : Int = 0 ){
    var age : Int? = null
    var hobby : String = "watch Netflix "
    var firstName: String? = null
    var lastName: String? = null

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

    fun stateHobby(){
//        println("My hobby is $hobby")
    }


}
