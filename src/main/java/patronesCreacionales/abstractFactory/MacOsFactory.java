package patronesCreacionales.abstractFactory;

public class MacOsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }
}
