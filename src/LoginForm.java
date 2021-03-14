import javax.swing.*;

public class LoginForm extends JFrame {
    private AbstractButton button=null;
    public void display(){
        button=new CircleButton();
        button.display();
        button=new RectangleButton();
        button.display();
    }
}
