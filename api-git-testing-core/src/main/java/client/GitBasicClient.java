package client;

import model.GitRepositories;
import model.GitUser;
import request.GitRequest;
import response.GitResponse;

import java.util.List;

public class GitBasicClient extends HttpMethodsImpl {

   public GitResponse<GitUser> getBasicUser() {
      GitRequest request = WebResource.createWebRequest("users/Kononcev");
      return new GitResponse<>(get(request), GitUser.class);
   }

   public GitResponse<List<GitRepositories>> getUserRepositories() {
      GitRequest request = WebResource.createWebRequest("users/Kononcev/repos");
      return new GitResponse<>(get(request), GitRepositories[].class);
   }
}
