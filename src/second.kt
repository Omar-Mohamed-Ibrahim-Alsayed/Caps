/*open class Car2(open val model: String, val color: String, private var speed: Int=0, val maxSpeed: Int=260){
    init{
        if (this.speed <0 || this.speed>this.maxSpeed){
            this.speed = 0
            println("invalid speed")
        }
    }

    fun changeSpeed(sp : Int){
        if (sp>0 && sp<maxSpeed)
            this.speed = sp
    }

    fun getSpeed(): Int {
        return this.speed
    }
}

fun main(){
    var c = Car("toyota","red")
    print("${c.model} ${c.color} ${c.getSpeed()} ${c.maxSpeed}")
}*/