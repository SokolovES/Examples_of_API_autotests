package API_tests.Negative_API_tests;

import API_tests.APIsTestsBase;
import API_tests.APIsTestsData;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.equalTo;

/**
 * The Star Wars API
 * Example of negative API tests.
 * Acceptance requirements:
 * - status code: 404 ;
 * - response data (type data): JSON ;
 * - body equals to {"detail":"Not found"}.
 */

public class NegativeAPITests extends APIsTestsBase {

    ResponseSpecification responseSpec = new ResponseSpecBuilder()
            .expectStatusCode(404)
            .expectContentType(JSON)
            .expectBody(equalTo("{\"detail\":\"Not found\"}"))
            .build();

    @Test(testName = "People by wrong id",
            description = "Try get People by the wrong id.",
            dataProvider = "wrongId",
            dataProviderClass = APIsTestsData.class)

    public void getPeopleWithWrongId(String id) {
        given()
                .get(API_tests_config.getProperty("base_URL") + "people/" + id)
                .then()
                .spec(responseSpec);
    }

    @Test(testName = "Films with wrong id",
            description = "Try to get Films by the wrong id.",
            dataProvider = "wrongId",
            dataProviderClass = APIsTestsData.class)

    public void getFilmWithWrongId(String id) {
        given()
                .get(API_tests_config.getProperty("base_URL") + "films/" + id)
                .then()
                .spec(responseSpec);
    }

    @Test(testName = "Starship by wrong id",
            description = "Try to get Starship by the wrong id.",
            dataProvider = "wrongId",
            dataProviderClass = APIsTestsData.class)

    public void getStarshipWithWrongId(String id) {
        given()
                .get(API_tests_config.getProperty("base_URL") + "starships/" + id)
                .then()
                .spec(responseSpec);
    }

    @Test(testName = "Vehicle by wrong id",
            description = "Try to get Vehicle by the wrong id.",
            dataProvider = "wrongId",
            dataProviderClass = APIsTestsData.class)

    public void getVehicleWithWrongId(String id) {
        given()
                .get(API_tests_config.getProperty("base_URL") + "vehicles/" + id)
                .then()
                .spec(responseSpec);
    }

    @Test(testName = "Species by wrong id",
            description = "Try to get Species by the wrong id.",
            dataProvider = "wrongId",
            dataProviderClass = APIsTestsData.class)

    public void getSpeciesWithWrongId(String id) {
        given()
                .get(API_tests_config.getProperty("base_URL") + "species/" + id)
                .then()
                .spec(responseSpec);
    }

    @Test(testName = "Planets by wrong id",
            description = "Try to get Planets by the wrong id.",
            dataProvider = "wrongId",
            dataProviderClass = APIsTestsData.class)

    public void getPlanetsWithId(String id) {
        given()
                .get(API_tests_config.getProperty("base_URL") + "planets/" + id)
                .then()
                .spec(responseSpec);
    }
}