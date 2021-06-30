package string;

import com.cosmos.string.StringProgram;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProgramTest {
    private static StringProgram stringProgram=null;
    @BeforeAll
    static void init(){
        stringProgram=new StringProgram();
    }
    @Test
    public void testReverseString(){
        String str = "abcdef";
        String rev = "fedcba";
        assertEquals(stringProgram.reverseString(str),rev,"Trying to reverse a String");
    }

}