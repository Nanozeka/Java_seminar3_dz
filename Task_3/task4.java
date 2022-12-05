package Task_0.Task_3;

public class task4 {
    // Задан целочисленный список ArrayList. Найти минимальное,
    //  максимальное и среднее из этого списка.
    import java.util.ArrayList;
    import java.util.Random;
    
    // import static java.lang.Math.round;
    import static java.util.Collections.max;
    import static java.util.Collections.min;
    
    
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
    
    
            int max = max(myList);
            int min = min(myList);
            // int maxItem = myList.get(0);
            // int minItem = myList.get(0);
            int sumItems = 0;
            for (int item : myList) {
                // if (item > maxItem) {
                //     maxItem = item;
                // }
                // if (item < minItem) {
                //     minItem = item;
                // }
                sumItems += item;
            }
            float average = (float)sumItems/myList.size();
            System.out.printf("Максимальный элемент при помощи max %s\n", max);
            // System.out.printf("Максимальный элемент %s\n", maxItem);
            System.out.printf("Минимальный элемент при помощи min %s\n", min);
            // System.out.printf("Минимальный элемент %s\n", minItem);
            // System.out.printf("Сумма элементов %s\n", sumItems);
            System.out.printf("Среднее арифметическое %s\n", average);
        }
    }
}    