 package pattern.structural.bridge;

 /**
  * 
  * shpe 定义了一个抽象的成员和一个抽象的方法
 * @author xiang
 * @date 2018/12/15
 */
public abstract class Shape {
    
    protected DrawAPI drawAPI;
    
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
     }
    
    public abstract void draw();  
}
