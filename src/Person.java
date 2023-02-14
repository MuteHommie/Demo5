import java.util.Date;
import java.util.Scanner;

    public class Person{
        protected String name, gender;
        protected  int yob;
        public Scanner sc = new Scanner(System.in);

    public Person(){
        System.out.println("Create Person: ");
        name = "Oscar";
        gender = "Male";
        yob = 2003;
    }
    public Person(String name, String gender, int yob) {
        this.name = name;
        this.gender= gender;
        this.yob= yob;
    }
    public int getAge() {
        Date d = new Date();
        int year = d.getYear();

        return year - yob;
    }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setYob(int yob) {
            this.yob = yob;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getName() {
            return name;
        }


    public static void main(String[] args) {
        System.out.printf("");
    }
 }
}