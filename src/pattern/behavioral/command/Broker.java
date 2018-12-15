 package pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiang
 * @date 2018/12/15
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>(); 
    //一系列的方法
    //不继的增中方法
    public void takeOrder(Order order){
        orderList.add(order);      
     }
    //分别执行一系列的方汉
    public void placeOrders(){
        for (Order order : orderList) {
           order.execute();
        }
        orderList.clear();
     }

}
