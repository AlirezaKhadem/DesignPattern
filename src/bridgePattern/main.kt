package bridgePattern

fun main(args: Array<String>) {

    val greenCircle = Circle(GreenCircle(), 500, 20, 20)
    val redCircle = Circle(RedCircle(), 300, 50, 50)


    greenCircle.draw()
    redCircle.draw()

}