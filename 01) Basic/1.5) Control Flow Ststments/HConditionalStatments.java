public class HConditionalStatments{
    public static void main(String[] args){
        boolean likeJava=true;
         
        if(likeJava){
            System.out.println("Lets continue learning");
        }
        else{
            System.out.println("Its okay,u are made for greater things");
        }


        // else if -> when we have to check for multiple conditions
        int x=2;
        int y=5;
        int z=15;

        if(x>y){
            System.out.println("x is bigger y");
        }
        else if(y>z){
            System.out.println("y is bigger than z");
        }
        else{
            System.out.println("z is the biggest number here");
        }

        // ternary operator -> condition? result is condition true: result if condition false;
        String result= (5>8)? " java is fun" : "i dont like java that much";
        System.out.println(result);

        // nested if else -> to check condition inside condition
        int a=9;
        int b=8;
        int c=7;
        
        if(a<b){
            if(b<c){
                System.out.println("c is the biggest number here");
            }
            else{
                System.out.println("b is the biggest number here");
            }
        }
        else{
            System.out.println("a is the biggest number here");
        }

        // switch -> we can use this instead of many if statments

        int day=4;

        switch(day){
            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("Tuesday");
            
            case 3: 
                System.out.println("Wednesday");

            case 4:
                System.out.println("Thursday");
        }

    }
}