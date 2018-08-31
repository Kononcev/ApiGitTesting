package client;

import model.GitFollowers;
import model.GitRepository;
import model.GitUser;
import model.Repository;
import request.GitRequest;
import response.GitResponse;

public class GitUserClient extends HttpMethodsImpl {
   private WebResource webResource = new WebResource();

   public GitResponse<GitUser> getBasicUser() {
      GitRequest request = webResource.createWebRequest("users/Kononcev");
      return new GitResponse<>(get(request), GitUser.class);
   }

   public GitResponse<GitRepository[]> getUserRepositories() {
      GitRequest request = webResource.createWebRequest("users/Kononcev/repos");
      return new GitResponse<>(get(request), GitRepository[].class);
   }

   public GitResponse<String> getRequestLimit() {
      GitRequest request = webResource.createWebRequest("rate_limit");
      return new GitResponse<>(get(request));
   }

   public GitResponse<GitFollowers[]> getUserFollowers() {
      GitRequest request = webResource.createWebRequest("users/Kononcev/followers");
      return new GitResponse<>(get(request), GitFollowers[].class);
   }

   public GitResponse<GitRepository> createNewRepository(Repository repository) {
      GitRequest request = webResource.createWebRequest("user/repos").withRequestBody(repository);
      return new GitResponse<>(post(request), GitRepository.class);
   }
}
