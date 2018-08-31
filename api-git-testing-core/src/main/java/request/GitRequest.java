package request;

import client.WebResource;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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

   public GitRequest withRequestBody(Object requestBody) {
      return withRequestBody(modelToString(requestBody));
   }

   private GitRequest withRequestBody(String requestBody) {
      this.requestBody = requestBody;
      return this;
   }

   private String modelToString(Object requestBody) {
      ObjectMapper mapper = new ObjectMapper();
      String request = null;
      try {
         request =  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(requestBody);
      } catch (JsonProcessingException e) {
         e.printStackTrace();
      }
      return request;
   }
}
