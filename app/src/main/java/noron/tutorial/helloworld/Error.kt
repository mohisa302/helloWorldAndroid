package noron.tutorial.helloworld

// try - catch - finally - throw
fun main(args: Array<String>){
    try {
        val data = 10/5
        print(data)
    }
    catch(e:NullPointerException){
        println(e)
    } finally {
        println("block executed")
    }
    print("done")
}