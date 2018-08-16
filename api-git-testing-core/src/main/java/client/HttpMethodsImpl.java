package client;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import request.GitRequest;
import response.GitResponse;

import static org.testng.Assert.assertEquals;

public abstract class HttpMethodsImpl implements HttpMethods {
   @Override
   public Response get(GitRequest webRequest) {
      RequestSpecification requestSpecification = new WebResource().getGitClient();
      GitResponse gitResponse = new GitResponse();
      gitResponse.setResponse(requestSpecification.get(webRequest.getPath()));
      gitResponse.getResponse().getStatusCode();
      assertEquals(gitResponse.getResponse().getStatusCode(), 200, String.format("Response code error actual: %d expected %d", gitResponse.getResponse().getStatusCode(), 200));
      return gitResponse.getResponse();
   }
}
