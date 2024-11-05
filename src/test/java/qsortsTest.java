import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
class qsortsTest {
    @ParameterizedTest(name="{0}")
    @MethodSource("generator")

    public void qsortT(String name, int[] input){
        int[] expected = Arrays.copyOf(input, input.length);
        Arrays.sort(expected);
        Arrays.sort(input);
        assertArrayEquals(expected, input);
    }
    @Test
    // test case 3
    public void nullArr() {
        int[] input = null;
        assertThrows(NullPointerException.class, () -> {
            Arrays.copyOf(input, 0);
        });
    }
    static Stream<Arguments> generator(){
        Arguments tc1 = Arguments.of("Array of 3", new int[]{3,1,2});
        Arguments tc2 = Arguments.of("Empty Array", new int[]{});
        Arguments tc4 = Arguments.of("Negative Array", new int[]{-4,-2,-3,-1});
        Arguments tc5 = Arguments.of("Array of One", new int[]{0}); //
        return Stream.of(tc1, tc2, tc4, tc5);
    }
  
}