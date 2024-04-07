package week10;

public class Task5<T> {
    private int maxSize;
    private int top;
    private T[] stackArray;

    public Task5(int size) {
        this.maxSize = size;
        this.top = -1;
    }

    public void push(T element) throws StackFullException {
        if (isFull()) {
            throw new StackFullException("Stack is full");
        }
        stackArray[++top] = element;
    }

    public T pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty");
        }
        return stackArray[top--];
    }

    public T peek() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty");
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

class StackFullException extends Exception {
    public StackFullException(String message) {
        super(message);
    }
}

class StackEmptyException extends Exception {
    public StackEmptyException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        Task5<Integer> intStack = new Task5<>(5);
        try {
            for (int i = 10; i <= 50; i += 10) {
                intStack.push(i);
            }
            intStack.push(60); 
        } catch (StackFullException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            while (!intStack.isEmpty()) {
                System.out.println("Peek: " + intStack.peek());
                System.out.println("Pop: " + intStack.pop());
            }
            System.out.println("Peek: " + intStack.peek());
            System.out.println("Pop: " + intStack.pop());   
        } catch (StackEmptyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
