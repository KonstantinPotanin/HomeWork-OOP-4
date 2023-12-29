package Domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс, представляющий, поток учащихся в учебном заведении
 * подключает интерфейс Iterable с типом данных StudentGroup, для возможности перебирать элементы коллекции
 */
public class StudentSteam implements Iterable<StudentGroup>{
    private int streamNumber;                   // Номер потока
    private List<StudentGroup> studentGroups;   // Список групп

    /**
     * Конструктор
     * @param streamNumber          Номер потока
     * @param studentGroups         Список групп
     */
    public StudentSteam(int streamNumber, List<StudentGroup> studentGroups) {
        this.streamNumber = streamNumber;
        this.studentGroups = studentGroups;
    }


    // Методы
    /**
     * Возвращает значение номера учебного потока
     */
    public int getStreamNumber() {
        return streamNumber;
    }


    /**
     * Метод для установки значения номера группы
     */
    public void setStreamNumber(int streamNumber) {
        this.streamNumber = streamNumber;
    }

    /**
     * Возвращает значение списка студенческих групп
     */
    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    /**
     * Переопределяет метод toString, выводит значение номера потока, количество групп, номер группы, количество учащихся и список студентов
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Stream number: %d;\nNumber of groups: %d\n\n", getStreamNumber(), studentGroups.size()));
        for (StudentGroup group : studentGroups) {
            result.append(group.toString()).append("\n");
        }
        return result.toString();
    }

    /**
     * Реализует доступ к студентам внутри группы.
     * Логика прописана в классе StudentGroupIterator
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentGroupIterator(studentGroups);
    }
}
