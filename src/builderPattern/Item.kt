package builderPattern

open class Item(private var name: String, private var packing: Packing, private var price: Float) {


    fun getName(): String {
        return this.name
    }

    fun getPacking(): Packing {
        return this.packing
    }

    fun getPrice(): Float {
        return this.price
    }
}