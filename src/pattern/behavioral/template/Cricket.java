 package pattern.behavioral.template;

 /**
 * @author xiang
 * @date 2018/12/14
 */
 public class Cricket extends Game {
     
     @Override
     void endPlay() {
        System.out.println("Cricket Game Finished!");
     }
   
     @Override
     void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
     }
   
     @Override
     void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
     }
  }