import java.util.Scanner;

public class Dc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mat[][]=new int[9][9];
        String str=sc.nextLine();
        int n=sc.nextInt(),i=0;
        for(i=0;i<str.length()/n;i++){
            System.out.println(str.substring(i*n,(i+1)*n));
        }
        System.out.println(str.substring(i*n));
    }
}
