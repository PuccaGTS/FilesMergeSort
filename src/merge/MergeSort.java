package merge;

public class MergeSort {

    public static int[] mergeInt(int[] firstArr, int[] secondArr) {
        int[] result = new int[firstArr.length + secondArr.length];
        int firstIndex = 0;
        int secondIndex = 0;

        while (firstIndex + secondIndex < result.length) {
            if (secondIndex == secondArr.length || firstIndex != firstArr.length && firstArr[firstIndex] < secondArr[secondIndex]) {
                result[firstIndex + secondIndex] = firstArr[firstIndex++];
            } else {
                result[firstIndex + secondIndex] = secondArr[secondIndex++];
            }
        }
        return result;
    }

    public static int[] mergeIntReverse(int[] firstArr, int[] secondArr) {
        int[] result = new int[firstArr.length + secondArr.length];
        int firstIndex = 0;
        int secondIndex = 0;

        while (firstIndex + secondIndex < result.length) {
            if (secondIndex == secondArr.length || firstIndex != firstArr.length && firstArr[firstIndex] > secondArr[secondIndex]) {
                result[firstIndex + secondIndex] = firstArr[firstIndex++];
            } else {
                result[firstIndex + secondIndex] = secondArr[secondIndex++];
            }
        }
        return result;
    }


    public static String[] mergeString(String[] firstArr, String[] secondArr) {
        String[] result = new String[firstArr.length + secondArr.length];

        int firstIndex = 0;
        int secondIndex = 0;

        while (firstIndex + secondIndex < result.length) {
            if (secondIndex == secondArr.length || firstIndex != firstArr.length && (firstArr[firstIndex].compareTo(secondArr[secondIndex]) < 0)) {
                result[firstIndex + secondIndex] = firstArr[firstIndex++];
            } else {
                result[firstIndex + secondIndex] = secondArr[secondIndex++];
            }
        }
        return result;
    }

    public static String[] mergeStringReverse(String[] firstArr, String[] secondArr) {
        String[] result = new String[firstArr.length + secondArr.length];

        int firstIndex = 0;
        int secondIndex = 0;

        while (firstIndex + secondIndex < result.length) {
            if (secondIndex == secondArr.length || firstIndex != firstArr.length && (firstArr[firstIndex].compareTo(secondArr[secondIndex]) > 0)) {
                result[firstIndex + secondIndex] = firstArr[firstIndex++];
            } else {
                result[firstIndex + secondIndex] = secondArr[secondIndex++];
            }
        }
        return result;
    }
}
