package pattern.structural.proxy;

/**
* @author xiang
* @date 2018/12/14
*/
public class BuyHouseProxy implements BuyHouse {
    private BuyHouse buyHouse;

    public BuyHouseProxy(final BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    /** (non-Javadoc)
     * @see javatest.pattern.proxy.BuyHouse#buyHosue()
     */
    @Override
    public void buyHosue() {
        System.out.println("买房前准备");
        buyHouse.buyHosue();
        System.out.println("买房后装修");

    }

}
