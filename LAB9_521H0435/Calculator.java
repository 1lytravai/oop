public class Calculator{
    public static class NumberOutOfRangeException extends Exception{
        public NumberOutOfRangeException(String message) {
            super(message);
        }
    }

    public double divide(int a, int b) throws ArithmeticException, NumberOutOfRangeException {
        if (b == 0) {
            throw new ArithmeticException("divide by zero");
        }

        if (a < -1000 || a > 1000 || b < -1000 || b > 1000) {
            throw new NumberOutOfRangeException(("Number is outside the computation"));
        }

        return (double) a/b;

    }

    public int multiply(int a, int b) throws NumberOutOfRangeException {
        if (a < -1000 || a > 1000 || b < -1000 || b > 1000) {
            throw new NumberOutOfRangeException("Number is outside the computation");
        }

        return a*b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        try {
            double result = calc.divide(10,2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberOutOfRangeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    

}
