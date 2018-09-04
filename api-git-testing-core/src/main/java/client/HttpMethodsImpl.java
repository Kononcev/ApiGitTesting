package client;

import io.restassured.response.Response;
import request.GitRequest;
import response.GitResponse;

import static org.testng.Assert.assertEquals;

public abstract class HttpMethodsImpl implements HttpMethods {
   public WebResource webResource;

   @Override
   public Response get(GitRequest webRequest) {
      GitResponse gitResponse = new GitResponse(webResource.get(webRequest));
      assertEquals(gitResponse.getStatusCode(), 200, String.format("Response code error actual: %d expected %d", gitResponse.getStatusCode(), 200));
      return gitResponse.getResponse();
   }

   @Override
   public Response post(GitRequest webRequest) {
      GitResponse gitResponse = new GitResponse(webResource.withRequestBody(webRequest).post(webRequest));
      assertEquals(gitResponse.getStatusCode(), 201, String.format("Response code error actual: %d expected %d", gitResponse.getStatusCode(), 200));
      return gitResponse.getResponse();
   }

   @Override
   public void delete(GitRequest webRequest) {
      webResource.delete(webRequest);
   }
}
