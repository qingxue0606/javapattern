 package pattern.j2ee.mvc;

 /**
 * @author xiang
 * @date 2018/12/18
 */
public class StudentController {
    //controller层是连接view与model的关键，
    //利用model来处理业务，
    //返回view来展示数据
    private Student model;
    private StudentView view;
    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
     }
    
    public void setStudentName(String name){
        model.setName(name);    
     }
    public String getStudentName(){
        return model.getName();    
     }
    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);      
     }
    public String getStudentRollNo(){
        return model.getRollNo();     
     }
    
    public void updateView(){           
        view.printStudentDetails(model.getName(), model.getRollNo());
     }  
    

}
