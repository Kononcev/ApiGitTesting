package request;

import client.WebResource;

public class GitRequest {
   private String path;
   private String requestBody;
   private WebResource resource;

   public GitRequest() {
   }

   public GitRequest(String path, WebResource resource) {
      this.resource = resource;
      this.path = this.resource.getBaseApiUrl() + path;
   }

   public String getPath() {
      return path;
   }

   public String getRequestBody() {
      return requestBody;
   }
}
