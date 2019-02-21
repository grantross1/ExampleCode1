/**THIS IS NOT MY CODE!
  *This is code taken from Dr.Bareiss
  *@author Dr.Bareiss
  *Code used for simon game, lab 3
  *For Grant Ross taken from class examples
  */
public interface BoundedQueueInterface<T> extends QueueInterface<T> {
    public boolean isFull();
    public void enqueue(T element) throws QueueOverflowException;
}