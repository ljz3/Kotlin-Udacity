package Aquarium

fun main(args: Array<String>){
    buildAquarium()
    makeFish()
}

fun buildAquarium(){
    val myAquarium = Aquarium()

    myAquarium.height = 80
    printAquarium(myAquarium)

    val smallAquarium = Aquarium(15, 30, 20)
    printAquarium(smallAquarium)

    val myAquariumTwo = Aquarium(numberOfFish = 9)
    printAquarium(smallAquarium)

}

fun printAquarium(aquarium: Aquarium){
    println("Length: ${aquarium.length} "+
            "Width: ${aquarium.width} "+
            "Height: ${aquarium.height} "+
            "Volume: ${aquarium.volume}"
    )
}

fun feedFish(fish: FishAction){
    fish.eat()
}

fun makeFish(){
    val shark = Shark()
    val bass = Bass()
    println("Shark: ${shark.color}\nBass: ${bass.color}\n")
}