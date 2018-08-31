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
      GitResponse repository = createNewRepository();
      repository.getResponseModel();
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
