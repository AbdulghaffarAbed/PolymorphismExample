/*
*   Polymorphism example about mathematical operations
 */

class MathematicalOperations{
    // Define 2 constant integer values
    final protected static int num1= 10;
    final protected int num2 = 15;

    public void result(){
        System.out.println("Mathematical operations results for num1= "+num1+" and num2= "+num2+"\n");
    }
}
class Multiplication extends MathematicalOperations{

    @Override
    public void result() {
    System.out.println("Multiplication result= "+(num1*num2));
    }
}

class Summation extends MathematicalOperations{
    @Override
    public void result() {
        System.out.println("Summation result= "+(num1+num2));
    }
}

class Subtraction extends MathematicalOperations{
    @Override
    public void result() {
        System.out.println("Subtraction result= "+(num1-num2));
    }
}

public class Main {

    public static void main(String[] args) {

        // Create object for superclass
        MathematicalOperations mathOp = new MathematicalOperations();
        mathOp.result();

        // Create objects for subclasses
        MathematicalOperations summation = new Summation();
        MathematicalOperations subtraction = new Subtraction();
        MathematicalOperations multiplication = new Multiplication();

        // Print mathematical operations result
        summation.result();
        subtraction.result();
        multiplication.result();

    }
}