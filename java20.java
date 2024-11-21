public class java20 { public static void validateString(String str) {
            if (str == null || str.isEmpty()) {
                    throw new IllegalArgumentException("Строка не может быть null или пустой.");
                }
        }

            public static void main(String[] args) {
                // Примеры строк для проверки
               String validString = "Hello, World!";
                String emptyString = "";
                String nullString = null;

                // Проверка для валидной строки
              try {
                        validateString(validString);
                        System.out.println("Строка валидна: " + validString);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Ошибка: " + e.getMessage());
                    }

                // Проверка для пустой строки
              try {
                        validateString(emptyString);
                        System.out.println("Строка валидна: " + emptyString);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Ошибка: " + e.getMessage());
                    }

                // Проверка для строки равной null
              try {
                        validateString(nullString);
                        System.out.println("Строка валидна: " + nullString);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Ошибка: " + e.getMessage());
                    }
            }
}

