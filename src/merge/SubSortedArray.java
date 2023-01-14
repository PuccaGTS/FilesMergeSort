package merge;

import java.util.ArrayList;

public class SubSortedArray {
    public static int[] intMaxSubSortedArray(int[] result) {
        ArrayList<Integer> subList = new ArrayList<>();
        ArrayList<Integer> maxSubList = new ArrayList<>();

        for (int i = 0; i < result.length - 1; i++) {
            subList.add(result[i]);
            if (result[i] <= result[i + 1]) {
                if ((i + 1) == result.length - 1) {
                    subList.add(result[i + 1]);
                }
            } else {
                if (subList.size() > maxSubList.size()) {
                    maxSubList = new ArrayList<>(subList);
                    subList = new ArrayList<>();
                } else {
                    subList = new ArrayList<>();
                }
            }
        }

        if (subList.size() == result.length || subList.size() > maxSubList.size()) {
            return subList.stream().mapToInt(i -> i).toArray();
        } else {
            return maxSubList.stream().mapToInt(i -> i).toArray();
        }
    }

    public static int[] intMaxSubReverseSortedArray(int[] result) {
        ArrayList<Integer> subList = new ArrayList<>();
        ArrayList<Integer> maxSubList = new ArrayList<>();

        for (int i = 0; i < result.length - 1; i++) {
            subList.add(result[i]);
            if (result[i] >= result[i + 1]) {
                if ((i + 1) == result.length - 1) {
                    subList.add(result[i + 1]);
                }
            } else {
                if (subList.size() > maxSubList.size()) {
                    maxSubList = new ArrayList<>(subList);
                    subList = new ArrayList<>();
                } else {
                    subList = new ArrayList<>();
                }
            }
        }

        if (subList.size() == result.length || subList.size() > maxSubList.size()) {
            return subList.stream().mapToInt(i -> i).toArray();
        } else {
            return maxSubList.stream().mapToInt(i -> i).toArray();
        }
    }

    public static String[] stringMaxSubSortedArray(String[] result) {
        ArrayList<String> subList = new ArrayList<>();
        ArrayList<String> maxSubList = new ArrayList<>();

        for (int i = 0; i < result.length - 1; i++) {
            subList.add(result[i]);
            if (result[i].compareTo(result[i + 1]) <= 0) {
                if ((i + 1) == result.length - 1) {
                    subList.add(result[i + 1]);
                }
            } else {
                if (subList.size() > maxSubList.size()) {
                    maxSubList = new ArrayList<>(subList);
                    subList = new ArrayList<>();
                } else {
                    subList = new ArrayList<>();
                }
            }
        }

        if (subList.size() == result.length || subList.size() > maxSubList.size()) {
            return subList.toArray(String[]::new);
        } else {
            return maxSubList.toArray(String[]::new);
        }
    }

    public static String[] stringMaxReverseSubSortedArray(String[] result) {
        ArrayList<String> subList = new ArrayList<>();
        ArrayList<String> maxSubList = new ArrayList<>();

        for (int i = 0; i < result.length - 1; i++) {
            subList.add(result[i]);
            if (result[i].compareTo(result[i + 1]) >= 0) {
                if ((i + 1) == result.length - 1) {
                    subList.add(result[i + 1]);
                }
            } else {
                if (subList.size() > maxSubList.size()) {
                    maxSubList = new ArrayList<>(subList);
                    subList = new ArrayList<>();
                } else {
                    subList = new ArrayList<>();
                }
            }
        }

        if (subList.size() == result.length || subList.size() > maxSubList.size()) {
            return subList.toArray(String[]::new);
        } else {
            return maxSubList.toArray(String[]::new);
        }
    }
}
