 package pattern.structural.adapter;

 /**
 * @author xiang
 * @date 2018/12/15
 */
public class VlcPlayer implements AdvancedMediaPlayer{

    /** (non-Javadoc)
     * @see pattern.structural.adapter.AdvancedMediaPlayer#playVlc(java.lang.String)
     */
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);      
         
    }

    /** (non-Javadoc)
     * @see pattern.structural.adapter.AdvancedMediaPlayer#playMp4(java.lang.String)
     */
    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }

}
