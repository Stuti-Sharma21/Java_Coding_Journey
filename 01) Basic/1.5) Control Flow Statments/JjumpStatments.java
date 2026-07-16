public class JjumpStatments{
    public static void main(String[] args){
        // jump statments -> control flow constructs in programming that alter the normal sequential execution of code by transferring control directly to another part of the program.

        // break -> break stament is used to exit the loop as soon as that condition is reached;
        for(int i=1;i<10;i++){
            if(i%2==0){
                break;
            }
            else{
                System.out.println("hellooooo");
            }
            
        }

        // continu -> will skip one value which satisfies the condition but continue with the others
        for(int i=0;i<10;i++){
            if(i==5){
                continue; //5th iteration will be skipped
            }
            else{
                System.out.println();
            }
        }

        // goto -> is not supported in java
    }
}