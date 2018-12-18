 package pattern.j2ee.dataaccessobject;

import java.util.List;

/**
 * @author xiang
 * @date 2018/12/18
 */
public  interface  StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);

}
