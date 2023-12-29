package Domain;

/**
 * Класс, представляющий работника в системе.
 */
public class Employee extends Person{
    private String specialty;       // Специальность

    /**
     * Конструктор
     *
     * @param name      Имя сотрудника
     * @param age       Возраст сотрудника
     * @param special Специальность сотрудника
     */
    public Employee(String name, int age, String special) {
        super(name, age);
        this.specialty = special;
    }
}
