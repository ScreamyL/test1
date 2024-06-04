//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива(кол-во чисел):");
        int size = scanner.nextInt();

        int[] massiv = new int[size];

        for (int i = 0; i < size; i++) {
            massiv[i] = (int) (Math.random() * 1000);
        }

        System.out.println();


        System.out.println("неотсортированный: " + Arrays.toString(massiv));
        Arrays.sort(massiv);
        System.out.println("массив: " + Arrays.toString(massiv));
        System.out.println("минимальное: " + massiv[0]);
        System.out.println("максимальное: " + massiv[massiv.length - 1] + "\n");
        System.out.println("среднее: " + (double) Arrays.stream(massiv).sum() / size + "\n");


        scanner.close();
    }
}
