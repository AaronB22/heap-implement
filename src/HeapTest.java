import static org.junit.Assert.*;
import org.junit.Test;

public class HeapTest {

    @Test
    public void addIsCorrect() {
    Heap heap = new Heap();
    int[] values = {5, 3, 8, 10, 9, 2, 7};

    for (int val : values) {
        heap.add(val);
    }
    heap.add(1);
    int expected = 1;
    assertEquals(expected, heap.peak());
}

    @Test
    public void peakReturnsCorrectly(){
        Heap heap= new Heap();
        int[] values= {5,3,8,1,9,2,7};
        for( int val: values){
            heap.add(val);
        }
        int expected =1;
        assertEquals(expected, heap.peak());
        
    }

    @Test
    public void popReturnsCorrectly() {
    Heap heap = new Heap();
    int[] values = {5, 3, 8, 1, 9, 2, 7};

    for (int val : values) {
        heap.add(val);
    }

    int expected = 1;
    assertEquals(expected, heap.pop());
}
    @Test
    public void popBubblesCorrectly() {
    Heap heap = new Heap();
    int[] values = {5, 3, 8, 1, 9, 2, 7};

    for (int val : values) {
        heap.add(val);
    }

    int expected = 2;
    heap.pop();
    assertEquals(expected, heap.peak());
}
    
}
