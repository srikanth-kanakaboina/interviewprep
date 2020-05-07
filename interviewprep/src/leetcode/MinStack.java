package leetcode;

import java.util.Stack;

class MinStack {

    public Stack<Integer> stack=new Stack<>();
    public Stack<Integer> min=new Stack();
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {

        if (min.isEmpty() || x<= min.peek()){
            min.push(x);
        }
        stack.push(x);
        
    }
    
    public void pop() {
        if (stack.peek().equals(min.peek())){
            min.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }

    public static void main(String[] args) {
        MinStack minStack= new MinStack();


        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("Min Val"+minStack.getMin()); // return -3
        minStack.pop();
        System.out.println("Min Val"+minStack.top());   // return 0
        System.out.println("Min Val"+minStack.getMin());  // return -2

    }
}