
import java.util.ArrayList;
import java.util.List;

/**
 * A min-heap. 
 * 
 * Must contain functionality for the following: (n = # of elements in heap)
 * 
 * Adding a new value to the heap  O(log(n))
 * Popping the front of the heap O(log(n))
 * Peeking at the front of the heap without removing the element O(1)
 * Getting the size of the heap O(1)
 * Checking whether the heap is empty O(1)
 * 
 * 
 * The Heap must hold ints
 * 
 * Use List/ArrayList as a backing array, but DO NOT use the 
 * PriorityQueue class. Do not make Node objects, use array
 * indexing instead.
 * 
 * It is up to you to make design decisions about how to:
 *  - name methods
 *  - determine return value and argument types
 *  - hold private instance variables
 */
public class Heap {
    private final List<Integer> heapArray;

    public Heap(){
        this.heapArray= new ArrayList<>();
    }


    public void add(int x){
        heapArray.add(x);
        bubbleUp(heapArray.indexOf(x));
    }
    public int pop(){
       int currHead= heapArray.getFirst();
        heapArray.set(0, heapArray.getLast());
       return currHead;
    }
    public int peak(){
        return heapArray.getFirst();
    }

    public int size(){
        return heapArray.size();
    }

    public boolean isEmpty(){
        if(!heapArray.isEmpty()) return false;
        return true;
    }

    private void bubbleUp(int postion){
        int parent = ((postion-1)/2);
        if(postion==0||heapArray.get(parent)<heapArray.get(postion)) return;
        if(heapArray.get(parent)>heapArray.get(postion)){
            int tempParent= heapArray.get(parent);
            heapArray.set(parent, heapArray.get(postion));
            heapArray.set(postion, tempParent);
            postion=parent;
        }
        bubbleUp(postion);
        
    }
    
}