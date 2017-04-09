import java.awt.*;
import java.applet.*;

/*applet code="question26" width=1000 heigth=1000>
</applet>
*/

public class question26 extends Applet{
	public void paint(Graphics g){
		int x=0,y=0;
		int count = 0;
		while(y<1000){
			
			while(x<1000){
				setBackground(Color.white);
				setForeground(Color.black);
				g.fillRect(x,y,125,125);
				x += 250;
			}
			count++;
			if(count%2!=0)
				x = 125;
			else
				x = 0;
			y += 125;
		}
	}
}
