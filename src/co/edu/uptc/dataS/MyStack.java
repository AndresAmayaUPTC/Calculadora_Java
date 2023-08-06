package co.edu.uptc.dataS;


public class MyStack<T> {
    private Node<T> top;
    private int size;

    // Constructor
    public MyStack() {
        top = null;
        size = 0;
    }

    // Clase interna para representar los nodos de la lista enlazada
    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return size == 0;
    }

    // Método para obtener el tamaño de la pila
    public int size() {
        return size;
    }

    // Método para agregar un elemento a la pila (push)
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Método para eliminar y obtener el elemento en la parte superior de la pila (pop)
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía.");
        }

        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    // Método para obtener el elemento en la parte superior de la pila sin eliminarlo (peek)
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía.");
        }

        return top.data;
    }

    // Método para imprimir los elementos de la pila
    public void printStack() {
        Node<T> current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println("Elementos en la pila:");
        myStack.printStack();

        System.out.println("Tamaño de la pila: " + myStack.size());

        System.out.println("Elemento en la parte superior de la pila: " + myStack.peek());

        System.out.println("Elementos eliminados de la pila:");
        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
    }
}

