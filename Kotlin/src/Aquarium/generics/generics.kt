package Aquarium.generics

open class WaterSupply(var needsProcessed: Boolean)

class TapWater: WaterSupply(true){
    fun addChemicalCleaners(){
        needsProcessed = false
    }
}

class DistilledWater: WaterSupply(false)

class LakeWater: WaterSupply(true){
    fun filter(){
        needsProcessed = false
    }
}

class Aquarium<T: WaterSupply>(val waterSupply: T){
    fun addWater(){
        check(!waterSupply.needsProcessed){"water supply needs to be processed"}
        println("adding water from $waterSupply")
    }
}

fun generic(){
    val aquarium = Aquarium<TapWater>(TapWater())
    aquarium.waterSupply.addChemicalCleaners()
    aquarium.addWater()
}

fun main(args: Array<String>){
    generic()
}