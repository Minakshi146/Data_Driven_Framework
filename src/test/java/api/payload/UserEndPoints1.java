package api.payload;
import static io.restassured.RestAssured.given;

import api.endpoints.Routes;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserEndPoints1 {
public static Response create(User payload){
Response response=given()
					.contentType(ContentType.JSON)
					.accept(ContentType.JSON)
					.body(payload)
					
					.when()
					.post(Routes.post_url);

					return response;
					
}
}