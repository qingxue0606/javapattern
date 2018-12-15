package pattern.behavioral.command;

/**
* @author xiang
* @date 2018/12/15
*/
public class CommandPatternDemo {
    public static void main(String[] args) {
        //这个是股票，
        Stock abcStock = new Stock();
        //两个命今
        Order buyStockOrder = new BuyStock(abcStock);
        Order sellStockOrder = new SellStock(abcStock);
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }

}
