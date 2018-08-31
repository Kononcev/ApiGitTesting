package client;

import io.restassured.response.Response;
import request.GitRequest;
import response.GitResponse;

import static org.testng.Assert.assertEquals;

public abstract class HttpMethodsImpl implements HttpMethods {
   @Override
   public Response get(GitRequest webRequest) {
      GitResponse gitResponse = new GitResponse(new WebResource().get(webRequest));
      assertEquals(gitResponse.getStatusCode(), 200, String.format("Response code error actual: %d expected %d", gitResponse.getStatusCode(), 200));
      return gitResponse.getResponse();
   }

   @Override
   public Response post(GitRequest webRequest) {
      GitResponse gitResponse = new GitResponse(new WebResource().post(webRequest));
      assertEquals(gitResponse.getStatusCode(), 200, String.format("Response code error actual: %d expected %d", gitResponse.getStatusCode(), 200));
      return gitResponse.getResponse();
   }
}
