
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;

public class RestAssuredExample {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given()
            .log().all()
            .when()
            .get("/posts/1")
            .then()
            .log().all()
            .assertThat()
            .statusCode(200);
    }
}
