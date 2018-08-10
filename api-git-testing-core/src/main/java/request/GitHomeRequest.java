package request;

import client.BaseGitClient;
import client.HttpMethods;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import response.GitResponse;

public class GitHomeRequest implements HttpMethods {

   @Override
   public GitResponse get(GitHomeRequest webRequest) {
      BaseGitClient gitClient = new BaseGitClient();
      RequestSpecification requestSpecification = gitClient.getGitClient();
      Response user = requestSpecification.get("users/Kononcev");
      return null;
   }
}
