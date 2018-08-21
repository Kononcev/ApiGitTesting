package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GitRepositories {
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

   public GitRepositories() {
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

   @Override
   public String toString() {
      return "GitRepositories{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", fullName='" + fullName + '\'' +
            ", owner=" + owner +
            ", htmlURL='" + htmlURL + '\'' +
            ", size='" + size + '\'' +
            ", gitURL='" + gitURL + '\'' +
            ", defaultBranch='" + defaultBranch + '\'' +
            '}';
   }
}