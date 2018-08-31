package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Repository {
   @JsonProperty("name")
   private String name;
   @JsonProperty("description")
   private String description;
   @JsonProperty("private")
   private boolean isPrivate;

   public Repository(String name, String description, boolean isPrivate) {
      this.name = name;
      this.description = description;
      this.isPrivate = isPrivate;
   }
}
