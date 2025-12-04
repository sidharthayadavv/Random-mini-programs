// package Stack;
class Stack{
    public static void main(String[] args){
        System.out.println("Hello, Stack!");
        // char ch='a';
        // while(ch!='q'){
        System.out.println("****New Stack Impl****");
        Stack stk=new Stack();
        stk.pop();
        stk.push(5);
        stk.push(9);
        stk.push(2);
        stk.push(3);
        stk.push(7);
        stk.push(0);
        stk.pop();
        stk.pop();
        stk.pop();
        // }
        
    }
    int top=-1;
    int[] stack = new int[5];
    void push(int num){
        if(isFull()){
           System.out.println("StackFull");
           return;
        }
        top++;
        stack[top]=num;
    }
    void pop(){
        if(isEmpty()){
            System.out.println("stack empty cant pop");
            return;
        }
        System.out.println("Top element: "+stack[top]);
        top--;
    }
    Boolean isEmpty(){
        if(top==-1) return true;
        return false;
    }
    Boolean isFull(){
        if(top==stack.length-1) return true;
        return false;
    }
}