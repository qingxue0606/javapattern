 package pattern.behavioral.nullobject;
//空对象的类
 public class NullCustomer  extends AbstractCustomer {

    @Override
    public boolean isNil() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "Not Available in Customer Database";
    }

}
