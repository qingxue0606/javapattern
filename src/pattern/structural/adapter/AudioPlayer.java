package pattern.structural.adapter;

/**
* @author xiang
* @date 2018/12/15
*/
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    /** (non-Javadoc)
     * @see pattern.structural.adapter.MediaPlayer#play(java.lang.String, java.lang.String)
     */
    @Override
    public void play(String audioType, String fileName) {
        // 播放 mp3 音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        // mediaAdapter 提供了播放其他文件格式的支持 ，需要适配器
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            /**
             * 核心代码，适配器在这里使用
             * mediaAdapter与AudioPlayer 实现一个接口
             */
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }

    }
}
