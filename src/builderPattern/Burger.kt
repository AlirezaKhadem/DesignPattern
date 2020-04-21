package builderPattern

open class Burger(name: String = "Burger", packing: Packing = Wrapper(), price: Float) : Item(name, packing, price)