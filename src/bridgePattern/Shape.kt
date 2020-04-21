package bridgePattern

abstract class Shape(protected var drawAPI: DrawAPI) : Cloneable {

    abstract fun draw()

    public override fun clone(): Any {
        return super.clone()
    }



}