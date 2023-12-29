package GenericClasses.Domain;

import java.util.Comparator;

/**
 * Класс для сравнения объектов типа Person по их именам.
 *
 * @param <T> Тип имени объекта Person
 * @param <V> Тип возраста объекта Person, расширяющий Number
 */
public class PersonComparator<T extends Comparable<T>, V extends Number> implements Comparator<Person<T, V>> {
    /**
     * Переопределенный метод для сравнения объектов типа Person по их именам.
     *
     * @param person1 Первый объект для сравнения
     * @param person2 Второй объект для сравнения
     */
    @Override
    public int compare(Person<T, V> person1, Person<T, V> person2) {
        return person1.getName().compareTo(person2.getName());
    }
}
