public class java10 { public static int findElement(int[] array, int target) throws IllegalArgumentException {
            for (int i = 0; i < array.length; i++) {
                    if (array[i] == target) {
                            return i; // Возвращаем индекс найденного элемента
                        }
                }
            // Если элемент не найден, выбрасываем исключение
            throw new IllegalArgumentException("Элемент " + target + " не найден в массиве.");
        }

            public static void main(String[] args) {
                int[] array = {1, 2, 3, 4, 5}; // Пример массива
                int target = 3; // Элемент для поиска

                try {
                        int index = findElement(array, target);
                        System.out.println("Элемент " + target + " найден на индексе: " + index);
                    } catch (IllegalArgumentException e) {
                        System.err.println(e.getMessage());
                    }

                // Пример с элементом, которого нет в массиве
                target = 6; // Элемент, который не существует в массиве
              try {
                        int index = findElement(array, target);
                        System.out.println("Элемент " + target + " найден на индексе: " + index);
                    } catch (IllegalArgumentException e) {
                        System.err.println(e.getMessage());
                    }
            }
}

