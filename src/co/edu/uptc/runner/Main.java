package co.edu.uptc.runner;

import co.edu.uptc.dataS.MyStack;

public class Main {
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

