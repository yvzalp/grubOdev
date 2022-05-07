package ödev;

public class Cons{


    // public static int lenght=0;
    protected static int lenght=0;

}

class ConsLenght {
    //static Cons cons1 = new Cons();
   // static Cons cons2 = new Cons();

   // static {
     //   System.out.println(cons1.lenght);
    //}
    static Cons cons1=new Cons();
    static Cons cons2=new Cons();
    static {
        System.out.println(cons1.lenght);
    }


    public static void main(String[] args) {
       // cons1.lenght=2;
        //cons2.lenght=8;

        //System.out.println(cons1.lenght);
        cons1.lenght=2;
        cons2.lenght=8;

        System.out.println(cons1.lenght);

    }
}