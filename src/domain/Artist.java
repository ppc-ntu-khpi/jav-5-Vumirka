package domain;

/**
 * Клас {@code Artist} представляє творчого працівника компанії.
 * <p>
 * Розширює клас {@link Employee}, додаючи перелік навичок (skills).
 * Є батьківським класом для {@link Editor}, {@link GraphicIllustrator} та {@link TechnicalWriter}.
 * </p>
 *
 * @author Ріжкевич Вікторія
 * @version 1.0
 * @see Employee
 */
public class Artist extends Employee {

    /** Масив навичок працівника-художника. */
    private String[] skiils;

    /**
     * Конструктор з повним набором параметрів.
     *
     * @param skiils   масив навичок
     * @param name     ім'я працівника
     * @param jobTitle посада
     * @param level    рівень (1–3)
     * @param dept     відділ
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Конструктор з масивом навичок.
     *
     * @param skiils масив навичок
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }

    /**
     * Конструктор без параметрів.
     * Ініціалізує порожній масив навичок розміром 10.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Повертає рядкове представлення художника.
     * Включає дані з {@link Employee#toString()} та перелік навичок.
     *
     * @return рядок з даними про працівника і його навичками
     */
    @Override
    public String toString() {
        return super.toString() + "\nSkills: " + getSkills();
    }

    /**
     * Повертає навички у вигляді рядка, розділеного комами.
     *
     * @return рядок навичок через кому
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює масив навичок.
     *
     * @param skills новий масив навичок
     */
    public void setSkills(String[] skills) {
        this.skiils = skills;
    }

    /**
     * Повертає масив навичок.
     *
     * @return масив рядків з навичками
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
