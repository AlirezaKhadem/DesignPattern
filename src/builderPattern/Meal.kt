package builderPattern

import java.util.*

class Meal {

    var items = LinkedList<Item>()

    fun addItem(item: Item) {
        items.add(item)
    }

    fun showItems() {
        for (item in items)
            println("${item.getName()}: ${item.getPrice()}$")
    }

    fun getCost(): Float {
        var sum: Float = 0.0f

        for (item in items) {
            sum = sum.plus(item.getPrice())
        }
        return sum
    }


}