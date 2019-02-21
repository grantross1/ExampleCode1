/** Description of class
  *
  * @author		Grant Ross
  * @id			gross
  * @course		Programming II
  * @assignment		SimonGame lab
  * @related		Lab3, ArrayBndQueue, BoundedQueueInterface
  * @included		BoundedQueueInterface, ArrayBndQueue
  */
import java.util.Random;                      //For random input
import java.util.Scanner;                
import java.io.*;

public class SimonGame {
    BoundedQueueInterface<Integer> queue;     //set queue interface
    Scanner scanner = new Scanner(System.in); //make scanner
    int storeQueue; //where we will store the queue value
    int line = 0;   //what the current input is for the guess      
    int r = 0;      //r is a counter for what round we are on
                    //...or how many things are in the queue
    
    public SimonGame() {
        queue = new ArrayBndQueue<Integer>(); // make new queue
    }
    
    public void start() {
        System.out.println("Starting the game");
        add();                     //add a new queue 
        print();                   //print out the queue
        check();                   //have the user try to answer the simon game
    }
    
    public void add() {
        r++;                        //rounds goes up by 1
        queue.enqueue(random());    //add a new random simon game move
    }
    
    public void print() {
        int temp;                   //temp counter
        temp = r;                   //set to r
        while (temp != 0) {         //while counter is not at 0 keep running
            storeQueue = queue.dequeue();   
            //take the top, set to equal to storeQueue
            System.out.println(storeQueue); 
            //print that storeQueue out
            queue.enqueue(storeQueue);      
            //add back in the top to now the back
            temp--;                         
            //counter goes down... repeat loop until back to original state
        }
    }
    
    public void check() {
        int temp;                           //temp counter
        temp = r;                           //set to r
            while (temp != 0) {
                 storeQueue = queue.dequeue();       
                 //take the top off and set to store queue
                 queue.enqueue(storeQueue);          
                 //add back the old top to the back
                 temp--;                             
                 //counter moves down
                 System.out.print("Take a guess: "); 
                 //take a guess at the original top
                 line = scanner.nextInt();    
                 if (line == storeQueue){            
                 //check if right
                     System.out.println("Correct!"); 
                     //Correct!... loop again if counter on while is true
                 }
                     else {
                         System.out.println("Wrong!"); 
                         //if not right than wrong  
                         break;                        
                         //break the loop
                      }
                 if (temp == 0) {                      
                 //if the counter is done... start, start again.
                      start();
                 }

            }
    }
    
    public int random() {                             
    //gives random number found on the oracle website!
        Random rn = new Random();
        int answer = rn.nextInt(4) + 1;
        return answer;
    }
}