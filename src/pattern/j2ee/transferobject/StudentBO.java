 package pattern.j2ee.transferobject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiang
 * @date 2018/12/18
 */
public class StudentBO {
  //列表是当作一个数据库
    List<StudentVO> students;
    public StudentBO(){
        students = new ArrayList<StudentVO>();
        StudentVO student1 = new StudentVO("Robert",0);
        StudentVO student2 = new StudentVO("John",1);
        students.add(student1);
        students.add(student2);    
     }
    public void deleteStudent(StudentVO student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " 
        + student.getRollNo() +", deleted from database");
     }
    public List<StudentVO> getAllStudents() {
        return students;
     }
   
     public StudentVO getStudent(int rollNo) {
        return students.get(rollNo);
     }
     public void updateStudent(StudentVO student) {
         students.get(student.getRollNo()).setName(student.getName());
         System.out.println("Student: Roll No " 
         + student.getRollNo() +", updated in the database");
      }
   

}
