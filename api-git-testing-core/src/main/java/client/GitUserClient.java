package client;

import model.GitRepository;
import model.GitUser;
import request.GitRequest;
import response.GitResponse;

public class GitUserClient extends HttpMethodsImpl {

   public GitResponse<GitUser> getBasicUser() {
      GitRequest request = WebResource.createWebRequest("users/Kononcev");
      return new GitResponse<>(get(request), GitUser.class);
   }

   public GitResponse<GitRepository[]> getUserRepositories() {
      GitRequest request = WebResource.createWebRequest("users/Kononcev/repos");
      return new GitResponse<>(get(request), GitRepository[].class);
   }
}
