package Aquarium.Decorations

fun main(args: Array<String>){
    makeDecorations()
}

fun makeDecorations() {

    val d1 = Decorations("granite")
    val d2 = Decorations("slate")
    val d3 = Decorations("marble")


}

object AnchorDecoration{
    val Decorations = "Anchor"
}

data class Decorations (val rocks: String){

}
data class Decorations2 (val rocks: String, val wood: String, val diver: String){

}