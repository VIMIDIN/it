import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class java15 {public static void checkDate(String dateStr) throws DateTimeParseException {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
          try {
                    LocalDate date = LocalDate.parse(dateStr, formatter);
                    System.out.println("Дата '" + dateStr + "' корректная: " + date);
                } catch (DateTimeParseException e) {
                    throw new DateTimeParseException("Некорректный формат даты: " + dateStr, dateStr, e.getErrorIndex(), e);
                }
        }

            public static void main(String[] args) {
                // Примеры дат для проверки
                String validDate = "25.12.2023"; // Корректная дата
                String invalidDate = "31.02.2023"; // Некорректная дата (февраль)

                // Проверка корректной даты
                try {
                        checkDate(validDate);
                    } catch (DateTimeParseException e) {
                        System.err.println("Ошибка: " + e.getMessage());
                    }

                // Проверка некорректной даты
                try {
                        checkDate(invalidDate);
                    } catch (DateTimeParseException e) {
                        System.err.println("Ошибка: " + e.getMessage());
                    }
            }
}

