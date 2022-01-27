//javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
//java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest


import static org.junit.Assert.*;
//static 
import org.junit.*;

public class MarkdownParseTest {
    //declare a test method
    @Test
    public void addition() {
        //expected and actual values
        assertEquals(2, 1 + 1);
    }
}