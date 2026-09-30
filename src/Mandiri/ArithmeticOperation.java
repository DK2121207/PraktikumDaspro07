package Mandiri;

public class ArithmeticOperation {
    public int SumTwoNumber(int num1, int num2) {
        return num1 + num2;
    }

    public double SumTwoNumber(double num1, double num2) {
        return num1 + num2;
    }

    public int SumNumber(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
