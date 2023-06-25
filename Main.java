import java.util.Scanner;

class Stack {
    private int maxSize; // Maximum size of the stack
    private int top; // Top of the stack
    private int[] stackArray; // Array to store stack elements

    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Method to add an element to the stack
    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + item);
        } else {
            stackArray[++top] = item;
            System.out.println("Pushed " + item + " to the stack.");
        }
    }

    // Method to remove an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop an element.");
            return -1;
        } else {
            int poppedItem = stackArray[top--];
            System.out.println("Popped " + poppedItem + " from the stack.");
            return poppedItem;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum size of the stack: ");
        int maxSize = scanner.nextInt();
        Stack stack = new Stack(maxSize);

        while (true) {
            System.out.println("Stack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Check if stack is empty");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int item = scanner.nextInt();
                    stack.push(item);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    boolean empty = stack.isEmpty();
                    if (empty) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
            System.out.println();
        }
    }
}
