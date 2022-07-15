package EnumApp;

public class App {
    public static void main(String[] args) {
        System.out.println(Day.MONDAY.getDay() + ". day: " + Day.MONDAY.getNameOfDay());
        System.out.println(Day.SATURDAY.getDay() + ". day: " + Day.SATURDAY.getNameOfDay());
        System.out.println(Day.FRIDAY.getDay() + ". day: " + Day.FRIDAY.getNameOfDay());
    }
}
