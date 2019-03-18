public class Calculator {

    private double num_1;
    private double num_2;

    public Calculator(double num_1, double num_2) {
        this.num_1 = num_1;
        this.num_2 = num_2;
    }

    public double Add() {
        return num_1 + num_2;
}

    public double Subtract() {
        return num_1 - num_2;
    }

    public double Multiply() {
        return num_1 * num_2;
    }

    public double Divide() {
        return num_1 / num_2;
    }
    }
