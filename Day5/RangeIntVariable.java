package Day5;

public class RangeIntVariable {
    public static void main(String[] args){
        int i1 =  2147483647;
        int i2 = -2147483648;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i1*(2)+i2*(-3));
        System.out.println(i1-i2);

        VariableRange();
        //MaxMin();
    }
    public static void VariableRange(){

        byte b1 = 10;
        short s1 = 20;
        int i1 = 30;
        long l1 = 40;
        double d1 = 55.5;
        float f1 = 0.5F;
        char c1 = 'A';
        char c2 = 65;
        boolean istrue = 50 > 5;
        boolean isfalse = 10 > 20;
       
       

        d1 = s1*(2/2) + b1*(8) + f1/2 + i1 + l1*2;
        d1 = i1 * 2;

        System.out.println(d1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(istrue);
        System.out.println(isfalse);
        MaxMin();
    }
    public static void MaxMin(){


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
    }
    
}