import java.util.Stack;

public class Stack_in_Java {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();

        myStack.push("Lion");   // add elements to the top of the stack
        myStack.push("Tiger");
        myStack.push("Cat");
        myStack.push("Elephant");
        System.out.println("Stack: "+myStack);

        System.out.println(myStack.peek()); // show the top of the stack

        myStack.pop(); // deletes the element from the top of the stack
        System.out.println(myStack);  // elephant got popped


    }
}
