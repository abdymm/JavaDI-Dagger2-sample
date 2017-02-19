import dagger.Module;
import dagger.Provides;

@Module
public class FutsalModule{

  @Provides
  Player providesPlayer(){
    return new Player();
  }

  @Provides
  Team providesTeam(){
    return new Team();
  }


}
