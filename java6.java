public class java6 { public static long calculateFactorial(int number) throws IllegalArgumentException {
         if (number < 0) {
                    throw new IllegalArgumentException("Факториал не определен для отрицательных чисел: " + number);
                }

            long factorial = 1;
         for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
            return factorial;
        }

            public static void main(String[] args) {
                int number = 5; // Пример числа для проверки

                try {
                        long result = calculateFactorial(number);
                        System.out.println("Факториал числа " + number + " равен " + result);
                    } catch (IllegalArgumentException e) {
                        System.err.println(e.getMessage());
                    }
            }
}
