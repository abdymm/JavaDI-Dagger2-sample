import javax.inject.Inject;


public class FutsalMain{
  @Inject
  Team team;
  @Inject
  Player player;

  public static void main(String[] args){
    System.out.print("Sample Dagger2 Implementation on Java");
  }
}
