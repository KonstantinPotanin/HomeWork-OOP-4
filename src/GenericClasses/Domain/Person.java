package GenericClasses.Domain;

/**
 * Базовый класс для представления участников учебного заведения
 */
public class Person<T extends Comparable<T>, V extends Number> {
    // Поля
    private T name;        // Имя человека
    private V age;           // Возраст человека

    /**
     * Конструктор
     * @param name  Имя человека
     * @param age   Возраст человека
     */
    public Person(T name, V age) {
        this.name = name;
        this.age = age;
    }

    // Методы
    /**
     * @return Возвращает значение имени человека
     */
    public T getName() {
        return name;
    }

    /**
     * @param name Позволяет установить значение имени человека
     */
    public void setName(T name) {
        this.name = name;
    }

    /**
     * @return Возвращает значение возраста человека
     */
    public V getAge() {
        return age;
    }

    /**
     * @param age Позволяет установить значение возраста человека
     */
    public void setAge(V age) {
        this.age = age;
    }

    /**
     * Переопределяет метод toString
     */
    @Override
    public String toString() {
        return String.format("Name: %s; Age: %d;", getName(), getAge());
    }
}