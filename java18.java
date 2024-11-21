public class java18 {   public static double calculateSquareRoot(double number) {
         if (number < 0) {
                    throw new IllegalArgumentException("Квадратный корень из отрицательного числа не существует.");
                }
            return Math.sqrt(number);
        }

            public static void main(String[] args) {
                // Примеры чисел для вычисления квадратного корня
                double positiveNumber = 16.0;
                double negativeNumber = -9.0;

                // Проверка квадратного корня для положительного числа
              try {
                       double squareRoot = calculateSquareRoot(positiveNumber);
                        System.out.println("Квадратный корень из " + positiveNumber + " равен: " + squareRoot);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Ошибка: " + e.getMessage());
                    }

                // Проверка квадратного корня для отрицательного числа
              try {
            double squareRoot = calculateSquareRoot(negativeNumber);
                       System.out.println("Квадратный корень из " + negativeNumber + " равен: " + squareRoot);
        } catch (IllegalArgumentException e) {
                        System.err.println("Ошибка: " + e.getMessage());
                    }
            }
}


