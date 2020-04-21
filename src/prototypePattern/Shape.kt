package prototypePattern

abstract class Shape(private var id: String, private var type: String) : Cloneable {

    abstract fun draw()

    fun getId(): String {
        return this.id
    }

    fun getType(): String {
        return this.type
    }

    public override fun clone(): Any {
        return super.clone()
    }



}