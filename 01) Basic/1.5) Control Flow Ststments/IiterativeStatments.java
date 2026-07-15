public class IiterativeStatments{
    public static void main(String[] args){
        /*// while -> its an entry control loop which means it checks 
        the condition before executing body and executes only if true.(min iteration can be 0)
        it keeps on working untill the condition turns false  */

        int x=5;
        while(x>=0){
            System.out.println("So fun");
            x--;
        }

        /* do while -> its an exit control loop is executes body before and then checks 
        the condition and will execute untill the statment becomes false
         ,(minimum execution is 1 because it will work once regardless).*/
        
        int y=6;
        do{
            System.out.println("I am kinda happy rn");
            y--;
        }
        while(y>0);

        /* for -> when we know exactly how many times we have to loop  */
         for(int i=0;i<5;i++){
            System.out.println("A");
         }
    }
}