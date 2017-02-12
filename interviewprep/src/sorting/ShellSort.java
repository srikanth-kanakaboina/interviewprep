package sorting;

public class ShellSort {
    public static void main(String[] args) {
        int[] numbers = Utility.getRandomIntegers(10);
        Utility.print(numbers, "Before InsertionSort	");

        int[] gaps = {4, 3, 2, 1};
        for (int increment : gaps) {
            for (int i = 0; i < numbers.length - increment; i = i + increment) {
                for (int j = i + increment; j > 0; j = j - increment) {

                    if (numbers[j] < numbers[j - increment]) {
                        Utility.swap(numbers, j, j - increment);
                    } else {
                        break;
                    }
                }
            }
        }
        Utility.print(numbers, "After Shell sort	 ");

    }


}
