class StackUsingArray {
    public int top;
    public int arr[];
    public int capacity;

    public StackUsingArray(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity -1;
    }

    public void push(int value){
        if (isFull()){
            System.out.println("Stack overflow; cant push");
        }
        arr[++top]= value;
        return;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack overflow; cant pop");
            return -1;
        }
        return arr[top--];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("stack overflow; cant peek");
            return -1;
        }
        return arr[top];
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements are as follows: ");
        for( int i=0; i <= top; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String a[]){

        StackUsingArray stack = new StackUsingArray(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();

        System.out.println("peeked element: " + stack.peek());
        System.out.println("popped element: " + stack.pop());
        stack.display();
    }
}