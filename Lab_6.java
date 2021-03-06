import java.util.*;
public class Lab_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int size = in.nextInt();
        ArrayList<Integer> mass = new ArrayList<Integer>();

        for (int i = 0; i < size; i++) {            // добавление эл-в в массив
            mass.add(RandomInt(1, 15));
            System.out.print(mass.get(i) + " ");
        }
        Collections.sort(mass);                 // сортируем
        for (int i = 0; i < size - 1 ; i++) {           // заменяем повторяющиеся эл-ты на 0
            if (mass.get(i) == mass.get(i + 1)) {
                mass.set(i, 0);
            }
        }

        Collections.sort(mass);
        while (mass.get(0) == 0){   // удаляем эл-ты равные 0
            mass.remove(0);
        }
        System.out.println();
        System.out.println("Массив после сортировки: ");
        for (int i = 0; i < mass.size(); i++) {  // выводим
            System.out.print(mass.get(i) + " ");
        }


    }
    public static int RandomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }


}