public class GMathsLib{
    public static void main(String[] args){
        int x=5;
        int y=10;

        // min, max -> to find min and max of two fn
        System.out.println(Math.min(5,10));
        System.out.println(Math.max(5,10));

        // sqrt -> for square root
        System.out.println(Math.sqrt(4));

        // abs -> it returns absolute positive value
        System.out.println(Math.abs(-4.5));

        // Math.pow(x, y) -> method returns the value of x raised to the power of y
        System.out.println(Math.pow(2,2));

        /*Math.round(x) -> rounds to the nearest integer
          Math.ceil(x) -> rounds up (returns the smallest integer greater than or equal to x)
          Math.floor(x) -> rounds down (returns the largest integer less than or equal to x) 
        */
       System.out.println(Math.round(4.5));
       System.out.println(Math.ceil(4.4));
       System.out.println(Math.floor(4.4));

       //Math.random() -> returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
       System.out.println(Math.random());

       // to generate number betweeen 0 to 100 u can * by 101;
       System.out.println(Math.random()* 101);//generates a double


    }
}