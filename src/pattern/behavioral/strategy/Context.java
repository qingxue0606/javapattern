 package pattern.behavioral.strategy;

 /**
 * @author xiang
 * @date 2018/12/14
 */
public class Context {
    /**
     * 些处为策略模式的核心代码
     * 1要有自己的策略参数
     * 2要有构造方法上传入策略
     * 3 自己的核心方法上，跟据不同的策略执行不同的行为
     */
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
     }
    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
     }
}
