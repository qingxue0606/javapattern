 package pattern.behavioral.visitor;

 public interface  ComputerPartVisitor {
     //主人家有没有我们不用管，我们客户会就好，留着有时候用 ，新出一个设备，这就要会用这个设备
     public void visit(Computer computer);
     public void visit(Mouse mouse);
     public void visit(Keyboard keyboard);
     public void visit(Monitor monitor);

}
