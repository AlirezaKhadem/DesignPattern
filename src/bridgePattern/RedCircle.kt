package bridgePattern

class RedCircle :DrawAPI {
    override fun drawCircle(radius: Int, x: Int, y: Int) {
        println("draw RedCircle. radius: $radius , x: $x , y: $y")
    }
}