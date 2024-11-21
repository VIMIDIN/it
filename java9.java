public class java9 { public static String trimString(String input, int length) throws IllegalArgumentException {
         if (length > input.length()) {
                    throw new IllegalArgumentException("Число символов больше длины строки: " + length);
                }

    return input.substring(0, length);
      }

            public static void main(String[] args) {
                String str = "Привет, мир!"; // Пример строки
                int length = 5; // Количество символов для обрезки

              try {
                        String trimmedString = trimString(str, length);
                        System.out.println("Обрезанная строка: " + trimmedString);
                    } catch (IllegalArgumentException e) {
                        System.err.println(e.getMessage());
                    }

                // Пример с длиной, превышающей длину строки
                length = 20; // Превышающая длину строки
              try {
                        String trimmedString = trimString(str, length);
                        System.out.println("Обрезанная строка: " + trimmedString);
                   } catch (IllegalArgumentException e) {
                        System.err.println(e.getMessage());
                    }
            }
}

