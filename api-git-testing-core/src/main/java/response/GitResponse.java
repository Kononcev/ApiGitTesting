package response;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import utils.CustomUtils;

import java.io.IOException;

public class GitResponse<T> {
   private Class<?> modelType;
   private Response response;

   public GitResponse() {
   }

   public GitResponse(Response response, Class<?> type) {
      this.response = response;
      this.modelType = type;
   }

   public Response getResponse() {
      return response;
   }

   public void setResponse(Response response) {
      this.response = response;
   }

   public ResponseBody getResponseBody() {
      return response.getBody();
   }

   public T getModel() {
      ObjectMapper mapper = new ObjectMapper();
      Object obj = null;
      try {
         obj = mapper.readValue(response.getBody().prettyPrint(), modelType);
      } catch (IOException e) {
         e.printStackTrace();
      }
      return (T) obj;
   }
}
