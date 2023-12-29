package GenericClasses.Domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс для реализации логики доступа к учащимся в группе через подключение к интерфейсу Iterator
 */
public class StudentIterator<T extends Comparable<T>, V extends Number> implements Iterator<Student<T, V>> {
    private int count;                    // позиция в которой сейчас находимся
    private List<Student<T, V>> students;   // Список учащихся

    /**
     * Конструктор для создания итератора по списку студентов.
     *
     * @param students Список учащихся
     */
    public StudentIterator(List<Student<T, V>> students) {
        this.students = students;
        this.count = 0;
    }

    /**
     * Реализует проверку наличия следующего элемента коллекции
     */
    @Override
    public boolean hasNext() {
        return count < students.size();
    }

    /**
     * Реализует переход на следующий элемент коллекции
     */
    @Override
    public Student<T, V> next() {
        if (!hasNext()) {
            return null;
        }
        return students.get(count++);
    }
}

