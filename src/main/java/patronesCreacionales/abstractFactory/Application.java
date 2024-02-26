package patronesCreacionales.abstractFactory;

public class Application {
    private GUIFactory factory;
    private Button button;

    public Application(GUIFactory factory){
        this.factory = factory;
        this.button = factory.createButton();
    }
    public void clickButton(){
        button.click();
    }
}
