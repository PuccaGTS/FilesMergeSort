package fileManager;

import exeptions.FileContainsUnsortedIntArray;
import exeptions.SpaceContainsException;
import merge.SubSortedArray;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private static final String DIRECTORY = "workDirectory/";

    public static int[] readIntegerFile(String path, boolean isReverse) {
        boolean flag = true;
        ArrayList<String> listOfBrokenData = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(DIRECTORY + path))) {
            while (br.ready()) {
                String data = br.readLine();
                try {
                    if (data.contains(" ")) {
                        flag = false;
                        listOfBrokenData.add(data);
                    } else {
                        list.add(Integer.parseInt(data));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (!flag) {
                throw new SpaceContainsException(path, listOfBrokenData);
            }
        } catch (IOException | SpaceContainsException e) {
            e.printStackTrace();
        }
        int[] result = list.stream().mapToInt(i -> i).toArray();
        int[] sortedResult = isReverse ? SubSortedArray.intMaxSubReverseSortedArray(result) : SubSortedArray.intMaxSubSortedArray(result);

        if (result.length != sortedResult.length) {
            try {
                throw new FileContainsUnsortedIntArray(path, sortedResult);
            } catch (FileContainsUnsortedIntArray e) {
                e.printStackTrace();
            }
            return sortedResult;
        } else {
            return result;
        }
    }

    public static String[] readStringFile(String path, boolean isReverse) {
        boolean flag = true;
        ArrayList<String> listOfBrokenData = new ArrayList<>();

        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(DIRECTORY + path))) {
            while (br.ready()) {
                String data = br.readLine();
                if (data.contains(" ")) {
                    flag = false;
                    listOfBrokenData.add(data);
                } else {
                    list.add(data);
                }
            }
            if (!flag) {
                throw new SpaceContainsException(path, listOfBrokenData);
            }
        } catch (IOException | SpaceContainsException e) {
            e.printStackTrace();
        }

        String[] result = list.toArray(String[]::new);
        String[] sortedResult = isReverse ? SubSortedArray.stringMaxReverseSubSortedArray(result) : SubSortedArray.stringMaxSubSortedArray(result);

        if (result.length != sortedResult.length) {
            try {
                throw new FileContainsUnsortedIntArray(path, sortedResult);
            } catch (FileContainsUnsortedIntArray e) {
                e.printStackTrace();
            }
            return sortedResult;
        } else {
            return result;
        }
    }

    public static void writeFile(String path, int[] mergedIntArray) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(DIRECTORY + path))) {
            for (int i = 0; i < mergedIntArray.length; i++) {
                bw.write(mergedIntArray[i] + "\n");
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(String path, String[] mergedStringArray) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(DIRECTORY + path))) {
            for (int i = 0; i < mergedStringArray.length; i++) {
                bw.write(mergedStringArray[i] + "\n");
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
