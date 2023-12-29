package Domain;

import java.util.Comparator;

/**
 * Класс для сравнения объектов типа Person по их именам.
 *
 * @param <T> Тип имени объекта Person
 */
public class PersonComparator<T extends Person> implements Comparator<T> {
    /**
     * Переопределенный метод для сравнения объектов типа Person по их именам.
     *
     * @param o1 Первый объект для сравнения
     * @param o2 Второй объект для сравнения
     */
    @Override
    public int compare(T o1, T o2) {
        if (o1.getName().compareTo(o2.getName()) == 0) {
            return 0;
        } else return o1.getName().compareTo(o2.getName());
    }
}
