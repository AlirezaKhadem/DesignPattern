package builderPattern

open class ColdDrink(name: String, packing: Packing = Bottle(), price: Float) : Item(name, packing, price)