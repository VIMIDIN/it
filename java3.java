public class java3 { public static int convertStringToInt(String str) throws NumberFormatException {
         if (str == null || str.isEmpty()) {
                    throw new NumberFormatException("Строка не может быть пустой или равной null");
                }

         try {
                    return Integer.parseInt(str);
                } catch (NumberFormatException e) {
                   throw new NumberFormatException("Невозможно конвертировать строку в целое число: " + str);
                }
        }

          public static void main(String[] args) {
               String input = "123"; // Пример входной строки
              try {
                        int result = convertStringToInt(input);
                        System.out.println("Конвертированное число: " + result);
                    } catch (NumberFormatException e) {
                        System.err.println(e.getMessage());
        }
           }
}