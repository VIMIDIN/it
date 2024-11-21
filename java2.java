public class java2 {public static double divide(double numerator, double denominator) {
    if (denominator == 0) {
        throw new ArithmeticException("Недопустимо деление на ноль");
    }
    return numerator / denominator;
}

    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 2)); // Вывод: 5.0
            System.out.println(divide(10, 0)); // Исключение
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}
