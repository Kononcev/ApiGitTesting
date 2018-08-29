package response;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

public class GitResponse<T> {
   private Class<?> modelType;
   private Response response;

   public GitResponse() {
   }

   public GitResponse(Response response, Class<?> type) {
      this.response = response;
      this.modelType = type;
   }

   public GitResponse(Response response) {
      this.response = response;
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
      mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
      mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
      mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
      mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
      mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
      mapper.configure(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY, true);
      Object obj = null;
      try {
         obj = mapper.readValue(response.asString(), mapper.getTypeFactory().constructType(modelType));
      } catch (IOException e) {
         e.printStackTrace();
      }
      return (T) obj;
   }
}
