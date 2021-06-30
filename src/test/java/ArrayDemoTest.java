import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ArrayDemoTest {
    private ArrayDemo arrayDemo= null;
    @BeforeEach
    void init(){
        arrayDemo = new ArrayDemo();
    }

    @Test
    void Test(){
        //fail("Not yet implemented");
        int expected = 5;
        int actual = arrayDemo.add(3,2);
        assertEquals(expected,actual,"Testing the add method");
    }
}
