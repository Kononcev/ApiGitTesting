import client.GitUserClient;
import client.WebResource;
import model.GitRepository;
import model.GitUser;
import org.testng.annotations.Test;
import request.GitRequest;
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
      getRepos();
   }

   public void getUser() {
      GitUserClient basicUser = new GitUserClient();
      GitResponse<GitUser> response = basicUser.getBasicUser();
      GitUser user = response.getModel();
      System.out.println(user);
      System.out.println(user.getHtmlUrl());
      Arrays.asList(user.getRepositories()).forEach(System.out::println);
   }

   public void getRepos() {
      GitUserClient basicUser = new GitUserClient();
      GitResponse<GitRepository[]> response = basicUser.getUserRepositories();
      List<GitRepository> repositories = Arrays.asList(response.getModel());
      repositories.forEach(System.out::println);
      repositories.forEach(repos-> System.out.println(repos.getFullName()));
   }
}
