public class java14 {
    static class WeakPasswordException extends Exception {
        public WeakPasswordException(String message) {
            super(message);
        }
    }

    public class PasswordChecker {

        // Функция для проверки сложности пароля
        public static void checkPasswordStrength(String password) throws WeakPasswordException {
            if (password.length() < 8) {
                throw new WeakPasswordException("Пароль слишком слабый. Он должен содержать не менее 8 символов.");
            }
            // Дополнительные проверки можно добавить здесь
        }

        public static void main(String[] args) {
            // Примеры паролей для проверки
            String weakPassword = "1234567"; // Слабый пароль
            String strongPassword = "StrongPass1"; // Сильный пароль

            // Проверка слабого пароля
            try {
                checkPasswordStrength(weakPassword);
                System.out.println("Пароль '" + weakPassword + "' достаточно сильный.");
            } catch (WeakPasswordException e) {
                System.err.println("Ошибка: " + e.getMessage());
            }

            // Проверка сильного пароля
            try {
                checkPasswordStrength(strongPassword);
                System.out.println("Пароль '" + strongPassword + "' достаточно сильный.");
            } catch (WeakPasswordException e) {
                System.err.println("Ошибка: " + e.getMessage());
            }


        }
    }
}