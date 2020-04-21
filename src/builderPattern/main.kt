package builderPattern

fun main(args: Array<String>) {

    var vegMeal = MealBuilder().prepareVegMeal()
    var nonVegMeal = MealBuilder().prepareNonVegMeal()

    vegMeal.showItems()
    println(vegMeal.getCost())

    nonVegMeal.showItems()
    println(nonVegMeal.getCost())


}

