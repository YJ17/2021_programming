import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {

    public static void main(String[] args){

        String input_id;
        String input_pw;
        Scanner scan = new Scanner(System.in);
        Map<String, String> hmap = new HashMap<String, String>();

        hmap.put("myId", "myPass");
        hmap.put("myId2", "myPass2");
        hmap.put("myId3", "myPass3");

        while(true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.printf("id : ");
            input_id = scan.nextLine();

            if(hmap.get(input_id.trim()) == null) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
            }
            else {
                System.out.printf("password : ");
                input_pw = scan.nextLine();
                if(hmap.get(input_id.trim()).compareTo(input_pw) == 0){
                    System.out.println("id와 비밀번호가 일치합니다.\n");
                    break;
                }
                else{
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                }
            }
        }

    }

}
