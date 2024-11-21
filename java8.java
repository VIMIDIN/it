public class java8 {  public static double power(double base, int exponent) throws IllegalArgumentException {
          if (exponent < 0) {
        throw new IllegalArgumentException("Степень не может быть отрицательной: " + exponent);
    }

            double result = 1.0;
         for (int i = 0; i < exponent; i++) {
                    result *= base;
                }
            return result;
        }

    public static void main(String[] args) {
                double base = 2.0; // Основание
                int exponent = 3;  // Степень

              try {
                        double result = power(base, exponent);
                        System.out.println(base + " в степени " + exponent + " равно " + result);
                    } catch (IllegalArgumentException e) {
                        System.err.println(e.getMessage());
                    }

                // Пример с отрицательной степенью
                exponent = -2; // Отрицательная степень
              try {
                        double result = power(base, exponent);
                        System.out.println(base + " в степени " + exponent + " равно " + result);
                    } catch (IllegalArgumentException e) {
                        System.err.println(e.getMessage());
                    }
            }
}


