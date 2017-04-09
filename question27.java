import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*applet code="question27" width=1000 heigth=1000>
</applet>
*/


public class question27 extends Applet implements ActionListener{
	TextField ta,tb,ts,tc,td,te,tf;
	Button b;
	int total;
	public void init(){
		ts = new TextField("s");
		ta = new TextField("a");
		tb = new TextField("b");
		tc = new TextField("c");
		td = new TextField("d");
		te = new TextField("e");
		tf = new TextField("f");
		b = new Button("PIECHART!");
		setLayout(null);
		ts.setBounds(20,20,50,20);
		ta.setBounds(20,40,50,20);
		tb.setBounds(20,60,50,20);
		tc.setBounds(20,80,50,20);
		td.setBounds(20,100,50,20);
		te.setBounds(20,120,50,20);
		tf.setBounds(20,140,50,20);
		b.setBounds(40,160,40,10);
		add(ts);
		add(ta);
		add(tb);
		add(tc);
		add(td);
		add(te);
		add(tf);
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		total = Integer.parseInt(ts.getText()) + Integer.parseInt(ta.getText()) +Integer.parseInt(tb.getText())+Integer.parseInt(tc.getText())+Integer.parseInt(td.getText()) + Integer.parseInt(te.getText()) +Integer.parseInt(tf.getText());
		repaint();
	}
	public void paint(Graphics g){
		int x = Integer.parseInt(ts.getText())*360/total;
		Color c = new Color(x);
		setForeground(c);
		g.fillArc(100,100,80,80,0,x);
	}
}