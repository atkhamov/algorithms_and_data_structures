package com.atkhamov.selftraining;

import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("Stack: " + stack);
        showPush(stack, 42);
        showPush(stack, 66);
        showPush(stack, 33);
        System.out.println("----------");
        showPop(stack);
        System.out.println("----------");
        showPop(stack);

        System.out.println(stack.empty());
        System.out.println(stack.peek());
        System.out.println(stack.search(42));
    }

    static void showPush(Stack stack, int a){
        stack.push(new Integer(a));
        System.out.println("Push(" + a + ")");
        System.out.println("Stack: " + stack);
    }

    static void showPop(Stack stack){
        System.out.println("Pop -> ");
        Integer a = (Integer) stack.pop();
        System.out.println(a);
        System.out.println("Stack: " + stack);
    }
}
