//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int findMax(int a, int b) {
        if (a == b) {
            throw new IllegalArgumentException("Числа равны");
        }
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(findMax(5, 10)); // Вывод: 10
            System.out.println(findMax(7, 7));   // Исключение
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}