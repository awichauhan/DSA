class StackUsingLinkedList{
     private Node top;

     public StackUsingLinkedList(){
         this.top = null;
     }

     // to check if stack is empty
    public boolean isEmpty(){
        return top == null;
    }

     // push operation
    public void push(int data){
         Node newNode = new Node(data);
         newNode.next = top;
         top = newNode;
    }

    //pop operation
    public int pop(){
         if(isEmpty()){
             System.out.println("stack overflow; stack is empty");
             return -1;
         }
         int poppedData = top.data;
         top = top.next;
         return poppedData;
    }

    //peek operation
    public int peek(){
         if(isEmpty()) {
             System.out.println("stack is empty");
             return -1;
         }
         return top.data;
    }

    //displaying stack
    public void display(){
         if(isEmpty()){
             System.out.println("stack is empty");
             return;
         }
         Node temp = top;
         System.out.println("stack: ");
         while(temp != null){
             System.out.print(temp.data + "-->");
             temp= temp.next;
         }
         System.out.println("null");
    }

    public static void main(String a[]){
         StackUsingLinkedList newStack = new StackUsingLinkedList();
         newStack.push(20);
         newStack.push(30);
         newStack.push(40);
         newStack.push(90);
         newStack.push(67);
         newStack.peek();
         newStack.pop();
         newStack.display();
    }
}