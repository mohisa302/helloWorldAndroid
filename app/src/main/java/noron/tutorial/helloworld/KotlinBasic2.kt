package noron.tutorial.helloworld

fun main() {
    /* Functions of Arraylist */
    // open fun add -> add specific element
    // open fun clear() -> remove all elements from the collection
    // open fun get -> return the element at specified index in the list.
    // ArrayList(capacity: Int)
    // ArrayList(ele: Collection<E>)
    // open fun remove(ele)

    val arrayList = ArrayList<String>() //empty
    arrayList.add("One")
    arrayList.add("Two")
    for(i in arrayList) {
        println(i)
    }

    /* Iterator */
    val itr = arrayList.iterator()
    while (itr.hasNext()) {
        println(itr.next())
    }

}

