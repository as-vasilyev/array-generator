public class Utils {
    public static void generateArray(int[] numbers){

        for (int i = 0; i < 100; i++) {
            int number = (int)(Math.random() * 200 - 100);
            numbers[i] = number;
        }
    }

    public static int negativeNumbers(int[] numbers){
        int amount = 0;
        for (int number : numbers){
            if (number % 2 == 1) amount++;
        }
        return amount;
    }

    public static void printResult(int result){
        System.out.printf("The amount of arrays odd positive numbers is %d \n", result);
    }

}
