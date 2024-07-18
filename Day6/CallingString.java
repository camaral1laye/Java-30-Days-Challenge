 package Day6;

public class CallingString {
    public static void main(String[] args) {

        UpperLowerCase(); 
    }

    public static void UpperLowerCase(){

        String s1 = "LayE CaMarA";
        String s2 = s1.toLowerCase();

        System.out.println(s1.toUpperCase());
        System.out.println(s2 +"\n");


        length();
    }

    public static void length(){

        String l1 = " Computer Science";
        int i1 = l1.length();

        System.out.println(l1.length());
        System.out.println(i1+"\n");
    

        Empty();
    }
    public static void Empty(){

        String E1 = "Amazon";
        String E2 = "";

        System.out.println(E1.isEmpty());
        System.out.println(E2.isEmpty()+"\n");

       
        index();
    }
    public static void index(){

        String i1 =  "Google";

        System.out.println(i1.indexOf('G'));
        System.out.println(i1.lastIndexOf('o')+"\n");

        chArt();
    }
    public static void chArt(){

        String c1 = "Meta";
        char c2 = c1.charAt(3);
        
        System.out.println(c1.charAt(0));
        System.out.println(c2+"\n");

        concat();
    }
    public static void concat(){

        String t1 = "Stockton";
        String t2 = " University";

        System.out.println(t1.concat(t2)+"\n");
    
        Blank();
    }
    public static void Blank(){

        String b1 = "Adama Keita";
        String b2 = "";

        System.out.println(b1.isBlank());
        System.out.println(b2.isBlank());

    }
    
}
