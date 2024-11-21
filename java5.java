public class java5 {public static double calculateSquareRoot(double number) throws IllegalArgumentException {
         if (number < 0) {
                    throw new IllegalArgumentException("Невозможно вычислить корень из отрицательного числа: " + number);
                }
            return Math.sqrt(number);
        }

            public static void main(String[] args) {
                double number = -4; // Пример числа для проверки

              try {
                        double result = calculateSquareRoot(number);
                        System.out.println("Квадратный корень из " + number + " равен " + result);
                    } catch (IllegalArgumentException e) {
                       System.err.println(e.getMessage());
                    }
            }
}

