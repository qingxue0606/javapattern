package pattern.structural.adapter;

/**
* @author xiang
* @date 2018/12/15
*/
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;
    /**
     * 核心代码，这个是个构造函数，
     * 这个表面上是实现了mediaplay接口，
     * 实际上，是通过advancedMediaPlay接口播放的。
     * 跟据不同的格式，创建不同的播放器
     * 在play方法上，执行的是别的接口的方法
     * 相当于不用再写实现类了。
     * @param audioType
     */
    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    /** (non-Javadoc)
     * @see pattern.structural.adapter.MediaPlayer#play(java.lang.String, java.lang.String)
     */
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        }

    }

}
