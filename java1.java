import java.util.Scanner;

class signof 
{
    // 정수의 부호를 반환하는 메서드
    static int qwe(int c) 
    {
        int sign = 0;
        
        // 입력 값이 양수인 경우
        if(c > 0) {
            sign = 1;
        }
        // 입력 값이 음수인 경우
        else if(c < 0) {
            sign = -1;
        }
        // 입력 값이 0인 경우는 기본값 0 유지
        return sign;
    }
    
    public static void main(String[] args) 
    {
        // Scanner 객체를 생성하여 사용자 입력을 받음
        Scanner x = new Scanner(System.in);

        // 정수 입력을 요청
        System.out.print("정수를 입력하세요=>");
        int a = x.nextInt();
        System.out.print("정수a:" + a);

        // 입력받은 정수의 부호를 판별하여 결과 출력
        int b = qwe(a);
        System.out.println("sign(a)는 " + b + "입니다");
        
        // Scanner 객체를 닫는다
        x.close();
    }
}
