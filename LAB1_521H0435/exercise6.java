public class exercise6 {
    public static void main(String[] args) {
        Min minFinder = new Min(5, 3, 7);
        int min = minFinder.findMinimum();
        System.out.println("Minimum among the three numbers is: " + min);
    }

    public static class Min {
        private int num1;
        private int num2;
        private int num3;
    
        public Min(int num1, int num2, int num3) {
            this.num1 = num1;
            this.num2 = num2;
            this.num3 = num3;
        }
    
        public int findMinimum() {
            int min = num1;
    
            if (num2 < min) {
                min = num2;
            }
    
            if (num3 < min) {
                min = num3;
            }
    
            return min;
        }
    }
}
