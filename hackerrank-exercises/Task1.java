import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){

    System.out.println("Please look the if_Else Exercise");
    System.out.println("Please enter an integer !!!");

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    scanner.close();
    if(n==3){
        System.out.println("Weird");
        }
        else if(n>=2 || n<=5 ){
            System.out.println("Not weired");
        }
        else if(n <6 || n >20){
            System.out.println("Weired");
        }
        else if(n>=20){
            System.out.println("Not Weired");
        }




    }
}
