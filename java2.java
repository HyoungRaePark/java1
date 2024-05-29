import java.util.Scanner;

public class java2 
{
    public static int min(int a, int b, int c) 
    {
        int min = a; 

        if (b < min) 
        {
            min = b;
        }
        if (c < min) 
        {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 a: ");
        int a = scanner.nextInt();
        System.out.print("정수 b: ");
        int b = scanner.nextInt();
        System.out.print("정수 c: ");
        int c = scanner.nextInt();

        int i = min(a, b, c);
        System.out.println("최소값은 " + i + "입니다.");

        scanner.close();
    }
}
