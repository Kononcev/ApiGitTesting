import client.GitBasicClient;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import model.GitUser;
import org.testng.annotations.Test;
import response.GitResponse;

import java.io.IOException;

public class MainTest {
   @Test
   public void testUserGitResponse() throws IOException {
      RequestSpecification request = RestAssured.given();
      request.baseUri("https://api.github.com/");
      request.accept(ContentType.JSON);

     // RequestSpecification authenticationSpecification = request.baseUri("https://api.github.com/users/Kononcev").auth().basic("Kononcev", "Vv7891525");
      //JsonPath response = authenticationSpecification.get().jsonPath();

      /*Response response = request.get("?access_token=a9639ccbffbbd6e58200aad8c9ec7f497fafe7a2");
      ResponseBody body = response.getBody();
      System.out.println();
      body.print()*/;
      Response followers = request.get("user/followers");
      ResponseBody followersBody = followers.getBody();
      followersBody.print();

      /*Response repos = request.get("/repos/Kononcev/pattern");
      ResponseBody reposBody = repos.getBody();
      System.out.println();
      reposBody.print();

      Response mainResponse = request.get("users/Kononcev");
      ResponseBody body2 = mainResponse.getBody();
      body2.print();*/


   }

   public void getUser(){
      GitBasicClient basicUser = new GitBasicClient();
      GitResponse<GitUser> response = basicUser.getBasicUser();
      GitUser user = response.getModel();
      System.out.println(user);
   }
}
