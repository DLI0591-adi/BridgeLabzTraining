package Day16.abstractfactory;

public class LightButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering Light Button");
    }
}
