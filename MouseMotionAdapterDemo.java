import java.awt.*;   
import java.awt.event.*;   
public class MouseMotionAdapterDemo extends MouseMotionAdapter  
{  
    Frame f;   
MouseMotionAdapterDemo() 
{   
f=new Frame("Mouse Motion Adapter");   
f.addMouseMotionListener(this);   
f.setSize(600,600);   
f.setLayout(null);   
f.setVisible(true);   
}   
public void mouseDragged(MouseEvent e) {   
Graphics g=f.getGraphics();   
g.setColor(Color.ORANGE);   
g.fillOval(e.getX(),e.getY(),20,20);   
}   
public static void main(String[] args) 
{   
new MouseMotionAdapterDemo();   
}   
}   