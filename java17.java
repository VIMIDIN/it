public class java17 { public static int calculateRemainder(int dividend, int divisor) {
            if (divisor == 0) {
                    throw new ArithmeticException("Деление на ноль невозможно.");
                }
            return dividend % divisor;
        }

            public static void main(String[] args) {
                // Примеры чисел для вычисления остатка
                int dividend = 10;
                int divisor = 3;
                int zeroDivisor = 0;

                // Проверка остатка от деления с корректными числами
                try {
                        int remainder = calculateRemainder(dividend, divisor);
                        System.out.println("Остаток от деления " + dividend + " на " + divisor + " равен: " + remainder);
                    } catch (ArithmeticException e) {
                        System.err.println("Ошибка: " + e.getMessage());
                    }

                // Проверка остатка от деления на ноль
                try {
                        int remainder = calculateRemainder(dividend, zeroDivisor);
                        System.out.println("Остаток от деления " + dividend + " на " + zeroDivisor + " равен: " + remainder);
                    } catch (ArithmeticException e) {
                        System.err.println("Ошибка: " + e.getMessage());
                    }
            }
}

