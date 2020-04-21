package adapterPattern

import com.sun.jdi.InvalidTypeException

class MediaAdapter : MediaPlayer {

    var advanceMediaPlayer: AdvanceMediaPlayer

    constructor(audioType: String){
        advanceMediaPlayer = when {
            audioType.equals("vlc") -> {
                VlcPlayer()
            }
            audioType.equals("mp4") -> {
                Mp4Player()
            }
            else -> {
                throw InvalidTypeException()
            }
        }
    }

    override fun play(audioType: String, fileName: String) {
        if (audioType.equals("vlc")) {
            advanceMediaPlayer.playVlc(fileName)
        } else {
            advanceMediaPlayer.playMp4(fileName)
        }
    }
}