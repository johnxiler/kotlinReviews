

import isWaterClean

open class WaterSupply(var needsProcessing: Boolean)

class Aquarium<out T: WaterSupply>(val waterSupply: T){
    // fun addWater() {
    //     check(!waterSupply.needsProcessing) { "water supply needs processing first" }
    //     println("adding water from $waterSupply")
    // }    
    fun addWater(cleaner: Cleaner<T>) {
        if (waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("water added")
    }
}

fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println("aquarium water is clean: ${!aquarium.waterSupply.needsProcessing}")
 }

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
    
 }
 
class FishStoreWater : WaterSupply(false)

class TapWaterCleaner : Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) =   waterSupply.addChemicalCleaners()
}

class LakeWaterCleaner : Cleaner<LakeWater> {
    override fun clean(waterSupply: LakeWater) = waterSupply.filter()
}

class LakeWater : WaterSupply(true) {  
   fun filter() {
       needsProcessing = false
   }
}

class DirtyWater : WaterSupply(true){
   fun filter() {
       needsProcessing = true
   }
}


fun genericsExample() {
    // val aquarium = Aquarium<TapWater>(TapWater())
    // println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    // addItemTo(aquarium)
    val cleaner = TapWaterCleaner()
    val aquarium = Aquarium(TapWater())
    aquarium.addWater(cleaner)
    isWaterClean(aquarium)
    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    val lakecleaner = LakeWaterCleaner()
    val aquarium2 = Aquarium(LakeWater())
    //println("Lake water needs processing: ${aquarium2.waterSupply.needsProcessing}")
    aquarium2.waterSupply.filter()
    isWaterClean(aquarium2)
    aquarium2.addWater(lakecleaner)
    println("water has been added from lake")
    aquarium2.waterSupply.filter()
    println("Lake water needs filtering: ${aquarium2.waterSupply.needsProcessing}")
    val aquarium3 = Aquarium(DirtyWater())
    println("dirty water needs processing: ${aquarium3.waterSupply.needsProcessing}")
    isWaterClean(aquarium3)
    aquarium3.waterSupply.filter()
    println("dirty water needs filtering: ${aquarium3.waterSupply.needsProcessing}")
    val aquarium4 = Aquarium(FishStoreWater())
    println("fish store water needs processing: ${aquarium4.waterSupply.needsProcessing}")
    isWaterClean(aquarium4)
}

fun main() {
    genericsExample()
}