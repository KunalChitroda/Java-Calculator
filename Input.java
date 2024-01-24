import java.util.Scanner;

class Input {
    public double[] inputNumbers() {
        double numbers[] = new double[2];
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Enter First Number:");
        double firstNumber = scan1.nextDouble();
        numbers[0] = firstNumber;

        System.out.println("Enter Second Number :");
        double secondNumber = scan1.nextDouble();
        numbers[1] = secondNumber;

        return numbers;
    }

    public double[] getArrayInput() {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scan2.nextInt();

        double[] array = new double[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scan2.nextDouble();
        }

        return array;
    }
}