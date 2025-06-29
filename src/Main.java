import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }


    public static void ternaryOperators(){
        int a = 0;
        String netice = ((a>0)? "Musbet ededdir" : "Menfi ededdir");
        System.out.println(netice);

        int b = 7;
        int c = 11;
        int netice1 = ((b>c)? b : c);
        System.out.println(netice1);

        int enterBrithday = 15;
        String resultBrithday = ((enterBrithday>18)? "18 yasiniz var" : "18 yasiniz yoxdur");
        System.out.println(resultBrithday);
    }
    public static void assignmentOperators(){
        Scanner sc = new Scanner(System.in);
        System.out.println("bir eded daxil edin: ");
        int a = sc.nextInt();
        a += 10;
        System.out.println(a);

        a -= 5;
        System.out.println(a);

        a *= 3;
        System.out.println(a);

        a /= 2;
        System.out.println(a);

        a%=4;
        System.out.println(a);
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
    public static void relationalOperators(){
        int a = 6;
        int b = 2;

        System.out.println(a == b);

        System.out.println(a < b);

        System.out.println(a > b);

        System.out.println(a <= b && a >= b && b <= a && b >= a);

        System.out.println(a != b);
    }
}