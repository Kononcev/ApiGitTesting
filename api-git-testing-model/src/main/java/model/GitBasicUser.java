package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GitBasicUser extends GitObject{
   private String login;
   private Integer id;
   @JsonProperty("avatar_url")
   private String avatarUrl;
   private String url;
   @JsonProperty("html_url")
   private String htmlUrl;
   /*@JsonProperty("followers_url")
   private List<GitFollowers> followers;
   @JsonProperty("following_url")
   private List<GitFollowers> followings;*/
   @JsonProperty("repos_url")
   private String repositories;
   @JsonProperty("type")
   private String userType;

   public GitBasicUser() {
   }

   public GitBasicUser(String login, Integer id, String avatarUrl, String url, String htmlUrl, String repositories, String userType) {
      this.login = login;
      this.id = id;
      this.avatarUrl = avatarUrl;
      this.url = url;
      this.htmlUrl = htmlUrl;
      this.repositories = repositories;
      this.userType = userType;
   }

   public String getLogin() {
      return login;
   }

   public void setLogin(String login) {
      this.login = login;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getAvatarUrl() {
      return avatarUrl;
   }

   public void setAvatarUrl(String avatarUrl) {
      this.avatarUrl = avatarUrl;
   }

   public String getUrl() {
      return url;
   }

   public void setUrl(String url) {
      this.url = url;
   }

   public String getHtmlUrl() {
      return htmlUrl;
   }

   public void setHtmlUrl(String htmlUrl) {
      this.htmlUrl = htmlUrl;
   }

   public String getRepositories() {
      return repositories;
   }

   public void setRepositories(String repositories) {
      this.repositories = repositories;
   }

   public String getUserType() {
      return userType;
   }

   public void setUserType(String userType) {
      this.userType = userType;
   }
}
