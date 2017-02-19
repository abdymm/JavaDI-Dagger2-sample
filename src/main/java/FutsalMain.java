import javax.inject.Inject;


public class FutsalMain{
  @Inject
  Team team;
  @Inject
  Player player;

  public void main(){
    team.setName("Kendari FC");
    team.setDesc("PS Kendari (singkatan dari Persatuan Sepak Bola Kendari) adalah sebuah klub sepak bola Indonesia yang berbasis di Kendari. PS Kendari saat ini berlaga di Divisi Tiga Liga Indonesia.");
    System.out.print(team.getName());
    System.out.print(team.getDesc());
  }
}
