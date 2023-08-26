//Задание 3.1 (Инвертирование односвязного списка)

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
        public static void main(String[] args){
                Scanner arr = new Scanner(System.in);
                System.out.println("Введите длину массива: ");
                int length = arr.nextInt();
                int[] array = new int[length];
                System.out.println("Введите элементы массива: ");

                for(int i = 0; i < length; i++){
                        array[i] = arr.nextInt();
                }

                for(int a = 0; a < array.length/2; a++){
                        int temp = array[a];
                        array[a] = array[array.length - 1 - a];
                        array[array.length - 1 - a] = temp;
                }

                System.out.println(Arrays.toString(array));
        }
}
