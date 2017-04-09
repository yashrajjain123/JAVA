import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*applet code="question28" width=1000 heigth=1000>
</applet>
*/

public class question28 extends Applet implements AdjustmentListener{
	int h,b;
	Scrollbar vertsb,horisb;
	public void init(){
		vertsb = new Scrollbar(Scrollbar.VERTICAL,10,1,10,100);
		vertsb.setUnitIncrement(2);
		add(vertsb);
		horisb = new Scrollbar(Scrollbar.HORIZONTAL,10,1,10,150);
		horisb.setUnitIncrement(2);
		add(horisb);
		vertsb.addAdjustmentListener(this);
		horisb.addAdjustmentListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae){
		repaint();
	}
	public void paint(Graphics g){
		h = vertsb.getValue();
		b = horisb.getValue();
		g.fillRect(100,100,h,b);
	}
}