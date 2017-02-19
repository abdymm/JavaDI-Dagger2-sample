import dagger.Component;

@Component(modules={FutsalModule.class})
public interface FutsalComponent{
  void inject(FutsalMain main);
}
