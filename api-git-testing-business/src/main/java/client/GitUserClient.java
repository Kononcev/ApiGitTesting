package client;

import model.GitFollowers;
import model.GitRepository;
import model.GitUser;
import model.Repository;
import request.GitRequest;
import response.GitResponse;

import java.util.HashMap;
import java.util.Map;

public class GitUserClient extends HttpMethodsImpl {

   public GitUserClient() {
      super.webResource = new WebResource();
   }

   public GitResponse<GitUser> getBasicUser() {
      return new GitResponse<>(get(webResource.createWebRequest("users/Kononcev")), GitUser.class);
   }

   public GitResponse<GitRepository[]> getUserRepositories() {
      return new GitResponse<>(get(webResource.createWebRequest("users/Kononcev/repos")), GitRepository[].class);
   }

   public GitResponse<String> getRequestLimit() {
      return new GitResponse<>(get(webResource.createWebRequest("rate_limit")));
   }

   public GitResponse<GitFollowers[]> getUserFollowers() {
      return new GitResponse<>(get(webResource.createWebRequest("users/Kononcev/followers")), GitFollowers[].class);
   }

   public GitResponse<GitRepository> createNewRepository(Repository repository) {
      return new GitResponse<>(post(webResource.createWebRequest("user/repos").withRequestBody(repository)), GitRepository.class);
   }

   public void deleteRepository(String repositoryName) {
      new GitResponse<>(delete(webResource.createWebRequest("repos/Kononcev/" + repositoryName)));
   }
}
