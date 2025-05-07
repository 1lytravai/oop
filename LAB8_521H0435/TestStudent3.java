import java.util.ArrayList;

class TestStudent3 {
    public static ArrayList<Student3> findStudent(ArrayList<Student3> lstStu) {
        ArrayList<Student3> resultList = new ArrayList<>();
        for (Student3 student : lstStu) {
            if (student.getRank().equals("A") || student.getRank().equals("Passed")) {
                resultList.add(student);
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        ArrayList<Student3> lstStu = new ArrayList<>();
        lstStu.add(new ITStudent("Alice", 9.5, 1234));
        lstStu.add(new MathStudent("Bob", 4.8, "MATH101"));
        lstStu.add(new ITStudent("Charlie", 7.2, 5678));
        lstStu.add(new MathStudent("David", 8.1, "MATH202"));

        ArrayList<Student3> resultList = findStudent(lstStu);

        System.out.println("Students with Rank A or Passed:");
        for (Student3 student : resultList) {
            System.out.println(student.sName + " - " + student.getRank());
        }
    }
}
