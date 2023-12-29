package GenericClasses.Domain;

/**
 * Класс, представляющий учителя в системе.
 */
public class Teacher<T extends Comparable<T>, V extends Number, W> extends Person<T, V> {
    // Поле
    private W academicDegree;  // Академическая степень учителя

    /**
     * Конструктор
     *
     * @param name          Имя учителя
     * @param age           Возраст учителя
     * @param academicDegree Академическая степень учителя
     */
    public Teacher(T name, V age, W academicDegree) {
        super(name, age);
        this.academicDegree = academicDegree;
    }

    /**
     * @return Возвращает значение академической степени учителя
     */
    public W getAcademicDegree() {
        return academicDegree;
    }

    /**
     * @param academicDegree Позволяет установить значение академической степени учителя
     */
    public void setAcademicDegree(W academicDegree) {
        this.academicDegree = academicDegree;
    }

    /**
     * Переопределенный метод toString
     */
    @Override
    public String toString() {
        return String.format("Name: %s; Age: %s; Academic Degree: %s;", getName(), getAge(), getAcademicDegree());
    }
}

