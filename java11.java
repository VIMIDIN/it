public class java11 {public static String convertToBinary(int number) throws IllegalArgumentException {
            if (number < 0) {
                    throw new IllegalArgumentException("Число не может быть отрицательным: " + number);
                }

            // Используем встроенный метод для конвертации в двоичную строку
            return Integer.toBinaryString(number);
        }

            public static void main(String[] args) {
                int number = 10; // Пример неотрицательного числа

                try {
                        String binaryString = convertToBinary(number);
                        System.out.println("Двоичное представление числа " + number + " равно: " + binaryString);
                    } catch (IllegalArgumentException e) {
                        System.err.println(e.getMessage());
                    }

                // Пример с отрицательным числом
                number = -5; // Отрицательное число
                try {
                        String binaryString = convertToBinary(number);
                        System.out.println("Двоичное представление числа " + number + " равно: " + binaryString);
                    } catch (IllegalArgumentException e) {
                        System.err.println(e.getMessage());
                    }
            }
}

