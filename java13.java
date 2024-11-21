import java.util.List;

public class java13 {
    public static <T> T getElementAtIndex(List<T> list, int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс " + index + " выходит за пределы списка.");
        }
        return list.get(index); // Возвращаем элемент по индексу
    }

    public static void main(String[] args) {
        List<String> myList = List.of("Apple", "Banana", "Cherry", "Date"); // Пример списка

        // Пример с корректным индексом
        int index = 2; // Индекс для чтения
        try {
            String element = getElementAtIndex(myList, index);
            System.out.println("Элемент на индексе " + index + ": " + element);
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }

        // Пример с индексом, выходящим за пределы списка
        index = 5; // Индекс, который выходит за пределы списка
        try {
            String element = getElementAtIndex(myList, index);
            System.out.println("Элемент на индексе " + index + ": " + element);
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}

