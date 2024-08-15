@FunctionalInterface
interface calculate{
    int add(int a,int b);
}
public class Functional_Interface2 {
    public static void main(String[] args){
        calculate cal = (a,b) -> a+b;
        int result=cal.add(1,5);
        System.out.println(result);
    }
}
