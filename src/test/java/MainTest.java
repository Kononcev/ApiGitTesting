import client.GitUserClient;
import model.GitFollowers;
import model.GitRepository;
import model.GitUser;
import model.Repository;
import org.testng.annotations.Test;
import response.GitResponse;

import java.util.Arrays;
import java.util.List;

public class MainTest {
   @Test
   public void testUserGitResponse() {
      /*GitRepository user = createNewRepository();
      System.out.println(user);*/
      System.out.println(getUser());
   }

   public GitUser getUser() {
      GitUserClient basicUser = new GitUserClient();
      GitResponse<GitUser> response = basicUser.getBasicUser();
      return response.getModel();
   }

   public GitRepository createNewRepository(){
      GitUserClient basicUser = new GitUserClient();
      GitResponse<GitRepository> response = basicUser.createNewRepository(new Repository("TestRepo", "creating from api request", false));
      return response.getModel();
   }

   public void getRepos() {
      GitUserClient basicUser = new GitUserClient();
      GitResponse<GitRepository[]> response = basicUser.getUserRepositories();
      List<GitRepository> repositories = Arrays.asList(response.getModel());
      repositories.forEach(System.out::println);
      repositories.forEach(repos -> System.out.println(repos.getFullName()));
   }

   public void getFollowers() {
      GitUserClient basicUser = new GitUserClient();
      GitResponse<GitFollowers[]> response = basicUser.getUserFollowers();
      List<GitFollowers> followers = Arrays.asList(response.getModel());
      followers.forEach(System.out::println);
   }
}
