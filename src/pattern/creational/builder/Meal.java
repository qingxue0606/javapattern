 package pattern.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiang
 * @date 2018/12/15
 */
public class Meal {
    //这个meal中没有构造方法，通过builder的方式去建对象
    private List<Item> items = new ArrayList<Item>();    
    public void addItem(Item item){
        items.add(item);
     }
    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
           cost += item.price();
        }        
        return cost;
     }
    public void showItems(){
        for (Item item : items) {
           System.out.print("Item : "+item.name());
           System.out.print(", Packing : "+item.packing().pack());
           System.out.println(", Price : "+item.price());
        }        
     }  

}
