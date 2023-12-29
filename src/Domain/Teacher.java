package Domain;

/**
 * Класс, представляющий учителя в системе.
 */
public class Teacher extends Person{
    private String academDegree;        // Академическая степень учителя

    /**
     * Конструктор для создания объекта Teacher с указанным именем, возрастом и академической степенью.
     *
     * @param name         Имя учителя
     * @param age          Возраст учителя
     * @param academDegree Академическая степень учителя
     */
    public Teacher(String name, int age, String academDegree) {
        super(name, age);
        this.academDegree = academDegree;
    }

    /**
     * Переопределенный метод toString
     */
    @Override
    public String toString() {
        return super.toString() + String.format(" academic degree: %s", academDegree);
    }
}
