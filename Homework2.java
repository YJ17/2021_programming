import java.util.Scanner;

class Student {

    String class_of;
    String name;
    String major;
    String phone_num;

    void setClass_of(String c) {
        class_of = c;
    }
    String getClass_of() {
        return class_of;
    }
    void setName(String n) {
        name = n;
    }
    String getName() {
        return name;
    }
    void setMajor(String m) {
        major = m;
    }
    String getMajor() {
        return major;
    }
    void setPhone_num(String p) {
        phone_num = p;
    }
    String getPhone_num(){
        StringBuffer sb = new StringBuffer();

        sb.append(phone_num);
        sb.insert(3, "-");
        sb.insert(8, "-");

        return sb.toString();
    }

}


class Homework2 {

    public static void main(String[] args) {

        String input;
        String[] pars;

        Student[] std_info = new Student[3];

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {

            System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요 : ");

            input = scan.nextLine();
            pars = input.split(" ");

            std_info[i] = new Student();

            std_info[i].setClass_of(pars[0]);
            std_info[i].setName(pars[1]);
            std_info[i].setMajor(pars[2]);
            std_info[i].setPhone_num(pars[3]);
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");

        System.out.println("첫번째 학생 : " + std_info[0].getClass_of() + " " + std_info[0].getName() + " " + std_info[0].getMajor() + " " + std_info[0].getPhone_num());
        System.out.println("두번째 학생 : " + std_info[1].getClass_of() + " " + std_info[1].getName() + " " + std_info[1].getMajor() + " " + std_info[1].getPhone_num());
        System.out.println("세번째 학생 : " + std_info[2].getClass_of() + " " + std_info[2].getName() + " " + std_info[2].getMajor() + " " + std_info[2].getPhone_num());
    }


}
