package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitUser extends GitBasicUser {
   @JsonProperty("created_at")
   private String creatingDate;
   @JsonProperty("updated_at")
   private String updatingDate;
   @JsonProperty("followers")
   private Integer followersCount;
   @JsonProperty("following")
   private Integer followingCount;

   public GitUser() {

   }

   public GitUser(String login, Integer id, String avatarUrl, String url, String htmlUrl, String repositories, String userType, String creatingDate, String updatingDate, Integer followersCount, Integer followingCount) {
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
}
