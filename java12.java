public class java12 { public static boolean isDivisible(int dividend, int divisor) throws ArithmeticException {
            if (divisor == 0) {
                    throw new ArithmeticException("Деление на ноль невозможно.");
                }
            return dividend % divisor == 0; // Проверяем делимость
        }

            public static void main(String[] args) {
                int dividend = 10; // Делимое
                int divisor = 2;   // Делитель

                try {
                        boolean result = isDivisible(dividend, divisor);
                        System.out.println(dividend + (result ? " делится на " : " не делится на ") + divisor);
                    } catch (ArithmeticException e) {
                        System.err.println(e.getMessage());
                    }

                // Пример с делителем, равным нулю
                divisor = 0; // Делитель равен нулю
                try {
                        boolean result = isDivisible(dividend, divisor);
                        System.out.println(dividend + (result ? " делится на " : " не делится на ") + divisor);
                    } catch (ArithmeticException e) {
                        System.err.println(e.getMessage());
                    }
           }
}

