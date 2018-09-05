package client;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import request.GitRequest;

public class WebResource {
   private String BASE_API = "https://api.github.com/";
   private RequestSpecification baseClient;

   public WebResource() {
      baseClient = RestAssured.given().auth()
            .oauth2("ec110d8b0e37de0b9a4c69d0f096327ba4c8ebf7")
            .baseUri(BASE_API)
            .accept("application/json")
            .contentType("application/json");

   }

   public RequestSpecification getGitClient() {
      return baseClient;
   }

   public GitRequest createWebRequest(String url) {
      return new GitRequest(url);
   }

   public String getBaseApiUrl() {
      return BASE_API;
   }

   public Response get(GitRequest request) {
      return baseClient.get(request.getPath());
   }

   public Response post(GitRequest request) {
      return baseClient.post(request.getPath());
   }

   public void delete(GitRequest request) {
      baseClient.delete(request.getPath());
   }

   public WebResource withRequestBody(GitRequest request){
      baseClient.body(request.getRequestBody());
      return this;
   }
}
