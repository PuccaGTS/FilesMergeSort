package exeptions;

import java.util.ArrayList;

public class SpaceContainsException extends Exception {
    private final String pathFile;
    private final ArrayList brokenData;

    public SpaceContainsException(String pathFile, ArrayList brokenData) {
        this.pathFile = pathFile;
        this.brokenData = brokenData;
    }

    @Override
    public String toString() {
        return "File \"" + pathFile + "\" must not contain spaces" + "\nBroken data: " + brokenData;
    }
}
