import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code = "question29" width=200 height=200>
</applet>
*/

class menuframe extends Frame implements ActionListener{
	int x,y;
	menuframe(String title){
		super(title);
		MenuBar mb = new MenuBar();
		setMenuBar(mb);
		Menu h = new Menu("Horizontal");
		Menu v = new Menu("Vertical");
		MenuItem m1,m2,m3,m4;
		h.add(m1 = new MenuItem("Left"));
		h.add(m2 = new MenuItem("Right"));
		v.add(m3 = new MenuItem("Up"));
		v.add(m4 = new MenuItem("Down"));
		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);
		m4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		String s = ae.getActionCommand();
		if(s.equals("Left")){
			x = -5;
				y=0;}
		else if( s.equals("Right")){
			x = +5;
				y=0;}

		else if(s.equals("Up")){
			y = -5;
				x=0;
		}
		else if(s.equals("Down")){
				y = +5;
				x=0;
				}
		
		repaint();
	}
	public void paint(Graphics g){
		int[] l={10+x,50+x,25+x,25+x};
		int[] m={50+y,50+y,10+y,10+y};
		g.drawPolygon(l,m,4);
	}

}
public class question29 extends Applet{
	Frame f;
	public void init(){
		f = new menuframe("yash");
		f.setSize(425,234);
		f.setVisible(true);
	}
	public void start(){
		f.setVisible(true);
	}
	public void stop(){
		f.setVisible(false);
	}
}