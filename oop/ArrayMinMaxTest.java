package oop;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayMinMaxTest {

    @Test
    public void testFindMinMax() {
        // --- Code input ---
        int[] codeInput = { 80, 2, -3, 14, 95 };
        
        // --- Expected output ---
        int[] expectedOutput = { -3, 95 };
        
        // --- Execution / code output ---
        ArrayMinMax arraySum = new ArrayMinMax();
        int[] codeOutput = arraySum.findMinMax(codeInput);
        
        // --- Assertion ---
        // Memverifikasi output yang dihasilkan
        assertArrayEquals("Test Find MinMax:", expectedOutput, codeOutput);
    }

    @Test
    public void testFindMinMaxEmpty() {
        // --- Code input ---
        int[] codeInput = {};
        
        // --- Expected output ---
        // Empty Array, default value
        int[] expectedOutput = { Integer.MAX_VALUE, Integer.MIN_VALUE };
        
        // --- Execution / code output ---
        ArrayMinMax arraySum = new ArrayMinMax();
        int[] codeOutput = arraySum.findMinMax(codeInput);
        
        // --- Assertion ---
        // Memverifikasi output yang dihasilkan
        assertArrayEquals("Test Find MinMax Empty:", expectedOutput, codeOutput);
    }
}