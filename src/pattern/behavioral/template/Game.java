 package pattern.behavioral.template;

 /**
 * @author xiang
 * @date 2018/12/14
 */
 public abstract class Game {
     abstract void initialize();
     abstract void startPlay();
     abstract void endPlay();
   /**
    * 模板建好了，实现类自己的方法，自己写，流程定义好的。
    * 领导干流程，员工写实现
    */
     //模板
     public final void play(){
   
        //初始化游戏
        initialize();
   
        //开始游戏
        startPlay();
   
        //结束游戏
        endPlay();
     }
  }