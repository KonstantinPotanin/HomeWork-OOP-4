package GenericClasses;
import GenericClasses.Controllers.AccountController;
import GenericClasses.Domain.Employee;
import GenericClasses.Domain.Student;
import GenericClasses.Domain.Teacher;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Пример создания объектов
        Student<String, Integer> student4 = new Student<>("Victoria", 23);
        Student<String, Integer> student5 = new Student<>("Alexander", 21);
        Student<String, Integer> student6 = new Student<>("Evgenia", 22);

        Teacher<String, Integer, String> teacher1 = new Teacher<>("Галина", 30, "Доцент");
        Teacher<String, Integer, String> teacher2 = new Teacher<>("Ирина", 50, "Доцент");
        Teacher<String, Integer, String> teacher3 = new Teacher<>("Ярослав", 45, "Доцент");
        Teacher<String, Integer, String> teacher4 = new Teacher<>("Аркадий", 35, "Доцент");
        Teacher<String, Integer, String> teacher5 = new Teacher<>("Анна", 55, "Доцент");

        Employee<String, Integer, String> employee1 = new Employee<>("Иван", 60, "Сторож");
        Employee<String, Integer, String> employee2 = new Employee<>("Аркадий", 40, "Консьерж");
        Employee<String, Integer, String> employee3 = new Employee<>("Владимир", 53, "Электромонтер");

        // Пример списка объектов
        List<Student<String, Integer>> students = new ArrayList<>();
        students.add(student4);
        students.add(student5);
        students.add(student6);

        List<Teacher<String, Integer, String>> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);
        teachers.add(teacher5);

        List<Employee<String, Integer, String>> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        // Пример вычисления среднего возраста
        double averageStudentAge = AccountController.averageAge(students);
        System.out.println("Средний возраст студентов: " + averageStudentAge);

        double averageTeacherAge = AccountController.averageAge(teachers);
        System.out.println("Средний возраст учителей: " + averageTeacherAge);

        double averageEmployeeAge = AccountController.averageAge(employees);
        System.out.println("Средний возраст работников: " + averageEmployeeAge);
        System.out.println("===============================================================");
        // Пример сортировки списка учителей
        System.out.println("Неотсортированный список учителей:");
        for (Teacher<String, Integer, String> teacher : teachers) {
            System.out.println(teacher);
        }
        System.out.println("===============================================================");
        System.out.println("Отсортированный список учителей:");
        AccountController.sortedPersons(teachers);
        for (Teacher<String, Integer, String> teacher : teachers) {
            System.out.println(teacher);
        }

        System.out.println("===============================================================");
        // Пример выплаты зарплаты учителю
        System.out.println("Выплата зарплаты учителю:");
        AccountController.paySalary(teacher1, 40000);
    }
}
