import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------계산기 프로그램--------");
        System.out.print("계산할 숫자와 연산자를 입력해주세요 : ");
        int num1 = sc.nextInt();
        char operand = sc.next().charAt(0);
        int num2 = sc.nextInt();

        switch(operand){
            case '+':
                add(num1,num2);
                break;
            default:
                System.out.println("입력한 연산자를 다시 확인해주세요!");
        }
    }
}