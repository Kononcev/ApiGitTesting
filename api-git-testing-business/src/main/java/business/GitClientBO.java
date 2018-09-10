package business;

import client.GitUserClient;
import model.GitFollowers;
import model.GitRepository;
import model.GitUser;
import model.Repository;

import java.util.Arrays;
import java.util.List;

public class GitClientBO {
   private GitUserClient client;

   public GitClientBO() {
      this.client = new GitUserClient();
   }

   public GitUser getBasicUser() {
      return client.getBasicUser().getModel();
   }

   public List<GitRepository> getUserRepositories() {
      return Arrays.asList(client.getUserRepositories().getModel());
   }

   public String getRequestLimit() {
      return client.getRequestLimit().getModel();
   }

   public List<GitFollowers> getUserFollowers() {
      return Arrays.asList(client.getUserFollowers().getModel());
   }

   public GitRepository createNewRepository(Repository repository) {
      return client.createNewRepository(repository).getModel();
   }

   public void deleteRepository(String repositoryName) {
      client.deleteRepository(repositoryName);
   }
}
