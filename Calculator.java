import java.util.Arrays;

class Calculator {
    public double addition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double subtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public double division(double firstNumber, double secondNumber) {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            System.out.println("Error: Cannot divide by zero");
            return Double.NaN; // NaN (Not a Number) to represent an undefined result
        }
    }

    public double sumOfArray(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum;
    }

    public double varianceOfArray(double[] array) {
        double mean = calculateMean(array);
        double sumSquaredDifferences = 0;

        for (double num : array) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }

        return sumSquaredDifferences / array.length;
    }

    public double standardDeviationOfArray(double[] array) {
        return Math.sqrt(varianceOfArray(array));
    }

    public double calculateMean(double[] array) {
		return Arrays.stream(array).sum() / array.length;

    }
}