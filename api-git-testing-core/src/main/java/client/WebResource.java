package client;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import request.GitRequest;

public class WebResource {
   private String BASE_API = "https://api.github.com/";
   private RequestSpecification baseClient;

   public WebResource() {
      baseClient = RestAssured.given().auth()
            .oauth2("ed6cb0f1495f801f802739d9170b4121e9b467ae")
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

   public Response delete(GitRequest request) {
      return baseClient.delete(request.getPath());
   }

   public WebResource withRequestBody(GitRequest request) {
      baseClient.body(request.getRequestBody());
      return this;
   }
}
