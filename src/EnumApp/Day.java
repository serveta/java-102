package EnumApp;

import java.io.PrintStream;

public enum Day {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int day;
    Day(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public String getNameOfDay() {
        return switch (this.getDay()) {
            case 1 -> MONDAY.name();
            case 2 -> TUESDAY.name();
            case 3 -> WEDNESDAY.name();
            case 4 -> THURSDAY.name();
            case 5 -> FRIDAY.name();
            case 6 -> SATURDAY.name();
            case 7 -> SUNDAY.name();
            default -> null;
        };
    }
}
