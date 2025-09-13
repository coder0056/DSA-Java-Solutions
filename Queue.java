// Queue Implementation 
class Queue {
    int front,rear,size;
    int capacity;
    int[] Queue;
    
    Queue(int cap) {
        front = 0;
        rear = -1;
        capacity = cap;
        size = 0;
        Queue = new int[capacity];
    }
    
    void enqueue(int val) {
        if(size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        Queue[rear] = val;
        size++;
    }
    
    int dequeue() {
        if(size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = Queue[front];
        front = (front+1)%capacity;
        size--;
        return item;
    }
    
    int peek() {
        if(size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return Queue[front];
    }
    
    void display() {
        if(size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue:");
        for(int i = 0; i<size; i++) {
            System.out.print(" " + Queue[(front+i)%capacity]);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Queue qu = new Queue(10);
        qu.enqueue(10);
        qu.enqueue(20);
        qu.enqueue(30);
        qu.enqueue(40);
        qu.enqueue(50);
        qu.enqueue(60);
        
        qu.display();
        
    }
}

