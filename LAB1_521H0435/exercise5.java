public class exercise5 {
    public static void main(String[] args) {
        LeapYearChecker checker = new exercise5().new LeapYearChecker(2023);
        System.out.println(checker.getYear() + " is a leap year: " + checker.isLeapYear());
    }

    public class LeapYearChecker {
        private int year;
    
        public LeapYearChecker(int year) {
            this.year = year;
        }
    
        public boolean isLeapYear() {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }
    
        public int getYear() {
            return year;
        }
    
        public void setYear(int year) {
            this.year = year;
        }
    
        public static void main(String[] args) {
            LeapYearChecker checker = new exercise5().new LeapYearChecker(2024);
            System.out.println(checker.getYear() + " is a leap year: " + checker.isLeapYear());
        }
    }
}
