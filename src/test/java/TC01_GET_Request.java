import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC01_GET_Request {
	
	@Test
	void getweatherDetails()
	{
		RestAssured.baseURI="http://www.omdbapi.com/?apikey=[yourkey]&";
		
		RequestSpecification httprequest = RestAssured.given();
		
		Response res = httprequest.request(Method.GET,"/Hyderabad");
		
		String resbody = res.getBody().asString();
		System.out.println(resbody);
		
	}

}
