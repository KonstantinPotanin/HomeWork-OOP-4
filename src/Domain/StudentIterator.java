package Domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс для реализации логики доступа к учащимся в группе через подключение к интерфейсу Iterator
 */
public class StudentIterator implements Iterator<Student> {
    private int count;                  // позиция в которой сейчас находимся
    private List<Student> students;     // Список учащихся

    /**
     * Конструктор
     * @param students      Список учащихся
     */
    public StudentIterator(List<Student> students) {
        this.students = students;
        count = 0;                  // позиция с которой начнет движение итератор
    }

    // Методы
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
    public Student next() {
        return students.get(count++);
    }
}
