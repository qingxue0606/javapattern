 package pattern.creational.builder;

 /**
 * @author xiang
 * @date 2018/12/15
 */
 public abstract class ColdDrink implements Item {
     
     @Override
     public Packing packing() {
        return new Bottle();
     }
  
 }