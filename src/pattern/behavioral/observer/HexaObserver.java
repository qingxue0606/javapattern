 package pattern.behavioral.observer;

 /**
 * @author xiang
 * @date 2018/12/14
 */
 public class HexaObserver extends Observer{
     
     public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
     }
   
     @Override
     public void update() {
        System.out.println( "Hex String: " 
        + Integer.toHexString( subject.getState() ).toUpperCase() ); 
     }
  }