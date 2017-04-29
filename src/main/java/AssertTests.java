package main.java;

import org.hamcrest.core.CombinableMatcher;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.*;

/**
 * Created by HaroonGhawsi on 4/29/2017.
 */
public class AssertTests {


    @Test
    public void testAssertArrayEquals(){
        byte[] expected = "trial".getBytes();
        byte[] actual = "trial".getBytes();
        assertArrayEquals("Failure - byte arrays not same", expected, actual);
    }

    @Test
    public void testAssertEquals(){
        assertEquals("failure - strings not equal", "text", "text");
    }

    @Test
    public void testAssertFalse(){
        assertFalse("failure - should be false", false);
    }

    @Test
    public void testAssertNotNull(){
        assertNotNull("should not be Null", new Object());
    }

    @Test
    public void testAssertNotSame(){
        assertNotSame("Should not be same object", new Object(), new Object());
    }

    @Test
    public void testAssertNull(){
        assertNull("Should be Null", null);
    }

    public void testAssertName(){
        Integer aNumber = Integer.valueOf(768);
        assertSame("Should be same", aNumber, aNumber);
    }

    //JUnit Matchers assertThat

    @Test
    public void testAssertThatBothContainsString(){
        assertThat("album", both(containsString("a")).and(containsString("b")));
    }

    @Test
    public void testAssertThatHasItems(){
        assertThat(Arrays.asList("one", "two", "three"), hasItems("one", "three"));
    }

    @Test
    public void testAssertThatEveryItemContainsString(){
        assertThat(Arrays.asList(new String[] { "fun", "ban", "net"}), everyItem(containsString("n")));
    }

    //Core Hamcrest Matchers with AssertThat

    @Test
    public void testAssertThatHamcrestCoreMatchers(){
        assertThat("good", allOf(equalTo("good"), startsWith("good")));
        assertThat("good", not(allOf(equalTo("bad"), equalTo("good"))));
        assertThat("good", anyOf(equalTo("bad"), equalTo("good")));
        assertThat(7, not(CombinableMatcher.<Integer> either(equalTo(3)).or(equalTo(4))));
        assertThat(new Object(), not(sameInstance(new Object())));

    }

    @Test
    public void testAssertTrue(){
        assertTrue("failure - should be true", true);
    }
}
