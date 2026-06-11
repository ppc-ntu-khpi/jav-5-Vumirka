package domain;

/**
 * Клас {@code Manager} представляє менеджера — керівника групи працівників.
 * <p>
 * Розширює клас {@link Employee}, додаючи можливість управління масивом підлеглих.
 * </p>
 *
 * @author Ріжкевич Вікторія
 * @version 1.0
 * @see Employee
 */
public class Manager extends Employee {

    /** Масив підлеглих працівників. */
    private Employee[] employees;

    /**
     * Конструктор з повним набором параметрів.
     *
     * @param employees масив підлеглих
     * @param name      ім'я менеджера
     * @param jobTitle  посада
     * @param level     рівень (1–3)
     * @param dept      відділ
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Конструктор з масивом підлеглих.
     *
     * @param employees масив підлеглих
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Конструктор без параметрів.
     * Ініціалізує порожній масив підлеглих розміром 10.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /**
     * Повертає рядкове представлення менеджера.
     * Включає дані з {@link Employee#toString()} та перелік підлеглих.
     *
     * @return рядок з даними менеджера і його підлеглими
     */
    @Override
    public String toString() {
        return super.toString() + "\nEmployees: " + getEmployees();
    }

    /**
     * Повертає імена підлеглих у вигляді рядка через кому.
     *
     * @return рядок з іменами підлеглих
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює масив підлеглих.
     *
     * @param employees новий масив підлеглих
     */
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Повертає масив підлеглих.
     *
     * @return масив об'єктів {@link Employee}
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
