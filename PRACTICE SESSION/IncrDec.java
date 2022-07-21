public class IncrDec{


    public static void main(String[]args){

        int a= 10;
        int b= 10;
        int c = 0;

       c = a++ - ++b + -a + b + a + b++;
       
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    
    }
}