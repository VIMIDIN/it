public class java16 {public static String concatenate(String str1, String str2) {
         if (str1 == null || str2 == null) {
                    throw new NullPointerException("Одна из строк равна null.");
                }
            return str1 + str2;
        }

            public static void main(String[] args) {
                // Примеры строк для объединения
                String string1 = "Hello, ";
                String string2 = "World!";
                String nullString = null;

                // Проверка объединения корректных строк
                try {
                        String result = concatenate(string1, string2);
                        System.out.println("Результат объединения: " + result);
                    } catch (NullPointerException e) {
                        System.err.println("Ошибка: " + e.getMessage());
        }

                // Проверка объединения с null
                try {
                        String result = concatenate(string1, nullString);
                       System.out.println("Результат объединения: " + result);
                    } catch (NullPointerException e) {
                        System.err.println("Ошибка: " + e.getMessage());
                    }
            }
}

