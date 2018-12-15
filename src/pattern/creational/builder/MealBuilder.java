package pattern.creational.builder;

/**
* @author xiang
* @date 2018/12/15
*/
public class MealBuilder {
    //这个就是一个建造者
    //如果有建一个meal 需要建很多item 
    //meal中有关于item的遍历的方法
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
