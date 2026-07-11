public class CVariables{
    public static void main(String[] args){
         // variables are containers used to store data

         String name = "Sam";
         System.out.println(name);

         int age = 20;
         System.out.println(age);

         float cgpa = 98.9f;
         System.out.println(cgpa);

         char grade= 'A';
         System.out.println(grade);

         boolean LikeJava = true;
         System.out.println(LikeJava);

         // final -> its a keyword which is used to fix the value overwriting the value wont work with final

         int x=40;
         System.out.println(x);
         //value is 40 
         x=50;
         System.out.println(x);
         //value will be 50 ie overwritten

         final int y=60;
         System.out.println(y);
         
         // y = 10000; // Error: cannot assign a value to final variable y


    }
}