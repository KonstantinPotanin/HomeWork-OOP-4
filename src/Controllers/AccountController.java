package Controllers;

import Domain.Person;
import Domain.PersonComparator;
import Domain.Teacher;

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
    public static  <T extends Teacher> void paySalary(T person, int paySalary) {
        System.out.printf("%s выплачено %d рублей", person.getName(), paySalary);
    }

    /**
     * Метод вычисления среднего возраста для списка объектов, расширяющих класс Person.
     *
     * @param persons    Список объектов типа Person или его подклассов
     * @param <T>        Тип имени объекта
     * @return           Средний возраст
     */
    public static <T extends Person> double averageAge(List<T> persons) {
        if (persons.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (T person : persons) {
            sum += person.getAge();
        }
        return sum / persons.size();
    }

    /**
     * Метод для сортировки списка объектов Person и его подклассов по имени.
     *
     * @param persons    Список объектов типа Person или его подклассов
     * @param <T>        Тип имени объекта
     */
    public static <T extends Person> List<T> sortedPersons(List<T> persons) {
        if (persons.isEmpty()) {
            System.out.println("The list is empty.");
            return persons;
        }
        PersonComparator<T> personComparator = new PersonComparator<>();
        persons.sort(personComparator);
        return persons;
    }
}
