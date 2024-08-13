public class method_overloading {  // when two methods have same name but different no. of parameters
    static  int add(int a,int b){    // two parameters
        return a+b;

    }
    static  int add(int a,int b,int c){  // three parameters
        return a+b+c;

    }

    public static void main(String[] args) {
        System.out.println(add(1,4));
        System.out.println(add(3,5,7));
    }
}

