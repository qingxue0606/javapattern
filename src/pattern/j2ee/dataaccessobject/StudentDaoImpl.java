package pattern.j2ee.dataaccessobject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiang
 * @date 2018/12/18
 */
public class StudentDaoImpl implements StudentDao {
    // 列表是当作一个数据库
    List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<Student>();
        Student student1 = new Student("Robert", 0);
        Student student2 = new Student("John", 1);
        students.add(student1);
        students.add(student2);
    }

    /** (non-Javadoc)
     * @see pattern.j2ee.dataaccessobject.StudentDao#getAllStudents()
     */
    // 从数据库中检索学生名单
    @Override
    public List<Student> getAllStudents() {
        // TODO Auto-generated method stub
        return students;
    }

    /** (non-Javadoc)
     * @see pattern.j2ee.dataaccessobject.StudentDao#getStudent(int)
     */
    @Override
    public Student getStudent(int rollNo) {
        // TODO Auto-generated method stub
        return students.get(rollNo);
    }

    /** (non-Javadoc)
     * @see pattern.j2ee.dataaccessobject.StudentDao#updateStudent(pattern.j2ee.dataaccessobject.Student)
     */
    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");

    }

    /** (non-Javadoc)
     * @see pattern.j2ee.dataaccessobject.StudentDao#deleteStudent(pattern.j2ee.dataaccessobject.Student)
     */
    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");

    }

}
