package Day16.abstractfactory;

public class DarkTextField implements TextField{
    @Override
    public void render() {
        System.out.println("Rendering Dark TextField");
    }
}