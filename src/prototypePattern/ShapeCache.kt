package prototypePattern

class ShapeCache {

    private var shapeMap: HashMap<String, Shape> = HashMap()

    fun getShape(id: String): Shape {
        val cacheShape: Shape? = shapeMap[id]
        return cacheShape?.clone() as Shape
    }

    public fun loadCache() {

        val circle = Circle('1'.toString())
        val square = Square('2'.toString())
        val rectangle = Rectangle('3'.toString())

        shapeMap[circle.getId()] = circle
        shapeMap[square.getId()] = square
        shapeMap[rectangle.getId()] = rectangle

    }

}