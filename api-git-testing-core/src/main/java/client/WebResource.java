package client;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import request.GitRequest;

public class WebResource {
   private String BASE_API = "https://api.github.com/";
   private ContentType contentType = ContentType.JSON;
   private RequestSpecification baseClient;

   public WebResource() {
      baseClient = RestAssured.given();
      baseClient.baseUri(BASE_API);
      baseClient.accept(contentType);
   }

   public RequestSpecification getGitClient() {
      return baseClient;
   }

   public static GitRequest createWebRequest(String url) {
      return new GitRequest(url, new WebResource());
   }

   public String getBaseApiUrl() {
      return BASE_API;
   }
}
