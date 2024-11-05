import java.util.Arrays;

public class qsorts {
    public static int[] quickSort(int[] input){
        if(input.length <= 0){
            return input;
        } else if (input == null) {
            return null;
        } else{
            Arrays.sort(input);
            return input;
        }
    }
}