package Services;

import Domain.PersonComparator;
import Domain.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements iPersonService<Student>{
    private int countStudents;
    private List<Student> studentsList;

    public StudentService() {
        studentsList = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return studentsList;
    }

    @Override
    public void create(String name, int age) {
        Student student = new Student(name, age);
        studentsList.add(student);
        countStudents++;
    }

        public void sortByFIO() {
        PersonComparator<Student> personComparator = new PersonComparator<>();
        studentsList.sort(personComparator);
    }
}
