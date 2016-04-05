package bean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
@ManagedBean
public class StudentDataUtil implements Serializable{
    private List<Student> students;

    public StudentDataUtil() {
        loadSampleData();
    }

    private void loadSampleData() {
        students = new ArrayList<>();
        students.add(new Student("Mary","Public","mary@luv2code.com"));
        students.add(new Student("John","Doe","john@luv2code.com"));
        students.add(new Student("Ajay","Rao","ajay@luv2code.com"));
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
