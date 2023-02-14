public class Student extends Demo5.Person {
    private  String regNO;
    private double feeBal;

    public Student(){
        System.out.println("Student details");
        System.out.println("Enter registration No: ");
        regNO = sc.next();
        System.out.println("Enter amount of fees to be paid");
        feeBal = sc.nextDouble();
    }
    public void checkFeeBal () {
        System.out.println();
    }

    public static void main(String[] args) {

    }
}
