package assignments.assignment2;

public class StudentApp {

    public static void main(String[] args) {
        System.out.println("----------");
        Student stu1 = new Student("jeremy", "130870950");
        stu1.setUserID();

        stu1.enroll("Biology");
        stu1.enroll("History");
        stu1.enroll("English");
        stu1.showCourses();

        stu1.pay(1000);
        stu1.pay(750);
        stu1.checkBalance();

        stu1.setPhone("5198781234");
        System.out.println(stu1.getPhone());
        stu1.setCity("Toronto");
        System.out.println(stu1.getCity());
        stu1.setState("Ontario");
        System.out.println(stu1.getState());

        System.out.println(stu1.toString());

        System.out.println("----------");
        Student stu2 = new Student("samantha", "752613292");
        stu2.setUserID();

        stu2.enroll("Acupuncture");
        stu2.enroll("Herbalism");
        stu2.enroll("Psychology");
        stu2.enroll("Business");
        stu2.showCourses();

        stu2.pay(2500);
        stu2.pay(250);
        stu2.checkBalance();

        stu2.setPhone("6135558222");
        System.out.println(stu2.getPhone());
        stu2.setCity("Vancouver");
        System.out.println(stu2.getCity());
        stu2.setState("British Columbia");
        System.out.println(stu2.getState());

        System.out.println(stu2.toString());

        System.out.println("----------");
        Student stu3 = new Student("graeme", "523144789");
        stu3.setUserID();

        stu3.enroll("Law");
        stu3.enroll("Physics");
        stu3.showCourses();

        stu3.pay(5000);
        stu3.pay(4000);
        stu3.checkBalance();

        stu3.setPhone("4618759862");
        System.out.println(stu3.getPhone());
        stu3.setCity("Halifax");
        System.out.println(stu3.getCity());
        stu3.setState("Nova Scotia");
        System.out.println(stu3.getState());

        System.out.println(stu3.toString());
    }
}
