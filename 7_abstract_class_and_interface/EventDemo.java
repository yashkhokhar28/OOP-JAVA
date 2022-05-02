/*Create interface EventListener with performEvent() method.
Create MouseListener interface which inherits EventListener along with mouseClicked(),
mouseClicked(), mouseReleased(), mouseMoved(), mouseDragged() methods.
Also create KeyListener interface which inherits EventListener along with keyPressed(),
keyReleased()methods. WAP to create EventDemo class which implements MouseListener
and KeyListener and demonstrate all the methods of the interfaces.*/

interface EventListener{
    void performEvent();
}
interface MouseListener extends EventListener{
    void mouseClicked();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}
interface KeyListener{
    void keyPressed();
    void keyReleased();
}

class Edemo implements EventListener,MouseListener,KeyListener{

    @Override
    public void performEvent() {
        System.out.println("Event Performed");
    }

    @Override
    public void mouseClicked() {
        System.out.println("Mouse Clicked");
    }

    @Override
    public void mouseReleased() {
        System.out.println("Mouse Released");
    }

    @Override
    public void mouseMoved() {
        System.out.println("Mouse Moved");
    }

    @Override
    public void mouseDragged() {
        System.out.println("Mouse Dragged");
    }

    @Override
    public void keyPressed() {
        System.out.println("Key Pressed");
    }

    @Override
    public void keyReleased() {
        System.out.println("Key Released");
    }
}



public class EventDemo {
    public static void main(String[] args) {
        Edemo e1 = new Edemo();
        e1.keyPressed();
        e1.keyReleased();
        e1.mouseReleased();
        e1.mouseClicked();
        e1.performEvent();
        e1.mouseDragged();
        e1.mouseMoved();
    }
}
