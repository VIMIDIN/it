public class java7 {public static void checkForZeros(int[] array) throws IllegalArgumentException {
         for (int number : array) {
                 if (number == 0) {
                            throw new IllegalArgumentException("Массив содержит нули.");
                        }
                }
        }

    public static void main(String[] args) {
                int[] array = {1, 2, 3, 0, 5}; // Пример массива для проверки

               try {
            checkForZeros(array);
                        System.out.println("Массив не содержит нулей.");
                    } catch (IllegalArgumentException e) {
                        System.err.println(e.getMessage());
                   }
            }
}

