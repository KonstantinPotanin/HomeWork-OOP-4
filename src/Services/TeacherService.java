package Services;

import Domain.PersonComparator;
import Domain.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iPersonService<Teacher> {
    private int countTeacher;
    private List<Teacher> teacherList;

    public TeacherService() {
        teacherList = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }

    @Override
    public void create(String name, int age) {
        Teacher teacher = new Teacher(name, age, "Ассистент");
        countTeacher++;
        teacherList.add(teacher);
    }
    public void sortByFIO() {
        PersonComparator<Teacher> personComparator = new PersonComparator<>();
        teacherList.sort(personComparator);
    }
}
