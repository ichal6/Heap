import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HeapTest {

    @Test
    public void when_fill_heap_should_peek_10() {
        //given
        Heap mainHeap = new Heap();
        int expected = 10;
        //when
        mainHeap.add(15);
        mainHeap.add(17);
        mainHeap.add(20);
        mainHeap.add(10);

        int result = mainHeap.peek();
        //then
        assertEquals(expected, result);
    }

    @Test
    public void when_fill_heap_should_poll_10() {
        //given
        Heap mainHeap = new Heap();
        int pollExpected = 10;
        int peekExpected = 15;
        //when
        mainHeap.add(15);
        mainHeap.add(17);
        mainHeap.add(20);
        mainHeap.add(10);

        int pollResult = mainHeap.poll();
        int peekResult = mainHeap.peek();
        //then
        assertEquals(pollExpected, pollResult);
        assertEquals(peekExpected, peekResult);
    }

    @Test
    public void when_fill_heap_add_new_minimum_value() {
        //given
        Heap mainHeap = new Heap();
        int expected = -1000;
        //when
        mainHeap.add(15);
        mainHeap.add(17);
        mainHeap.add(20);
        mainHeap.add(10);

        mainHeap.add(-1000);

        int result = mainHeap.peek();
        //then
        assertEquals(expected, result);
    }
}