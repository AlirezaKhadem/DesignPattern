package adapterPattern

class Mp4Player : AdvanceMediaPlayer {
    override fun playVlc(fileName: String) {
        //do nothing
    }

    override fun playMp4(fileName: String) {
        println("playing mp4 file. name : $fileName")
    }

}