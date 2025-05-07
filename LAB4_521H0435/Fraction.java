public class Fraction {
    private int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            System.out.println("Denominator cannot be zero.");
        }
        this.denominator = denominator;
    }

    public Fraction(Fraction fraction) {
        this.numerator = fraction.numerator;
        this.denominator = fraction.denominator;
    }

    public Fraction() {
        this(0, 1);
    }

    public Fraction add(Fraction fraction) {
        int newNumerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;
        int newDenominator = this.denominator * fraction.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subtract(Fraction fraction) {
        int newNumerator = this.numerator * fraction.denominator - fraction.numerator * this.denominator;
        int newDenominator = this.denominator * fraction.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction fraction) {
        int newNumerator = this.numerator * fraction.numerator;
        int newDenominator = this.denominator * fraction.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction fraction) {
        if (fraction.numerator == 0) {
            throw new ArithmeticException("Can not divide by 0.");
        }
        int newNumerator = this.numerator * fraction.denominator;
        int newDenominator = this.denominator * fraction.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        return new Fraction(this.numerator / gcd, this.denominator / gcd);
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return Integer.toString(numerator);
        }
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        // Example usage
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(1, 2);

        Fraction sum = f1.add(f2);
        System.out.println("Sum: " + sum);

        Fraction sub = f1.subtract(f2);
        System.out.println("Sub: " + sub);

        Fraction multiply = f1.multiply(f2);
        System.out.println("Multiply: " + multiply);

        Fraction divide = f1.divide(f2);
        System.out.println("Divide: " + divide);

        Fraction reduced = f1.reduce();
        System.out.println("Reduced fraction: " + reduced);
    }
}
