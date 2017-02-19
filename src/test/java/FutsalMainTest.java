import org.junit.Test;
import static org.junit.Assert.*;

public class FutsalMainTest {

    FutsalMain main;

    public FutsalMainTest(){
      main = new FutsalMain();
      DaggerFutsalComponent.create().inject(main);
    }

    @Test
    public void testFutsalTeam() {
      String testTeamName = "KendariFC";

      //test injected object
      main.team.setName(testTeamName);

      //assertion
      assertEquals(testTeamName, main.team.getName());
    }

    @Test
    public void testFutsalPlayer() {
      String testName = "Abdy";

      //test injected object
      main.player.setName(testName);

      //assertion
      assertEquals(testName, main.player.getName());
    }

}
