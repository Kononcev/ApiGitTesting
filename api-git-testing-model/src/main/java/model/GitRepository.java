package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GitRepository extends GitObject{
   private String id;
   private String name;
   @JsonProperty("full_name")
   private String fullName;
   private GitBasicUser owner;
   @JsonProperty("html_url")
   private String htmlURL;
   private String size;
   @JsonProperty("git_url")
   private String gitURL;
   @JsonProperty("default_branch")
   private String defaultBranch;

   public GitRepository() {
   }

   public GitRepository(String id, String name, String fullName, GitBasicUser owner, String htmlURL, String size, String gitURL, String defaultBranch) {
      this.id = id;
      this.name = name;
      this.fullName = fullName;
      this.owner = owner;
      this.htmlURL = htmlURL;
      this.size = size;
      this.gitURL = gitURL;
      this.defaultBranch = defaultBranch;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getFullName() {
      return fullName;
   }

   public void setFullName(String fullName) {
      this.fullName = fullName;
   }

   public GitBasicUser getOwner() {
      return owner;
   }

   public void setOwner(GitBasicUser owner) {
      this.owner = owner;
   }

   public String getHtmlURL() {
      return htmlURL;
   }

   public void setHtmlURL(String htmlURL) {
      this.htmlURL = htmlURL;
   }

   public String getSize() {
      return size;
   }

   public void setSize(String size) {
      this.size = size;
   }

   public String getGitURL() {
      return gitURL;
   }

   public void setGitURL(String gitURL) {
      this.gitURL = gitURL;
   }

   public String getDefaultBranch() {
      return defaultBranch;
   }

   public void setDefaultBranch(String defaultBranch) {
      this.defaultBranch = defaultBranch;
   }
}
