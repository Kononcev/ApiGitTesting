package client;

import model.GitUser;
import request.GitRequest;
import response.GitResponse;
import response.GitUserRS;

public class GitBasicClient extends HttpMethodsImpl {

   public GitResponse<GitUserRS> getBasicUser() {
      GitRequest request = WebResource.createWebRequest("users/Kononcev");
      return new GitResponse<>(get(request), GitUser.class);
   }
}
