package Day16.abstractfactory;

public class DarkUIComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextField createTextField() {
        return new DarkTextField();
    }
}
