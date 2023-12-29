package Domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс для реализации логики доступа к группам в учебном потоке через подключение к интерфейсу Iterator
 */
public class StudentGroupIterator implements Iterator<StudentGroup> {
    private int count;                          // позиция в которой сейчас находимся
    private List<StudentGroup> studentGroups;   // Список учебных групп

    /**
     * Конструктор
     * @param studentGroups     Список учебных групп
     */
    public StudentGroupIterator(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
        this.count = 0;
    }

    // Методы
    /**
     * Реализует проверку наличия следующего элемента коллекции
     */
    @Override
    public boolean hasNext() {
        return count < studentGroups.size();
    }

    /**
     * Реализует переход на следующий элемент коллекции
     */
    @Override
    public StudentGroup next() {
        return studentGroups.get(count++);
    }
}
