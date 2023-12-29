package Domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс, представляющий, группу учащихся в учебном заведении
 * подключает интерфейсы:
 * Iterable с типом данных Student, для возможности перебирать элементы коллекции
 * Comparable с типом данных StudentGroup для возможности сортировки групп по количеству учащихся и номеру группы
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>{
    // Поля
    private int numberGroup;            // Номер учебной группы
    private List<Student> students;     // Список учащихся группы

    /**
     * Конструктор
     * @param numberGroup   Номер учебной группы
     * @param students      Список учащихся группы
     */
    public StudentGroup(int numberGroup, List<Student> students) {
        this.numberGroup = numberGroup;
        this.students = students;
    }

    // Методы
    /**
     * @return Возвращает значение номера учебной группы
     */
    public int getNumberGroup() {
        return numberGroup;
    }

    /**
     * @param numberGroup Позволяет установить значение номера группы
     */
    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    /**
     * @return Возвращает значение количества учащихся в группе
     */
    public int getSizeStudentGroup() {
        return students.size();
    }


    /**
     * Переопределяет метод toString, выводит значение идентификатора группы, количества студентов и список студентов
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("id group: %d, Number of students: %d; Students list:\n", getNumberGroup(), getSizeStudentGroup()));
        for (Student student : students) {
            result.append(student).append("\n");
        }
        return result.toString();
    }

    /**
     * Реализует доступ к студентам внутри группы.
     * Логика прописана в классе StudentIterator
     */
    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(students);
    }

    /**
     * Переопределяет метод compareTo
     * @param o объект, подлежащий сравнению
     * сравнивает сначала значение количества участников группы, затем значение номера группы
     */
    @Override
    public int compareTo(StudentGroup o) {
        if (getSizeStudentGroup() < o.getSizeStudentGroup()) {
            return -1;
        } else if (getSizeStudentGroup() > o.getSizeStudentGroup()) {
            return 1;
        }
        if (getNumberGroup() < o.getNumberGroup()) {
            return -1;
        } else if (getNumberGroup() > o.getNumberGroup()) {
            return 1;
        }
        return 0;
    }
}
