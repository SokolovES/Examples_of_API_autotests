package API_tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class APIsTestsHelper {

    public static Iterator<Object[]> fileReader(String fileName) throws IOException {
        List<Object[]> testData = new ArrayList<>();
        try (Scanner text = new Scanner(new File("src/test/resources/API_data/Test_data/" + fileName))) {
            int i = 0;
            while (text.hasNext()) {
                i++;
                String print = text.nextLine();
                if (i > 1) {
                    testData.add(print.split(" "));
                }
            }
        }
        return testData.iterator();
    }
}