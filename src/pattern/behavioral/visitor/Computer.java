 package pattern.behavioral.visitor;

 public class Computer implements ComputerPart {
     ComputerPart[] parts;
     public Computer(){
         parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};      
      } 

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        //自己有什么，就让访客用什么，前提是访客要能访问这个设备
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
         }
         computerPartVisitor.visit(this);
         
    }

}
