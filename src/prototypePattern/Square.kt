package prototypePattern

class Square(id: String, type: String = "Square") : Shape(id, type) {


    override fun draw() {
        TODO("Not yet implemented")
        println("inside Square ::draw() method")
    }

}