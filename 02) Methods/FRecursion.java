public class FRecursion{
    static int recursion(int k) {
        if (k == 0) {
            return 0;
        }
        return k + recursion(k - 1);
        }
    public static void main(String[] args){
        System.out.println(recursion(5));
    }
}
