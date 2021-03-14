import javax.swing.*;

public abstract class AbstractButton extends JButton {
    public AbstractButton() { }
    public abstract void display();//抽象方法，子类重写
}
