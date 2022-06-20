

public class Main {
    public static void main(String[] str) {
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            int number = (int)(Math.random() * 200 - 100);
            numbers[i] = number;
        }

        int amount = 0;
        for (int number : numbers){
            if (number % 2 == 1) amount++;
        }
        System.out.printf("The amount of arrays odd positive numbers is %d \n", amount);
    }
}
