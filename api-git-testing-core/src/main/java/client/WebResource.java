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
      baseClient = RestAssured.given().auth().oauth2("40f2c7a6a3d7b4f315941ed997c1c4319b572189").baseUri(BASE_API).accept("application/json").contentType("application/json");
   }

   public RequestSpecification getGitClient() {
      return baseClient;
   }

   public GitRequest createWebRequest(String url) {
      return new GitRequest(url, new WebResource());
   }

   public String getBaseApiUrl() {
      return BASE_API;
   }

   public Response get(GitRequest request){
      return baseClient.get(request.getPath());
   }

   public Response post(GitRequest request){
      return baseClient.post(request.getPath());
   }
}
