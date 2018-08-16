package response;

import model.GitFollowers;

import java.util.List;

public class GitUserRS extends GitResponse {
   private String login;
   private String id;
   private String avatarUrl;
   private String url;
   private String htmlUrl;
   private List<GitFollowers> followers;
   private List<GitFollowers> followings;
   private String repositories;
   private String userType;

   public String getLogin() {
      return login;
   }

   public void setLogin(String login) {
      this.login = login;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
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

   public List<GitFollowers> getFollowers() {
      return followers;
   }

   public void setFollowers(List<GitFollowers> followers) {
      this.followers = followers;
   }

   public List<GitFollowers> getFollowings() {
      return followings;
   }

   public void setFollowings(List<GitFollowers> followings) {
      this.followings = followings;
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
