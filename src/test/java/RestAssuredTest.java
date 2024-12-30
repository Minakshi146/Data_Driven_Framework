import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssuredTest {
    public static void main(String[] args) {
        // Dynamic data for the request body
        User user = new User("Alice Smith", 28, "alice.smith@example.com");

        // Send POST request with custom object as body
        Response response = RestAssured
                .given()
                .contentType("application/json")
                .body(user)  // Rest Assured will serialize this object to JSON
                .when()
                .post("https://api.example.com/users")
                .then()
                .extract()
                .response();

        System.out.println("Status Code: " + response.statusCode());
        System.out.println("Response Body: " + response.asString());
    }
}
