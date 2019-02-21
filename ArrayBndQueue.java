/**THIS IS NOT MY CODE!
  *This is code taken from Dr.Bareiss
  *@author Dr.Bareiss
  *Code used for simon game, lab 3
  *For Grant Ross taken from class examples
  */
public class ArrayBndQueue<T> implements BoundedQueueInterface<T> {
    public static final int DEFCAP = 100; 
    protected T[] queue; //the queue
    protected int numElements;
    protected int front; 
    protected int rear;
    
    public ArrayBndQueue() {
        queue = (T[]) new Object[DEFCAP];
        numElements = 0;
        rear = -1;
        front = 0;
    }
    
    public ArrayBndQueue(int maxSize) { //set the max size
        queue = (T[]) new Object[maxSize];
        numElements = 0;
        rear = -1;
        front = 0;
    }
    
    public boolean isEmpty () { //checks if queue is empty
        return numElements == 0;
    }
    
    public boolean isFull() { //check if queue is full
        return numElements == queue.length;
    }
    //adds to queue
    public void enqueue(T element) throws QueueOverflowException {
    //if enqeue attempted on full queue
        if (isFull())
            throw new QueueOverflowException
                ("Enqueue attempted on full queue");
        //else add
        else {
            rear = (rear + 1) % queue.length;
            queue[rear] = element;
            numElements++;
        }
    }
    
    public T dequeue() throws QueueUnderflowException {
        T toReturn;
        //remove from top
        if (isEmpty())
            throw new QueueUnderflowException
            ("Dequeue attempted on empty queue");
        else {
            toReturn = queue[front];
            queue[front] = null;
            front = (front + 1) % queue.length;
            numElements--;
   /*       toReturn = queue[0]
            for (int i=1; i <= rear; i++)
                queue[i-1]=queue[i];
            rear--;
            numElements--; -> for fixed front */
            return toReturn;
        }
    }
    
    public String toString() {
        String str;
        int location;
        
        str="Queue\n";
        location = front;
        for (int i = 1 ; i <= numElements; i++) {
            str +="   "+queue[location].toString()+"\n";
            location = (location + 1) % queue.length;
        }
        return str;
    }
}
