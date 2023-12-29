package GenericClasses.Domain;

/**
 * Класс, представляющий работника в системе.
 */
public class Employee<T extends Comparable<T>, V extends Number, W> extends Person<T, V> {
    // Поле
    private W specialty; // Специальность

    /**
     * Конструктор
     *
     * @param name      Имя сотрудника
     * @param age       Возраст сотрудника
     * @param specialty Специальность сотрудника
     */
    public Employee(T name, V age, W specialty) {
        super(name, age);
        this.specialty = specialty;
    }

    /**
     * @return Возвращает значение специальности сотрудника
     */
    public W getSpecialty() {
        return specialty;
    }

    /**
     * @param specialty Позволяет установить значение специальности сотрудника
     */
    public void setSpecialty(W specialty) {
        this.specialty = specialty;
    }

    /**
     * Переопределенный метод toString
     */
    @Override
    public String toString() {
        return String.format("Name: %s; Age: %s; Specialty: %s;", getName(), getAge(), getSpecialty());
    }
}