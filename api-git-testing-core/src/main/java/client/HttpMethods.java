package client;

import io.restassured.response.Response;
import request.GitRequest;
import response.GitResponse;

public interface HttpMethods {
   Response get(GitRequest webRequest);

   Response post(GitRequest webRequest);

   /*GitResponse put(GitHomeRequest webRequest);

   GitResponse delete(GitHomeRequest webRequest);*/
}
