package Lambda;

public class LambdaExpressionsApp {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;

        Math sum = (a, b) -> a + b;
        Math minus = (a, b) -> a - b;
        Math multiple = (a, b) -> a * b;
        Math divide = (a, b) -> {
            if (b == 0) {
                b = 1;
            }
            return a / b;
        };

        System.out.println(x + " + " + y + " = " + sum.transaction(x, y));
        System.out.println(x + " - " + y + " = " + minus.transaction(x, y));
        System.out.println(x + " x " + y + " = " + multiple.transaction(x, y));
        System.out.println(x + " / " + y + " = " + divide.transaction(x, y));

    }
}
