import client.GitUserClient;
import model.GitRepository;
import model.Repository;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class MainTest {
   private String repositoryName = "TestRepo";
   private String repositoryDescription = "creating from api request";
   private boolean isRepositoryPrivate = false;

   @Test
   public void testCreateNewRepository() {
      GitUserClient basicUser = new GitUserClient();
      List<GitRepository> repositories = Arrays.asList(basicUser.getUserRepositories().getModel());

      if (repositories.stream().anyMatch(it -> it.getName().equals(repositoryName)))
         basicUser.deleteRepository(repositoryName);
      basicUser.createNewRepository(new Repository(repositoryName, repositoryDescription, isRepositoryPrivate));
      repositories = Arrays.asList(basicUser.getUserRepositories().getModel());
      Assert.assertTrue(repositories.stream().anyMatch(it -> it.getName().equals(repositoryName)), String.format("repositories should contain repository with %s name", repositoryName));
      basicUser.deleteRepository(repositoryName);
      repositories = Arrays.asList(basicUser.getUserRepositories().getModel());
      Assert.assertFalse(repositories.stream().anyMatch(it -> it.getName().equals(repositoryName)), String.format("repositories shouldn't contain repository with %s name", repositoryName));
   }
}
