package Day8;

public class Casting {
    public static void main(String[] args) {
        int d1 =  (int)10.8;
        int i1 =  (int)10L;
        float f1 = (float)11.254;

        System.out.println(d1);
        System.out.println(i1);
        System.out.println(f1 +"\n");

        System.out.println(f1 =(i1+d1));
        System.out.println((d1 =(int)(i1+f1))+ "\n");

        Realational();;
    }

    public static void Realational(){

        boolean b1= (3==6);
        boolean b2 = (4!=8);
        boolean b3 = (10==20);
        boolean b4 = (2+4) > (3+5);
        
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4 +"\n"); 

        LogicalOperators();
    }
    
    public static void LogicalOperators(){

        boolean b1 = true && true;
        boolean b2 = b1 && true && false;
        boolean b3 = b2 || b1 || true;
        boolean b4 = !(b1 && b2 || b3);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);


    }
}
