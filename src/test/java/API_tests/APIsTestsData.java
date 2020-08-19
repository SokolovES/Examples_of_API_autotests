package API_tests;

import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.Iterator;

import static API_tests.APIsTestsHelper.fileReader;

public class APIsTestsData {

    @DataProvider(parallel = true)
    public static Iterator<Object[]> peopleId() throws IOException {
        return fileReader("People_id.csv");
    }

    @DataProvider(parallel = true)
    public static Iterator<Object[]> starshipsId() throws IOException {
        return fileReader("Starships_id.csv");
    }

    @DataProvider(parallel = true)
    public static Iterator<Object[]> vehiclesId() throws IOException {
        return fileReader("Vehicles_id.csv");
    }

    @DataProvider(parallel = true)
    public static Iterator<Object[]> speciesId() throws IOException {
        return fileReader("Species_id.csv");
    }

    @DataProvider(parallel = true)
    public static Iterator<Object[]> planetsId() throws IOException {
        return fileReader("Planets_id.csv");
    }

    @DataProvider(parallel = true)
    public static Object[][] filmId() {
        return new Object[][]{
                {1}, {2}, {3}, {4}, {5}, {6}
        };
    }

    @DataProvider(parallel = true)
    public static Object[][] wrongId() {
        return new Object[][]{
                {"!"}, {"$"}, {"_"}, {"qwerty"}, {"'"}, {"+"}, {"-"}
        };
    }
}