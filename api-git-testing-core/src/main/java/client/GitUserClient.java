package client;

import io.restassured.http.ContentType;
import model.GitFollowers;
import model.GitRepository;
import model.GitUser;
import model.Repository;
import request.GitRequest;
import response.GitResponse;

import java.util.HashMap;
import java.util.Map;

public class GitUserClient extends HttpMethodsImpl {
   private WebResource webResource;

   public GitUserClient() {
      this.webResource = new WebResource();
   }

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
      Map<String, Object> headers = new HashMap<>();
      headers.put("Content-Type", ContentType.JSON);
      headers.put("Accept", "application/json");
      headers.put("Authorization", "9657205f15bb756e9e287810fa25a5e061369a7c");
      GitRequest request = webResource.createWebRequest("user/repos").withRequestBody(repository).withHeaders(headers);
      return new GitResponse<>(post(request), GitRepository.class);
   }
}
