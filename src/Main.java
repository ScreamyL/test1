//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int size = 20;
        int[] massiv = new int[size];
        for (int i = 0; i < size; i++) {
            massiv[i] = (int) (Math.random() * 1000);
        }


        int max = massiv[0];
        for (int i = 1; i < size; i++) {
            if (massiv[i] > max) {
                max = massiv[i];}
        }
        int min = massiv[0];
        for (int i = 1; i < size; i++) {
            if (massiv[i] < min) {
                min = massiv[i];}
        }

        int sum = 0;
        for (int num : massiv) {
            sum += num;
        }
        double average = (double) sum / size;

        System.out.println("Массив:");
        for (int num : massiv) {
            System.out.print(num + " ");
        }
        System.out.println("\nМаксимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + average);
    }


}