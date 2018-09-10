import business.GitClientBO;
import model.GitRepository;
import model.Repository;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class CreatingRepositoryTest {
   private String repositoryName = "TestRepo";
   private String repositoryDescription = "creating from api request";
   private boolean isRepositoryPrivate = false;
   private GitClientBO basicUser;
   private List<GitRepository> repositories;
   private int repositoryCountBeforeCreating;

   @BeforeTest
   private void clearRepository() {
      basicUser = new GitClientBO();
      repositories = basicUser.getUserRepositories();
      if (repositories.stream().anyMatch(it -> it.getName().equals(repositoryName)))
         basicUser.deleteRepository(repositoryName);
      repositoryCountBeforeCreating = basicUser.getUserRepositories().size();
   }

   @Test
   public void testRepositoryIsCreated() {
      basicUser.createNewRepository(new Repository(repositoryName, repositoryDescription, isRepositoryPrivate));
      repositories = basicUser.getUserRepositories();
      Assert.assertTrue(repositories.stream().anyMatch(it -> it.getName().equals(repositoryName)), String.format("repositories should contain repository with %s name", repositoryName));
   }

   @Test(dependsOnMethods = "testRepositoryIsCreated")
   public void testRepositoryCountIncremented() {
      int repositoryCountAfterCreating = basicUser.getUserRepositories().size();
      Assert.assertEquals(repositoryCountBeforeCreating+1, repositoryCountAfterCreating,
            String.format("invalid repository count: actual[%d] expected[%d]", repositoryCountAfterCreating, repositoryCountBeforeCreating+1));
   }

   @AfterTest
   private void dropRepository() {
      basicUser.deleteRepository(repositoryName);
   }
}
