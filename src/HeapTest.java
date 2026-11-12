import static org.junit.Assert.*;
import org.junit.Test;

public class HeapTest {

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
    
}
