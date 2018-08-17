package client;

import model.GitUser;
import request.GitRequest;
import response.GitResponse;

public class GitBasicClient extends HttpMethodsImpl {

   public GitResponse<GitUser> getBasicUser() {
      GitRequest request = WebResource.createWebRequest("users/Kononcev");
      return new GitResponse<>(get(request), GitUser.class);
   }
}
