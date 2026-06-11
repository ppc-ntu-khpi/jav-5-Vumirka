package test;

import domain.*;

/**
 * Клас {@code EmployeesTest} містить точку входу для тестування моделі працівників.
 * <p>
 * Демонструє створення об'єктів класів {@link domain.Editor}, {@link domain.Employee},
 * {@link domain.Artist} та {@link domain.Manager} і виведення інформації про менеджера
 * з підлеглими.
 * </p>
 *
 * @author Ріжкевич Вікторія
 * @version 1.0
 */
public class EmployeesTest {

    /**
     * Головний метод програми — точка входу.
     * <p>
     * Створює кілька об'єктів працівників, формує команду та виводить
     * інформацію про менеджера і його підлеглих у консоль.
     * </p>
     *
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(String args[]) {
        String[] skills = {"Microsoft Word", "TeX", "OpenOffice", "Markdown"};
        Editor ed = new Editor(true, skills, "Phil Coulson", "Chief Editor", 3, "Publishing");
        Employee em = new Employee("Melinda May", "Assistant", 1, "Publishing");
        Artist art = new Artist(skills);
        Employee[] people = {ed, em, art};
        Manager man = new Manager(people, "Steve Ballmer", "CEO", 3, "Publishing");
        System.out.println(man);
    }
}
