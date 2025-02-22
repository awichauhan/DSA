public class QueueUsingArrays{
    private int[] queue;
    private int top;
    private int bottom;
    private int capacity;
    private int currentSize;

    public QueueUsingArrays(int size){
        capacity = size;
        queue = new int[capacity];
        bottom = -1;
        top = 0;
        currentSize=0;
    }

    public boolean isEmpty(){
        return currentSize == 0;
    }

    public boolean isFull(){
        return currentSize == capacity;
    }

    // ENQUEUE OPERATION
    public void enqueue(int item){
        if(isFull()){
            System.out.println("queue is full");
            return;
        }
        bottom = (bottom+1) % capacity;
        queue[bottom]= item;
        currentSize++;
        System.out.println(item + " is enqueued");
    }

    //DEQUEUE OPERATION

    public void dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        int dequeuedItem = queue[top];
        top = (top+1) % capacity;
        currentSize--;
        System.out.println("dequeued item: " + dequeuedItem);
    }

    // PEEK OPERATION

    public void peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        int peekedItem = queue[top];
        System.out.println("peek item is " + peekedItem);
    }

    public int size() {
        return currentSize;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        int i = top;
        for (int j = 0; j < currentSize; j++) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }

        public static void main(String a[]){
            QueueUsingArrays newQueue = new QueueUsingArrays(6);
            newQueue.enqueue(60);
            newQueue.enqueue(70);
            newQueue.enqueue(90);

            newQueue.peek();
            newQueue.printQueue();
        }
}