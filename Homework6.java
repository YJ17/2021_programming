class Course {

    private String code;
    private String name;

    public void Course(String a, String b){

        code = a;
        name = b;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}

class OfflineCourse extends Course {

    public OfflineCourse(String a, String b){
        super.Course(a, b);
    }

    public String toString() {
        String str = "Code: " + super.getCode() + ", Name: " + super.getName() + ", Type: Offline";
        return str;
    }

}

class OnlineCourse extends Course {

    public OnlineCourse(String a, String b){
        super.Course(a, b);
    }


    public String toString() {
        String str = "Code: " + super.getCode() + ", Name: " + super.getName() + ", Type: Online";
        return str;
    }

}

public class Homework6 {

    public static void main(String[] args){

        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println(course1);
        System.out.println(course2);
    }

}
