import java.applet.Applet;
import java.awt.*;
public class abc extends Applet
{
  public void paint(Graphics g)
  {
	g.drawString("This is an Applet program of the human Face display",70,30);
    g.drawOval(70,40,140,140);
    g.fillOval(90,70,45,20);
    g.fillOval(150,70,45,20);
    g.drawRect(140,100,1,40);
    g.drawArc(100,78,78,78,200,150);


  }

}