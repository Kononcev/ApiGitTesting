package request;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class GitRequest {
   private String path;
   private String requestBody;
   private Map<String, Object> headers;

   public GitRequest(String path) {
      this.path = path;
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

   public GitRequest withHeaders(Map<String, Object> headers){
      this.headers = headers;
      return this;
   }

   private GitRequest withRequestBody(String requestBody) {
      this.requestBody = requestBody;
      return this;
   }

   private String modelToString(Object requestBody) {
      ObjectMapper mapper = new ObjectMapper();
      String request = null;
      try {
         request = mapper.writeValueAsString(requestBody);
      } catch (JsonProcessingException e) {
         e.printStackTrace();
      }
      return request;
   }
}
