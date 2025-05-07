class Student {
    protected String name;
    protected String address;
    protected String sex;
    protected double score;

    public Student() {
        this.name = "";
        this.address = "";
        this.sex = "";
        this.score = 0.0;
    }

    public Student(String name, String address, String sex, double score) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getSex() {
        return this.sex;
    }

    public double getScore() {
        return this.score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public class StudentOperator {
        public String print() {
            return "Name: " + name + ", address: " + address + ", sex: " + sex + ", score: " + score + ".";
        }

        public String type() {
            if (score > 8) {
                return "A";
            }
            else if (score <= 8 && score >= 5) {
                return "B";
            }
            else {
                return "C";
            }
        } 
    }

    public static void main(String[] args) {
        Student student1 = new Student("An Vu", "D6, Tan Phong, 7 District", "Female", 6);
        Student student2 = new Student("My Nguyen", "D6, Tan Phong, 7 District", "Male", 9);
        Student.StudentOperator operator1 = student1.new StudentOperator();
        Student.StudentOperator operator2= student2.new StudentOperator();
        System.out.println(operator1.print());
        System.out.println(operator2.print());
        System.out.println("Rank student 1: " + operator1.type());
        System.out.println("Rank student 2: " + operator2.type());
    }
}