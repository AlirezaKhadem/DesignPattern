package bridgePattern

class Circle(drawAPI: DrawAPI, private var radius: Int, private var x: Int, private var y: Int) : Shape(drawAPI) {

`
    override fun draw() {
        this.drawAPI.drawCircle(radius, x, y )

    }
}