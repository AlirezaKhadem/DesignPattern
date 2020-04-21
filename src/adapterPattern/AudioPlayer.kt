package adapterPattern

class AudioPlayer : MediaPlayer {

    private lateinit var mediaPlayer: MediaPlayer


    override fun play(audioType: String, fileName: String) {
        if (audioType.equals("mp3")) {
            println("playing mp3 file. name : $fileName")
        } else {
            mediaPlayer = MediaAdapter(audioType)
            mediaPlayer.play(audioType, fileName)
        }
    }


}