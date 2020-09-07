package AquariumPt2

data class Fish(var name: String)

fun main(args: Array<String>){
    fishFn()
}

fun fishFn(){
    val fish = Fish("splashy")

    myWith(fish.name){
       println(capitalize())
    }

    println(fish.let {it.name.capitalize()}.let{it + "fish"}.let{it.length}.let{it + 31})
}

fun myWith(name: String, block: String.() -> Unit){
    name.block()
}