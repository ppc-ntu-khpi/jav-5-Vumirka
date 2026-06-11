package domain;

/**
 * Клас {@code Employee} представляє базову модель працівника компанії.
 * <p>
 * Містить основну інформацію про співробітника: ім'я, посаду, рівень та відділ.
 * Кожному працівнику автоматично присвоюється унікальний ідентифікатор.
 * </p>
 *
 * @author Ріжкевич Вікторія
 * @version 1.0
 */
public class Employee {

    /** Ім'я працівника. */
    private String name;

    /** Посада працівника. */
    private String jobTitle;

    /** Унікальний ідентифікатор працівника (генерується автоматично). */
    private int ID;

    /**
     * Рівень працівника (допустимі значення: 1, 2, 3).
     * Якщо передано некоректне значення — встановлюється рівень 1.
     */
    private int level;

    /** Назва відділу, в якому працює співробітник. */
    private String dept;

    /**
     * Повертає рядкове представлення працівника.
     *
     * @return рядок з основними даними: ID, ім'я, посада, рівень, відділ
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name +
               "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    /**
     * Конструктор з параметрами для створення повноцінного працівника.
     *
     * @param name     ім'я працівника (має відповідати формату "Ім'я Прізвище")
     * @param jobTitle посада працівника
     * @param level    рівень працівника (1–3); якщо поза діапазоном — встановлюється 1
     * @param dept     назва відділу
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Конструктор без параметрів.
     * Генерує випадковий ID у діапазоні 0–999.
     */
    public Employee() {
        ID = (int) (Math.random() * 1000);
    }

    /**
     * Встановлює посаду працівника.
     *
     * @param job нова посада
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Повертає посаду працівника.
     *
     * @return рядок з посадою
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає ім'я працівника.
     *
     * @return рядок з іменем
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень працівника.
     * Допустимі значення: 1, 2, 3. При некоректному значенні встановлюється рівень 1.
     *
     * @param level новий рівень
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Повертає рівень працівника.
     *
     * @return цілочисельне значення рівня (1–3)
     */
    public int getLevel() {
        return level;
    }

    /**
     * Повертає назву відділу працівника.
     *
     * @return рядок з назвою відділу
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює відділ працівника.
     *
     * @param dept нова назва відділу
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює ім'я працівника.
     * <p>
     * Ім'я має відповідати формату: два слова латинськими літерами (наприклад, "John Doe").
     * Якщо формат не дотримано — встановлюється значення за замовчуванням "John Doe".
     * </p>
     *
     * @param name нове ім'я працівника
     */
    public void setName(String name) {
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
