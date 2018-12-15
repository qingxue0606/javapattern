 package pattern.structural.adapter;

 /**
 * @author xiang
 * @date 2018/12/15
 */
public class Mp4Player implements AdvancedMediaPlayer{

    /** (non-Javadoc)
     * @see pattern.structural.adapter.AdvancedMediaPlayer#playVlc(java.lang.String)
     */
    @Override
    public void playVlc(String fileName) {
        //什么也不做
         
    }

    /** (non-Javadoc)
     * @see pattern.structural.adapter.AdvancedMediaPlayer#playMp4(java.lang.String)
     */
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);      
         
    }

}
