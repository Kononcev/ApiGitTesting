package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URL;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GitUser {
   private String login;
   private Integer id;
   @JsonProperty("avatar_url")
   private String avatarUrl;
   private String url;
   @JsonProperty("html_url")
   private URL htmlUrl;
   @JsonProperty("followers_url")
   private String followers;
   @JsonProperty("following_url")
   private String followings;
   @JsonProperty("public_repos")
   private String repositories;
   @JsonProperty("created_at")
   private String creatingDate;

   public GitUser() {
   }

   public GitUser(String login, Integer id, String avatarUrl, String url, URL htmlUrl, String followers, String followings, String repositories, String creatingDate) {
      this.login = login;
      this.id = id;
      this.avatarUrl = avatarUrl;
      this.url = url;
      this.htmlUrl = htmlUrl;
      this.followers = followers;
      this.followings = followings;
      this.repositories = repositories;
      this.creatingDate = creatingDate;
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

   public URL getHtmlUrl() {
      return htmlUrl;
   }

   public void setHtmlUrl(URL htmlUrl) {
      this.htmlUrl = htmlUrl;
   }

   public String getFollowers() {
      return followers;
   }

   public void setFollowers(String followers) {
      this.followers = followers;
   }

   public String getFollowings() {
      return followings;
   }

   public void setFollowings(String followings) {
      this.followings = followings;
   }

   public String getRepositories() {
      return repositories;
   }

   public void setRepositories(String repositories) {
      this.repositories = repositories;
   }

   public String getCreatingDate() {
      return creatingDate;
   }

   public void setCreatingDate(String creatingDate) {
      this.creatingDate = creatingDate;
   }

   @Override
   public String toString() {
      return "GitUser{" +
            "login='" + login + '\'' +
            ", id=" + id +
            ", avatarUrl='" + avatarUrl + '\'' +
            ", url='" + url + '\'' +
            ", htmlUrl='" + htmlUrl + '\'' +
            ", followers='" + followers + '\'' +
            ", followings='" + followings + '\'' +
            ", repositories='" + repositories + '\'' +
            ", creatingDate='" + creatingDate + '\'' +
            '}';
   }
}
