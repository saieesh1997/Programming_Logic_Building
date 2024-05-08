import java.util.Scanner;

class Arrays {

    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println(a.length - 1);
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println("Enter the age:");
            a[i] = scan.nextInt();
        }

        for (int j = 0; j <= a.length - 1; j++) {
            System.out.println("Age of person " + j + 1 + " is : " + a[j]);
        }

    }
}
