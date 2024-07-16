 package Day6;

public class CallingString {
    public static void main(String[] args) {

        UpperLowerCase(); 
    }

    public static void UpperLowerCase(){

        String s1 = "Hello World";
       //String z1 = s1.toLowerCase();

        System.out.println(s1.toLowerCase());
        //System.out.println(z1);
        System.out.println(s1.toUpperCase());

        length();
    }

    public static void length(){
    
        //find the length of the string 
        String l1 = "Helllo World";
        //int z = l1.length();
        //System.out.println(z);
        System.out.println(l1.length());

        Empty();
    }
    public static void Empty(){

        String e1 = "Laye Camara";
        System.out.println(e1.isEmpty());

        index();
    }
    public static void index(){

        String i1 = "camara";
        //int b = i1.indexOf('a');


        System.out.println(i1.indexOf('c'));
        System.out.println(i1.lastIndexOf('a'));

        chArt();
    }
    public static void chArt(){

        String c1 = "Computer Programming";

        char c = c1.charAt(9);

        System.out.println(c);

        concat();
    }
    public static void concat(){

        String c1 = "Computer";
        String c2 = c1.concat("-"+"Programming");

        System.out.println(c2);

        Blank();
    }
    public static void Blank(){
        String b1 = " ";

        System.out.println(b1.isBlank());

    }
}
