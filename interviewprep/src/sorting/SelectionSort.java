package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = Utility.getRandomIntegers(10);
        int count = 0;
        Utility.print(numbers, "Before Selection Sort");
        for (int i = 0; i < numbers.length; i++) {
            count++;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    Utility.swap(numbers, i, j);
                    count++;
                }
                //Utility.print(numbers,"Process["+i+"]["+j+"]");
            }
        }

        System.out.println("Count	:	" + count);
        Utility.print(numbers, "After Selection Sort");
    }


}
