// Задача 3

// Задан целочисленный список ArrayList. Найти минимальное,
//  максимальное и среднее из этого списка.

package Task_0.Task_3;

import java.util.ArrayList;
import java.util.Random;
import static java.util.Collections.max;
import static java.util.Collections.min;

public class task_3 {
    public static void main(String[] args) {

        // Создаем рандомный список
        Random rnd = new Random();
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-10, 10);
            myList.add(val);
        }

        // печатаем рандомный список
        System.out.printf("Рандомный список %s\n", myList);

        // с помощью функций max и min находим минимальное и максимальное значение в списке
        int max = max(myList);
        int min = min(myList);

        // суммируем все элементы списка
        int sumItems = 0;
        for (int item : myList) {
            sumItems += item;
        }

        // полученную сумму делим на количество элементов списка и находим сред. арифметическое
        float average = (float)sumItems/myList.size();
        
        System.out.printf("Максимальный элемент: %s\n", max);
        
        System.out.printf("Минимальный элемент: %s\n", min);
        
        System.out.printf("Среднее арифметическое: %s\n", average);
    }
}
