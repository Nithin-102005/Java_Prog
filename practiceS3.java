import java.util.Scanner;

class Stack {

    private int[] arr;
    private int top;
    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow! Stack is Full.");
            return;
        }

        arr[++top] = data;
        System.out.println(data + " inserted successfully.");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is Empty.");
            return;
        }

        System.out.println("Deleted Element: " + arr[top--]);
    }

   
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
            return;
        }

        System.out.println("Top Element: " + arr[top]);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
            return;
        }

        System.out.println("\nStack Elements:");

        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
}

public class practiceS3{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Stack Size: ");
        int size = sc.nextInt();

        Stack stack = new Stack(size);

        int choice;

        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Is Full");
            System.out.println("6. Is Empty");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Element: ");
                    int element = sc.nextInt();
                    stack.push(element);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.println(stack.isFull()
                            ? "Stack is Full."
                            : "Stack is Not Full.");
                    break;

                case 6:
                    System.out.println(stack.isEmpty()
                            ? "Stack is Empty."
                            : "Stack is Not Empty.");
                    break;

                case 7:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}