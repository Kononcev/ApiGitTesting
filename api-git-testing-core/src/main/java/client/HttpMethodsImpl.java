package client;

import io.restassured.response.Response;
import request.GitRequest;
import response.GitResponse;

public abstract class HttpMethodsImpl implements HttpMethods {
   public WebResource webResource;

   @Override
   public Response get(GitRequest webRequest) {
      GitResponse gitResponse = new GitResponse(webResource.get(webRequest));
      return gitResponse.getResponse();
   }

   @Override
   public Response post(GitRequest webRequest) {
      GitResponse gitResponse = new GitResponse(webResource.withRequestBody(webRequest).post(webRequest));
      return gitResponse.getResponse();
   }

   @Override
   public Response delete(GitRequest webRequest) {
      return webResource.delete(webRequest);
   }
}
