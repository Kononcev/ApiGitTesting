import client.GitUserClient;
import model.GitRepository;
import model.GitUser;
import org.testng.annotations.Test;
import response.GitResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MainTest {
   @Test
   public void testUserGitResponse() throws IOException {
      /*RequestSpecification request = RestAssured.given();
      request.baseUri("https://api.github.com/");
      request.accept(ContentType.JSON);*/

      // RequestSpecification authenticationSpecification = request.baseUri("https://api.github.com/users/Kononcev").auth().basic("Kononcev", "Vv7891525");
      //JsonPath response = authenticationSpecification.get().jsonPath();

      /*Response response = request.get("?access_token=a9639ccbffbbd6e58200aad8c9ec7f497fafe7a2");
      ResponseBody body = response.getBody();
      System.out.println();
      body.print()*/
      ;
      /*Response followers = request.get("user/followers");
      ResponseBody followersBody = followers.getBody();
      followersBody.print();*/

      /*Response repos = request.get("/repos/Kononcev/pattern");
      ResponseBody reposBody = repos.getBody();
      System.out.println();
      reposBody.print();

      Response mainResponse = request.get("users/Kononcev");
      ResponseBody body2 = mainResponse.getBody();
      body2.print();*/

      getUser();
   }

   public void getUser() {
      GitUserClient basicUser = new GitUserClient();
      GitResponse<GitUser> response = basicUser.getBasicUser();
      GitUser user = response.getModel();
      System.out.println(user);
      System.out.println(user.getHtmlUrl());
   }

   public void getRepos() {
      GitUserClient basicUser = new GitUserClient();
      GitResponse<GitRepository[]> response = basicUser.getUserRepositories();
      List<GitRepository> repositories = Arrays.asList(response.getModel());
      repositories.forEach(repos-> System.out.println(repos.getFullName()));
   }
}
