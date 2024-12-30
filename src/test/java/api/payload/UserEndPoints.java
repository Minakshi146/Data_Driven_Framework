package api.payload;

import io.restassured.response.Response;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

import api.endpoints.Routes;

public class UserEndPoints {
public static Response create(User payload){
Response response=given()
					.contentType(ContentType.JSON)
					.accept(ContentType.JSON)
					.body(payload)
					
					.when()
					.post(Routes.post_url);

					return response;
					
}


public static Response read(String userName) {
	Response response=given()
						.pathParam("username",userName)
						.when()
						.get(Routes.get_url);
						return response;
}

public static Response update(String userName, User payload) {
	Response response=given()
						.contentType(ContentType.JSON)
						.accept(ContentType.JSON)
						.body(payload)
						.pathParam("username", userName)
						.when()
						.put(Routes.update_url);
	
						return response;
}

public static Response remove(String userName) {
	Response response=given()
						.pathParam("username", userName)
						.when()
						.delete(Routes.delete_url);
					
						return response;
}



}
