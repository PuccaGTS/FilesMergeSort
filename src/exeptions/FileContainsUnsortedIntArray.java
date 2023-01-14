package exeptions;

import java.util.Arrays;

public class FileContainsUnsortedIntArray extends Exception {
    private final String pathFile;
    private int[] intSortedArray;
    private String[] stringSortedArray;

    public FileContainsUnsortedIntArray(String pathFile, int[] intSortedArray) {
        this.pathFile = pathFile;
        this.intSortedArray = intSortedArray;
    }

    public FileContainsUnsortedIntArray(String pathFile, String[] stringSortedArray) {
        this.pathFile = pathFile;
        this.stringSortedArray = stringSortedArray;
    }

    @Override
    public String toString() {
        return "File \"" + pathFile + "\" contains unsorted array" + "\nSorted array used: " + (stringSortedArray == null ? Arrays.toString(intSortedArray) : Arrays.toString(stringSortedArray));
    }
}
