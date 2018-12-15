package pattern.creational.builder;

/**
* @author xiang
* @date 2018/12/15
*/
public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
