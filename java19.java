public class java19 {  public static double celsiusToFahrenheit(double celsius) {
         if (celsius < -273.15) {
                    throw new IllegalArgumentException("Температура не может быть ниже абсолютного нуля (-273.15 °C).");
                }
            return (celsius * 9/5) + 32;
        }

            public static void main(String[] args) {
                // Примеры температур для конвертации
                double validCelsius = 25.0; // Пример допустимой температуры
                double invalidCelsius = -300.0; // Пример температуры ниже абсолютного нуля

                // Проверка конвертации для допустимой температуры
               try {
                        double fahrenheit = celsiusToFahrenheit(validCelsius);
                        System.out.println(validCelsius + " °C равно " + fahrenheit + " °F");
                    } catch (IllegalArgumentException e) {
                        System.err.println("Ошибка: " + e.getMessage());
                    }

                // Проверка конвертации для температуры ниже абсолютного нуля
                try {
                        double fahrenheit = celsiusToFahrenheit(invalidCelsius);
                        System.out.println(invalidCelsius + " °C равно " + fahrenheit + " °F");
                    } catch (IllegalArgumentException e) {
                        System.err.println("Ошибка: " + e.getMessage());
                   }
            }
}

