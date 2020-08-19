package API_tests.Positive_API_tests;

import API_tests.APIsTestsBase;
import API_tests.APIsTestsData;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

/**
 * The Star Wars API.
 * Example of positive API tests.
 * Acceptance requirements:
 * - status code: 200 ;
 * - response data (type data): JSON ;
 * - accordance with JSON schema.
 */

public class PositiveAPITests extends APIsTestsBase {

    ResponseSpecification responseSpec = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectContentType(JSON)
            .build();

    @Test(testName = "Root",
            description = "The Root resource provides information on all available resources within the API.",
            priority = 1)

    public void getRoot() {
        given()
                .get(API_tests_config.getProperty("base_URL"))
                .then()
                .spec(responseSpec)
                .log().ifValidationFails()
                .body(matchesJsonSchemaInClasspath("API_data/Responses/JSON_schema/Root_schema.json"));
    }

    @Test(testName = "People",
            description = "A People resource is an individual person or character within the Star Wars universe.",
            priority = 2)

    public void getPeople() {
        given()
                .get(API_tests_config.getProperty("base_URL") + "people")
                .then()
                .spec(responseSpec)
                .log().ifValidationFails()
                .body(matchesJsonSchemaInClasspath("API_data/Responses/JSON_schema/People_schema.json"));
    }

    @Test(testName = "People by id",
            description = "Get a specific people resource by id",
            dataProvider = "peopleId",
            dataProviderClass = APIsTestsData.class,
            priority = 3)

    public void getPeopleWithId(Object id) {
        given()
                .get(API_tests_config.getProperty("base_URL") + "people/" + id)
                .then()
                .spec(responseSpec)
                .log().ifValidationFails()
                .body(matchesJsonSchemaInClasspath("API_data/Responses/JSON_schema/People_with_id_schema.json"));
    }

    @Test(testName = "Films",
            description = "A Film resource is a single film.",
            priority = 4)

    public void getFilms() {
        given()
                .get(API_tests_config.getProperty("base_URL") + "films")
                .then()
                .spec(responseSpec)
                .log().ifValidationFails()
                .body(matchesJsonSchemaInClasspath("API_data/Responses/JSON_schema/Films_schema.json"));

    }

    @Test(testName = "Films by id",
            description = "Get a specific film resource by id.",
            dataProvider = "filmId",
            dataProviderClass = APIsTestsData.class,
            priority = 5)

    public void getFilmWithId(int id) {
        given()
                .get(API_tests_config.getProperty("base_URL") + "films/" + id)
                .then()
                .spec(responseSpec)
                .log().ifValidationFails()
                .body(matchesJsonSchemaInClasspath("API_data/Responses/JSON_schema/Films_with_id_schema.json"));
    }

    @Test(testName = "Starships",
            description = "A Starship resource is a single transport craft that has hyperdrive capability.",
            priority = 6)

    public void getStarships() {
        given()
                .get(API_tests_config.getProperty("base_URL") + "starships")
                .then()
                .spec(responseSpec)
                .log().ifValidationFails()
                .body(matchesJsonSchemaInClasspath("API_data/Responses/JSON_schema/Starships_schema.json"));
    }

    @Test(testName = "Starship by id",
            description = "Get a specific starship resource by id.",
            dataProvider = "starshipsId",
            dataProviderClass = APIsTestsData.class,
            priority = 7)

    public void getStarshipWithId(Object id) {
        given()
                .get(API_tests_config.getProperty("base_URL") + "starships/" + id)
                .then()
                .spec(responseSpec)
                .log().ifValidationFails()
                .body(matchesJsonSchemaInClasspath("API_data/Responses/JSON_schema/Starships_with_id_schema.json"));
    }

    @Test(testName = "Vehicles",
            description = "A Vehicle resource is a single transport craft that does not have hyperdrive capability.",
            priority = 8)

    public void getVehicles() {
        given()
                .get(API_tests_config.getProperty("base_URL") + "vehicles")
                .then()
                .spec(responseSpec)
                .log().ifValidationFails()
                .body(matchesJsonSchemaInClasspath("API_data/Responses/JSON_schema/Vehicles_schema.json"));
    }

    @Test(testName = "Vehicle by id",
            description = "Get a specific vehicle resource by id.",
            dataProvider = "vehiclesId",
            dataProviderClass = APIsTestsData.class,
            priority = 9)

    public void getVehicleWithId(Object id) {
        given()
                .get(API_tests_config.getProperty("base_URL") + "vehicles/" + id)
                .then()
                .spec(responseSpec)
                .log().ifValidationFails()
                .body(matchesJsonSchemaInClasspath("API_data/Responses/JSON_schema/Vehicles_with_id_schema.json"));
    }

    @Test(testName = "Species",
            description = "A Species resource is a type of person or character within the Star Wars Universe.",
            priority = 10)

    public void getSpecies() {
        given()
                .get(API_tests_config.getProperty("base_URL") + "species")
                .then()
                .spec(responseSpec)
                .log().ifValidationFails()
                .body(matchesJsonSchemaInClasspath("API_data/Responses/JSON_schema/Species_schema.json"));
    }

    @Test(testName = "Species by id",
            description = "Get a specific species resource by id.",
            dataProvider = "speciesId",
            dataProviderClass = APIsTestsData.class,
            priority = 11)

    public void getSpeciesWithId(Object id) {
        given()
                .get(API_tests_config.getProperty("base_URL") + "species/" + id)
                .then()
                .spec(responseSpec)
                .log().ifValidationFails()
                .body(matchesJsonSchemaInClasspath("API_data/Responses/JSON_schema/Species_with_id_schema.json"));
    }

    @Test(testName = "Planets",
            description = "A Planet resource is a large mass, planet or planetoid in the Star Wars Universe, at the time of 0 ABY.",
            priority = 12)

    public void getPlanets() {
        given()
                .get(API_tests_config.getProperty("base_URL") + "planets")
                .then()
                .spec(responseSpec)
                .log().ifValidationFails()
                .body(matchesJsonSchemaInClasspath("API_data/Responses/JSON_schema/Planets_schema.json"));
    }

    @Test(testName = "Planets by id",
            description = "Get a specific planets resource by id",
            dataProvider = "planetsId",
            dataProviderClass = APIsTestsData.class,
            priority = 13)

    public void getPlanetsWithId(Object id) {
        given()
                .get(API_tests_config.getProperty("base_URL") + "planets/" + id)
                .then()
                .spec(responseSpec)
                .log().ifValidationFails()
                .body(matchesJsonSchemaInClasspath("API_data/Responses/JSON_schema/Planets_with_id_schema.json"));
    }
}