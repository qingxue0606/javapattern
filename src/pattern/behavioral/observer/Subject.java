package pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 1subject 是主人
 * 2选绑定观察者，用于察看主要的动作。
 * 3改变状态后，通知所有被绑定的实现对象要执行某个方法
 * 
 * 
 * @author xiang
 * @date 2018/12/14
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        /**
         * 这是观察都模式的核心代码
         */
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        /**
         * 这是观察都模式的核心代码
         */
        observers.add(observer);
    }

    public void notifyAllObservers() {
        /**
         * 这是观察都模式的核心代码
         */
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
