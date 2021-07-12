public class Calculator {

    // Constructor
    public Calculator(){
    }

    // Add method
    public int add(int a, int b){
        return a + b;
    }

    // Subtract method
    public int subtract(int a, int b){
        return a - b;
    }

    // Multiply method
    public int multiply(int a, int b){
        return a * b;
    }

    // Divide method
    public int divide(int a, int b){
        return a / b;
    }

    // Modulo method
    public int modulo(int a, int b){
        return a % b;
    }

    // Main method
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(45, 11));
    }
}
