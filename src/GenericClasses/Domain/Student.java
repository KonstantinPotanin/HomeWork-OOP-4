package GenericClasses.Domain;

/**
 * Класс, представляющий учащегося в учебном заведении.
 *
 * @param <T> Тип имени учащегося
 * @param <V> Тип возраста учащегося, расширяющий Number
 */
public class Student<T extends Comparable<T>, V extends Number> extends Person<T, V>  {

    private int id;                     // идентификационный номер учащегося
    private static int generalId = 1;       // генератор уникального идентификационного номера

    /**
     * Конструктор для создания объекта Student с указанным именем и возрастом.
     *
     * @param name Имя учащегося
     * @param age  Возраст учащегося
     */
    public Student(T name, V age) {
        super(name, age);
        this.id = generalId++;
    }

    /**
     * @return Возвращает значение идентификационного номера учащегося
     */
    public int getId() {
        return id;
    }

    /**
     * Переопределяет метод toString, выводит значение имени, возраста идентификационный номер учащегося
     */
    @Override
    public String toString() {
        return super.toString() + String.format(" id: %d;", getId());
    }
}
