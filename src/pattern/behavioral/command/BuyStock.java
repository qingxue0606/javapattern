 package pattern.behavioral.command;

 /**
 * @author xiang
 * @date 2018/12/15
 */
public class BuyStock  implements Order {
    //buyStock 调用的是买的方法
    private Stock abcStock;
    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
     }
    @Override
    public void execute() {
        abcStock.buy();
         
    }

}
