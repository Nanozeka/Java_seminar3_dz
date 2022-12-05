// Задача 2
// Пусть дан произвольный список целых чисел, удалить из него четные числа

package Task_0.Task_2;

import java.util.ArrayList;
import java.util.Random;

public class task_2 {
    public static void main(String[] args) {

        // создаем список рандомных чисел от-10 до 10
        Random rnd = new Random();
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-10, 10);
            // добавляем сгенерированное число в список
            mylist.add(val);
        }
        // печатаем список рандомных чисел
        System.out.printf("Список рандомных целых чисел:  %s\n", mylist);


        int i = 0;

        // проходим по списку
        while (i < mylist.size()) {

            // если число четное то удаляем из списка
            if (mylist.get(i) % 2 == 0) {
                mylist.remove(i);
            }

            // иначе проверяем следующий индекс
            else {
                i++;
            }
        }

        // выводим на печать получивщийся список
        System.out.printf("Список без четных числел:  %s", mylist);
    }
}