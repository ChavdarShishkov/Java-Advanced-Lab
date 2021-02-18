package Lab_07_Generics.P02_GenericArrayCreator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator {

    public static <T> T[] create(int length, T item) {
        T[] array = (T[]) new Object[length];
        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return array;
    }


    public static <T> T[] create(Class<T> tClass, int length, T item) {
        T[] array = (T[]) Array.newInstance(tClass, length);
        Arrays.fill(array, item);
        return array;
    }
}