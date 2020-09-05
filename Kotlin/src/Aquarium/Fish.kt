package Aquarium

abstract class Fish{

    abstract val color: String

}

class Shark: Fish(), FishAction{

    override val color = "Grey"

    override fun eat(){
        println("Hunting for fish")
    }
}

class Bass: Fish(), FishAction{

    override val color = "Green"

    override fun eat(){
        println("Munching on algae")
    }
}

interface FishAction{
    fun eat()
}

