public class java4 { public static void validateAge(int age) throws IllegalArgumentException {
         if (age < 0 || age > 150) {
                    throw new IllegalArgumentException("Возраст должен быть в диапазоне от 0 до 150. Указанный возраст: " + age);
                }
        }

            public static void main(String[] args) {
                int age = 160; // Пример возраста для проверки

        try {
                        validateAge(age);
                        System.out.println("Возраст " + age + " является допустимым.");
                    } catch (IllegalArgumentException e) {
                        System.err.println(e.getMessage());
                   }
            }
}

