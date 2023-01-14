import fileManager.FileManager;
import merge.MergeSort;

public class Main {
    public static void main(String[] args) {
        switch (args[0]) {
            case "-a":
                String output = args[2];
                if (args[1].equals("-i")) {
                    int[] result = FileManager.readIntegerFile(args[3], false);
                    for (int i = 4; i < args.length; i++) {
                        result = MergeSort.mergeInt(result, FileManager.readIntegerFile(args[i], false));
                    }
                    FileManager.writeFile(output, result);

                } else if (args[1].equals("-s")) {
                    String[] result = FileManager.readStringFile(args[3], false);

                    for (int i = 4; i < args.length; i++) {
                        result = MergeSort.mergeString(result, FileManager.readStringFile(args[i], false));
                    }
                    FileManager.writeFile(output, result);
                } else {
                    System.out.println("Неверный ввод");
                }
                break;
            case "-d":
                output = args[2];
                if (args[1].equals("-i")) {
                    int[] result = FileManager.readIntegerFile(args[3], true);
                    for (int i = 4; i < args.length; i++) {
                        result = MergeSort.mergeIntReverse(result, FileManager.readIntegerFile(args[i], true));
                    }
                    FileManager.writeFile(output, result);
                } else if (args[1].equals("-s")) {
                    String[] result = FileManager.readStringFile(args[3], true);
                    for (int i = 4; i < args.length; i++) {
                        result = MergeSort.mergeStringReverse(result, FileManager.readStringFile(args[i], true));
                    }
                    FileManager.writeFile(output, result);
                } else {
                    System.out.println("Совсем неверный ввод");
                }
                break;
            case "-i":
                output = args[1];
                int[] resultInt = FileManager.readIntegerFile(args[2], false);
                for (int i = 3; i < args.length; i++) {
                    resultInt = MergeSort.mergeInt(resultInt, FileManager.readIntegerFile(args[i], false));
                }
                FileManager.writeFile(output, resultInt);
                break;
            case "-s":
                output = args[1];
                String[] resultString = FileManager.readStringFile(args[2], false);
                for (int i = 3; i < args.length; i++) {
                    resultString = MergeSort.mergeString(resultString, FileManager.readStringFile(args[i], false));
                }
                FileManager.writeFile(output, resultString);
                break;
            default:
                System.out.println("Неверный вывод");
        }
    }
}
