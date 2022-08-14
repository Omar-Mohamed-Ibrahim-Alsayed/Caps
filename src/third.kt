interface Car{
    var model: String
    var color: String
    var speed: Int
    fun getFuelType(): String
}

class BMW(override var model: String, override var color: String, override var speed: Int) : Car {
    override fun getFuelType(): String {
        return "Petrol"
    }


}

class Tesla(override var model: String, override var color: String, override var speed: Int) : Car{
    override fun getFuelType(): String {
        return "Electric"
    }
}

fun main(){
    val c1 = BMW("m1","red",20)
    val c2 = Tesla("m2","blue",30)
    print(c1.getFuelType())
    print(c2.getFuelType())
}