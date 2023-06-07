import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n;

        System.out.print("Sayi degeri girin : ");
        n = scan.nextInt();

        for(int i=1; i <= n; i *= 4) {
            System.out.println("4'un kuvvetleri : "+i);
        }
        for(int j = 1; j <= n; j *= 5) {
            System.out.println("5'in kuvvetleri : "+j);
        }

    }
}