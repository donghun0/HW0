import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String present = " ";
        System.out.print("Enter integer value 1~99: ");
        int integerValue = scanner.nextInt(); 
        
        boolean a = false;
        boolean b = false;
        
        if (integerValue >= 1 && integerValue <= 99) {
            if (integerValue/10 == 3 || integerValue/10 == 6 || integerValue/10 == 9) {
                a = true;
            }	
            if (integerValue%10 == 3 || integerValue%10 == 6 || integerValue%10 == 9) {
                b = true;
            }
            
            if (a || b) {
                if (a && b) {
                    present = "박수짝짝";
                } else {
                    present = "박수짝";
                }
            } 
            else {
                present = "No 3, 6, or 9";
            }
        } 
        else {
            present = "1~99의 숫자만 입력해주세요";
        }
        
        System.out.println(present);
        scanner.close();
    }
}
