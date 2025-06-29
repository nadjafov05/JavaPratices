import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("eded daxil edin: ");
        int eded = sc.nextInt();


    }

    public static void ifelseOperators1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("eded daxil edin: ");
        int eded = sc.nextInt();

        if (eded<0){
            System.out.println("Menfi ededdir");
        }else if (eded == 0){
            System.out.println("eded 0 dir");
        }else {
            System.out.println("reqem musbetdir");
        }
    }
    public static void ternaryOperators3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("reqem daxil edin: ");
        int enterNumber = sc.nextInt();


        String neticeEsas = ((enterNumber<0)? "Menfi ededdir": (enterNumber == 0)? "eded 0 dir": (enterNumber >0 && enterNumber <100)? "Yaxsi ededdir": "Boyuk ededdir");
        System.out.println(neticeEsas);
    }
    public static void ternaryOperators2(){


        Scanner sc = new Scanner(System.in);
        System.out.println("reqem daxil edin: ");
        int reqemEnter = sc.nextInt();

        String esasNetice = ((reqemEnter <0)? "Menfi eded": (reqemEnter == 0)? "Reqem 0 dir" : "Musbet eded" );
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