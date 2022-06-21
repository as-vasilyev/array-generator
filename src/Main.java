public class Main {
    public static void main(String[] str) {
        int[] numbers = new int[100];
        Utils.generateArray(numbers);
        int result = Utils.negativeNumbers(numbers);
        Utils.printResult(result);
    }
}
