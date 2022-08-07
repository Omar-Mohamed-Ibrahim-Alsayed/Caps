import java.util.*

fun main(){
    var names = mutableListOf<String>()
    println("please enter number of elements:")
    var N = Scanner(System.`in`).nextInt()

    println("please enter your values ")
    var last = ""
    for ( i in 0 until N){
        print("${i + 1} : ")
        last = readln()
        last = last.uppercase() //so we can avoid checking all cases (caps)
        names.add(last)
        N--
    }

    names = names.filter { it.contains("M") || it.contains("A") } as MutableList<String> //same list to save memory

    names.forEach(){
        println(it)
    }
}