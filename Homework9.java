import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;

public class Homework9 {

    public static void main(String[] args){

        String input_id;
        String input_pw;
        int count = 0;
        Map<String, String> hmap = new HashMap<String, String>();

        try{
            Scanner fscan = new Scanner(new File("src/db.txt"));
            String db_id;
            String db_pw;
            while(fscan.hasNext()){
                if(count >= 1){
                    db_id = fscan.next();
                    db_pw = fscan.next();
                    hmap.put(db_id, db_pw);
                }
                else {
                    count += 1;
                    db_id = fscan.next();
                    db_pw = fscan.next();
                }
            }
            fscan.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("db.txt 파일이 존재하지 않습니다.");
        }
        catch (Exception e){
            e.printStackTrace();
        }

        Scanner scan = new Scanner(System.in);
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
                if(hmap.get(input_id.trim()).compareTo(input_pw.trim()) == 0){
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
