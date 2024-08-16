package Day16.abstractfactory;

public class DarkButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering Dark Button");
    }
}
