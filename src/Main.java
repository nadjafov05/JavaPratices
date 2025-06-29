import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }


    public static void logisticalOperators(){
        Scanner enterNumbersUser = new Scanner(System.in);

        System.out.println("birinci reqemi daxil edin: ");
        int a = enterNumbersUser.nextInt();

        System.out.println("ikinci reqemi daxil edin: ");
        int b = enterNumbersUser.nextInt();

        if (a >= 0 && b >= 0){
            System.out.println("her iksi musbetdir");
        }else if (a<=0 && b <= 0){
            System.out.println("her iksi menfidir");
        }else if (a <= 0 || b <= 0){
            System.out.println("en azi biri sifirdir");
        }else if (!(a>=0)){
            System.out.println("birinci reqem musbet deyil");
        }
    }
    public static void RelationalOperators(){
        int a = 6;
        int b = 2;

        System.out.println(a == b);

        System.out.println(a < b);

        System.out.println(a > b);

        System.out.println(a <= b && a >= b && b <= a && b >= a);

        System.out.println(a != b);
    }
}