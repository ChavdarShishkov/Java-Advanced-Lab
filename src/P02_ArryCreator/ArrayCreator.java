package P02_ArryCreator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator {


    public static <T> T[] createArray(int length, T item) {
        T[] arr = (T[]) Array.newInstance(item.getClass(), length);

        Arrays.fill(arr, item);

        return arr;
    }

}
