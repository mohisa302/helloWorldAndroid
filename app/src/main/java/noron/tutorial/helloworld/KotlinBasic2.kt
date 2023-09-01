package noron.tutorial.helloworld

fun main() {


    /* Cast */
    val location: Any="Kotlin"
    val safeString: String? = location as? String
    val safeInt: Int? = location as? Int


    /* Nested class */
    //Static -> accessibility without creating object (inner class)
    //OuterClass.NestedClass().add

    /* Visibility Modifiers */
    // public / private
    // internal -> visible only inside the module
    // open -> make class parent
    // protected -> visible to the base and derived class

    /* Lambda expression */
//    val sum  = {a:Int, b:Int -> println(a+b)}


    /* Functions of Arraylist */

    // open fun add -> add specific element
    // open fun clear() -> remove all elements from the collection
    // open fun get -> return the element at specified index in the list.
    // ArrayList(capacity: Int)
    // ArrayList(ele: Collection<E>)
    // open fun remove(ele)

//    val arrayList = ArrayList<String>() //empty
//    arrayList.add("One")
//    arrayList.add("Two")
//    for(i in arrayList) {
//        println(i)
//    }

    /* Iterator */
//    val itr = arrayList.iterator()
//    while (itr.hasNext()) {
//        println(itr.next())
//    }
//
//    println(arrayList.get(1))

}

