package client;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import request.GitRequest;

public class WebResource {
   private String BASE_API = "https://api.github.com/";
   private ContentType contentType = ContentType.JSON;
   private RequestSpecification baseClient;

   public WebResource() {
      baseClient = RestAssured.given().auth()
            .oauth2("0f8777cd98293467d8fb87017cf19f988f51c0e6")
            .baseUri(BASE_API)
            .accept("application/json")
            .contentType("application/json");
   }

   public RequestSpecification getGitClient() {
      return baseClient;
   }

   public GitRequest createWebRequest(String url) {
      return new GitRequest(getBaseApiUrl() + url);
   }

   public String getBaseApiUrl() {
      return BASE_API;
   }

   public Response get(GitRequest request) {
      return baseClient.get(request.getPath());
   }

   public Response post(GitRequest request) {
      return baseClient.body(request.getRequestBody()).post(request.getPath());
   }
}
