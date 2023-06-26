import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int pal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen palindrom olup olmadığını öğrenmek istediğiniz sayıyı giriniz.");
        pal = scanner.nextInt();

        if(reverse(pal) == pal)
            System.out.println(pal + " bir palindrom sayı");
        else
            System.out.println(pal + " bir palindrom sayı değil.");
    }
    static int reverse(int num){
        int i = 0;
        while (num > 0){
            i = (i * 10) + (num % 10);
            num /= 10;
        }
        return (i);
    }
}