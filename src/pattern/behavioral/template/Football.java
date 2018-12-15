 package pattern.behavioral.template;

 /**
 * @author xiang
 * @date 2018/12/14
 */
 public class Football extends Game {
     
     @Override
     void endPlay() {
        System.out.println("Football Game Finished!");
     }
   
     @Override
     void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
     }
   
     @Override
     void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
     }
  }