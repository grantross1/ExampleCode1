/**THIS IS NOT MY CODE!
  *This is code taken from Dr.Bareiss
  *@author Dr.Bareiss
  *Code used for simon game, lab 3
  *For Grant Ross taken from class examples
  */
public interface QueueInterface<T>{
    public boolean isEmpty(); 
    //Interface for queue, is empty and underflow exception
    public T dequeue() throws QueueUnderflowException;
}