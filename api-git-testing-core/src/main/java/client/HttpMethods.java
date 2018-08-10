package client;

import request.GitHomeRequest;
import response.GitResponse;

public interface HttpMethods {
   GitResponse get(GitHomeRequest webRequest);

   /*GitResponse post(GitHomeRequest webRequest);

   GitResponse put(GitHomeRequest webRequest);

   GitResponse delete(GitHomeRequest webRequest);*/
}
