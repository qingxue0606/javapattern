 package pattern.behavioral.observer;

 /**
 * @author xiang
 * @date 2018/12/14
 */
 public abstract class Observer {
     protected Subject subject;
     public abstract void update();
  }