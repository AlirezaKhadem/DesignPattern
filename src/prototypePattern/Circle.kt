package prototypePattern

class Circle(id: String, type: String = "Circle") : Shape(id, type) {

    override fun draw() {
        TODO("Not yet implemented")
        println("inside Circle ::draw() method")
    }
}