/*
 *   Polymorphism example about mathematical operations
 */

class MathematicalOperations {
    // Define 2 constant integer values
    protected double num1 = 10;
    protected double num2 = 15;
    protected double operationResult;

    public MathematicalOperations() {
    }

    public MathematicalOperations(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double result() {
        return 0;
    }
}


class Multiplication extends MathematicalOperations {

    @Override
    public double result() {
        return operationResult = num1 * num2;
    }
}


class Summation extends MathematicalOperations {

    @Override
    public double result() {
        return operationResult = num1 + num2;
    }
}


class Subtraction extends MathematicalOperations {

    @Override
    public double result() {
        return operationResult = num1 - num2;
    }
}


class ResultPrinter {
    void print(double result) {
        System.out.println("Result= " + result);
    }

}


public class Main {

    public static void main(String[] args) {

        // Create object for superclass
        MathematicalOperations mathOp = new MathematicalOperations(10, 15);
        mathOp.result();

        // Create objects for subclasses
        MathematicalOperations summation = new Summation();
        MathematicalOperations subtraction = new Subtraction();
        MathematicalOperations multiplication = new Multiplication();
        ResultPrinter resPrinter = new ResultPrinter();

        resPrinter.print(summation.result());
        resPrinter.print(subtraction.result());
        resPrinter.print(multiplication.result());

    }
}