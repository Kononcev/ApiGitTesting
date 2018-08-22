package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GitObject {
   @Override
   public String toString() {
      return ToStringBuilder.reflectionToString(this);
   }
}
