package adapterPattern

class VlcPlayer : AdvanceMediaPlayer {

    override fun playVlc(fileName: String) {
        println(("playing vlc file. name: $fileName"))
    }

    override fun playMp4(fileName: String) {
        TODO("Not yet implemented")
    }

}