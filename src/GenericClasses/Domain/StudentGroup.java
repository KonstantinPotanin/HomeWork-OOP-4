package GenericClasses.Domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс, представляющий группу студентов в учебном заведении.
 *
 * @param <T> Тип имени студента
 * @param <V> Тип возраста студента, расширяющий Number
 */
public class StudentGroup<T extends Comparable<T>, V extends Number> implements Iterable<Student<T, V>> {
    private V numberGroup;                      // Идентификатор группы студентов
    private List<Student<T, V>> students;      // Список студентов в группе


    /**
     * Конструктор для создания объекта StudentGroup с указанным списком студентов и идентификатором группы.
     *
     * @param group   Список студентов в группе
     * @param idGroup Идентификатор группы
     */
    public StudentGroup(List<Student<T, V>> group, V idGroup) {
        this.students = group;
        this.numberGroup = idGroup;
    }

    /**
     * Метод для получения списка студентов в группе.
     *
     * @return Список студентов в группе
     */
    public List<Student<T, V>> getStudents() {
        return students;
    }

    /**
     * Метод для установки нового списка студентов в группу.
     *
     * @param students Новый список студентов
     */
    public void setStudents(List<Student<T, V>> students) {
        this.students = students;
    }

    /**
     * Метод для получения идентификатора группы студентов.
     *
     * @return Идентификатор группы студентов
     */
    public V getNumberGroup() {
        return numberGroup;
    }

    /**
     * Метод для установки нового идентификатора группы студентов.
     *
     * @param numberGroup Новый идентификатор группы
     */
    public void setNumberGroup(V numberGroup) {
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
     * Переопределенный метод iterator для поддержки итерации по студентам в группе.
     *
     * @return Итератор, позволяющий перебирать студентов в группе
     */
    @Override
    public Iterator<Student<T, V>> iterator() {
        return new StudentIterator<>(students);
    }
}
