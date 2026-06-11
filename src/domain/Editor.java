package domain;

/**
 * Клас {@code Editor} представляє редактора — творчого працівника компанії.
 * <p>
 * Розширює клас {@link Artist}, додаючи ознаку типу редагування:
 * електронне ({@code true}) або паперове ({@code false}).
 * </p>
 *
 * @author Ріжкевич Вікторія
 * @version 1.0
 * @see Artist
 */
public class Editor extends Artist {

    /** Тип редагування: {@code true} — електронне, {@code false} — паперове. */
    private boolean electronicEditing;

    /**
     * Конструктор з повним набором параметрів.
     *
     * @param electronicEditing {@code true} якщо редактор працює електронно
     * @param skiils            масив навичок
     * @param name              ім'я
     * @param jobTitle          посада
     * @param level             рівень (1–3)
     * @param dept              відділ
     */
    public Editor(boolean electronicEditing, String[] skiils, String name,
                  String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор з типом редагування та масивом навичок.
     *
     * @param electronicEditing тип редагування
     * @param skiils            масив навичок
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор лише з типом редагування.
     *
     * @param electronicEditing тип редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор без параметрів.
     * За замовчуванням встановлюється електронне редагування.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає рядкове представлення редактора.
     * Додає до даних з {@link Artist#toString()} тип редагування.
     *
     * @return рядок з інформацією про редактора та тип редагування
     */
    @Override
    public String toString() {
        String s = super.toString() + "\nEditing preferences= ";
        if (electronicEditing)
            s = s + "electronic";
        else
            s = s + "paper";
        return s;
    }

    /**
     * Повертає тип редагування.
     *
     * @return {@code true} — електронне редагування, {@code false} — паперове
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює тип редагування.
     *
     * @param electronic {@code true} для електронного, {@code false} для паперового
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }
}
