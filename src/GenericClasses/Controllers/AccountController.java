package GenericClasses.Controllers;

import GenericClasses.Domain.Person;
import GenericClasses.Domain.PersonComparator;
import GenericClasses.Domain.Teacher;

import java.util.Collections;
import java.util.List;

/**
 * Класс, предоставляющий статические методы для управления данными.
 */
public class AccountController {
    /**
     * Метод выплаты зарплаты сотруднику типа Teacher.
     *
     * @param person     Сотрудник типа Teacher
     * @param paySalary  Сумма зарплаты для выплаты
     * @param <T>        Тип сотрудника, расширяющий класс Teacher
     */
    public static <T extends Teacher> void paySalary(T person, int paySalary) {
        System.out.printf("%s выплачено %d рублей%n", person.getName(), paySalary);
    }

    /**
     * Метод вычисления среднего возраста для списка объектов, расширяющих класс Person.
     *
     * @param persons    Список объектов типа Person или его подклассов
     * @param <T>        Тип имени объекта
     * @return           Средний возраст
     */
    public static <T extends Person<?, ? extends Number>> double averageAge(List<T> persons) {
        if (persons.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (T person : persons) {
            sum += person.getAge().doubleValue();
        }
        return sum / persons.size();
    }
    /**
     * Метод для сортировки списка объектов Person и его подклассов по имени.
     *
     * @param persons    Список объектов типа Person или его подклассов
     * @param <T>        Тип имени объекта
     * @param <V>        Тип возраста объекта, расширяющего Number
     */
    public static <T extends Comparable<T>, V extends Number> void sortedPersons(List<? extends Person<T, V>> persons) {
        Collections.sort(persons, new PersonComparator<>());
    }
}