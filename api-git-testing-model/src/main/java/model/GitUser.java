package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URL;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GitUser extends GitBasicUser{
   @JsonProperty("created_at")
   private String creatingDate;
   @JsonProperty("updated_at")
   private String updatingDate;
   @JsonProperty("followers")
   private Integer followersCount;
   @JsonProperty("following")
   private Integer followingCount;

   public GitUser(String login, Integer id, String avatarUrl, String url, URL htmlUrl, String repositories, String userType, String creatingDate, String updatingDate, Integer followersCount, Integer followingCount) {
      super(login, id, avatarUrl, url, htmlUrl, repositories, userType);
      this.creatingDate = creatingDate;
      this.updatingDate = updatingDate;
      this.followersCount = followersCount;
      this.followingCount = followingCount;
   }

   public String getCreatingDate() {
      return creatingDate;
   }

   public void setCreatingDate(String creatingDate) {
      this.creatingDate = creatingDate;
   }

   public String getUpdatingDate() {
      return updatingDate;
   }

   public void setUpdatingDate(String updatingDate) {
      this.updatingDate = updatingDate;
   }

   public Integer getFollowersCount() {
      return followersCount;
   }

   public void setFollowersCount(Integer followersCount) {
      this.followersCount = followersCount;
   }

   public Integer getFollowingCount() {
      return followingCount;
   }

   public void setFollowingCount(Integer followingCount) {
      this.followingCount = followingCount;
   }

   @Override
   public String toString() {
      return "GitUser{" +
            "login='" + super.getLogin() + '\'' +
            ", id=" + super.getId() +
            ", avatarUrl='" + super.getAvatarUrl() + '\'' +
            ", url='" + super.getUrl() + '\'' +
            ", htmlUrl=" + super.getHtmlUrl() +
            ", repositories='" + super.getRepositories() + '\'' +
            ", userType='" + super.getUserType() + '\'' +
            "creatingDate='" + creatingDate + '\'' +
            ", updatingDate='" + updatingDate + '\'' +
            ", followersCount=" + followersCount +
            ", followingCount=" + followingCount +
            '}';
   }
}
