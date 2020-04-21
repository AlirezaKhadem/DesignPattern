package prototypePattern

fun main(args: Array<String>) {

    val shapeCache = ShapeCache()
    shapeCache.loadCache()


    var shape : Shape = shapeCache.getShape("1")
    println(shape.getType())

    shape = shapeCache.getShape("2")
    println(shape.getType())

    shape = shapeCache.getShape("3")
    println(shape.getType())


}