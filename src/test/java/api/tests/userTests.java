package api.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import com.github.javafaker.Faker;

import api.payload.User;
import api.payload.UserEndPoints;
import io.restassured.response.Response;

public class userTests {

	//Faker faker;
	User userPayload;
	
	
	@BeforeClass
	public void setupData() {
		//faker=new Faker();
		userPayload=new User();
		
//		userPayload.setId(faker.idNumber().hashCode());
//		userPayload.setUsername(faker.name().username());
//		userPayload.setFirstName(faker.name().firstname());
//		userPayload.setLastName(faker.name().lastname());
//		userPayload.setEmail(faker.internet().safeEmailAddress());
//		userPayload.setPassword(faker.internet().password(5,10));
//		userPayload.setPhone(faker.phoneNumber().cellphone());
//	
		userPayload.setId(1);
		userPayload.setUsername("Minakshi");
		userPayload.setFirstname("Minakshi");
		userPayload.setLastname("Pawar");
		userPayload.setEmail("xyz@gmail.com");
		userPayload.setPassword("xyz@123");
		userPayload.setPhone("9876543211");
	
	}
	
	@Test(priority=1)
	public void testPostUser(){
	
		Response response=UserEndPoints.create(userPayload);
				//response.then().log().all();
		response.getStatusCode();
				
		//Assert.assertEquals(response.statusCode(),200);
				
	}
	
	@Test(priority=2)
	public void testGetUser() {
		Response response=UserEndPoints.read(this.userPayload.getUsername());
			response.getStatusCode();
			Assert.assertEquals("firstname", "Minakshi");
			Assert.assertEquals("lastname", "Pawar");
	}
	
//	@Test(priority=3)
//	public void testUpdateUser() {
//		
//		userPayload.setFirstname("Arnav");
//		userPayload.setLastname("Patil");
//		Response response=UserEndPoints.update(this.userPayload.getUsername(), userPayload);
//		response.getStatusCode();
//		response.then().log().all();		
//		
//		
//	
//	}
	
	
}
