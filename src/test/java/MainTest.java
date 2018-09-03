import client.GitUserClient;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.GitFollowers;
import model.GitRepository;
import model.GitUser;
import model.Repository;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import response.GitResponse;

import java.util.Arrays;
import java.util.List;

public class MainTest {
   @Test
   public void testUserGitResponse() {
      GitResponse repository = createNewRepository();
      repository.getResponseModel();
   }

   @Test
   public void createRepo() {
      RequestSpecification baseClient = RestAssured.given().auth()
            .oauth2("0f8777cd98293467d8fb87017cf19f988f51c0e6")
            .baseUri("https://api.github.com/")
            .accept("application/json")
            .contentType("application/json");

      JSONObject requestParams = new JSONObject();
      requestParams.put("name", "TestRepo");
      requestParams.put("description", "creating from api request");
      requestParams.put("private", false);

      baseClient.body(requestParams.toJSONString());

      Response response = baseClient.post("user/repos");
      response.prettyPrint();
   }

   public GitResponse getUser() {
      GitUserClient basicUser = new GitUserClient();
      GitResponse<GitUser> response = basicUser.getBasicUser();
      return response;
   }

   public GitResponse createNewRepository(){
      GitUserClient basicUser = new GitUserClient();
      GitResponse<GitRepository> response = basicUser.createNewRepository(new Repository("TestRepo", "creating from api request", false));
      return response;
   }

   public GitResponse getRepos() {
      GitUserClient basicUser = new GitUserClient();
      GitResponse<GitRepository[]> response = basicUser.getUserRepositories();
      return response;
   }

   public void getFollowers() {
      GitUserClient basicUser = new GitUserClient();
      GitResponse<GitFollowers[]> response = basicUser.getUserFollowers();
      List<GitFollowers> followers = Arrays.asList(response.getModel());
      followers.forEach(System.out::println);
   }
}
