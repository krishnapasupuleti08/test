package academy.learnprogramming.stacks;


import academy.learnprogramming.lists.Employee;

public class StackExample {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Krishna","Mohan",123));
        stack.push(new Employee("Aruna","Kumari",234));
        stack.push(new Employee("Bala","Pasupuleti",345));

        stack.printStack();


        System.out.println("*****************************************");
        System.out.println(stack.peek());

        stack.pop();

        System.out.println("****************************************");

        stack.printStack();

    }
}
