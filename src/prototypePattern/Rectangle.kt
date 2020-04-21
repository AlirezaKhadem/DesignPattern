package prototypePattern

class Rectangle(id: String, type: String = "Rectangle") : Shape(id, type) {
    override fun draw() {
        TODO("Not yet implemented")
        println("inside Rectangle ::draw() method")
    }

}