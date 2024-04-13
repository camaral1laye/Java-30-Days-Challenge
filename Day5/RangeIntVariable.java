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
        MaxMin();
    }
    public static void VariableRange(){

        byte b1 = 10;
        short s1 = 20;
        int i1 = 30;
        long l1 = 40;

        i1 = s1*(2/2) + b1*(8);
        l1 = i1 * 2;

        System.out.println(l1);
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
    }
    
}
