package client;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseGitClient {
   private String BASE_API = "https://api.github.com/";
   private ContentType contentType = ContentType.JSON;
   private RequestSpecification request;

   public BaseGitClient() {
      request = RestAssured.given();
      request.baseUri(BASE_API);
      request.accept(contentType);
   }

   public RequestSpecification getGitClient() {
      return request;
   }
}
