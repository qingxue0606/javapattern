package pattern.behavioral.command;

/**
* @author xiang
* @date 2018/12/15
*/
public class SellStock   implements Order{
    private Stock abcStock;
  //buyStock 调用的是卖的方法
    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }
    @Override
    public void execute() {
        abcStock.sell();
    }
}
