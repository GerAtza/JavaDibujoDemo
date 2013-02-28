

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.Shape;
import java.awt.color.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Arc2D.Double;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

	public class DemoDibujo extends JFrame {
			
	final static Color BG=Color.pink;
	final static Color FG=Color.BLUE;
		
	public DemoDibujo (){
		this.init();
		this.setSize(660,880);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
		
	public void init(){
		this.setBackground(BG);
		this.setForeground(FG);
	}
	
	public void paint(Graphics g){
		Graphics2D g2=(Graphics2D) g;
		
		/*for(int i=0;i<500;i+=50){
			g2.draw(new Line2D.Double(50+i, 50, 50+i, 450));
			g2.draw(new Line2D.Double(50, 50+i, 450, 50+i));
		}*/
		
		//Rectangulo.
		//g2.draw(new Rectangle2D.Double(100, 100, 100, 50));
		
		//Rectangulo con curvas.
		//g2.draw(new RoundRectangle2D.Double(300,40,100,200,10,10));
		
		//Curva.
		//g2.draw(new Arc2D.Double(50,50,150, 150, 40, 350,Arc2D.PIE));
		
		//Circulo.
		//g2.drawArc(100, 100, 250, 300, 400, 360);
		
		//Cuadrado de color.
		//g2.clearRect(0, 0, 500, 500);
		
		//Rectangulo3D
		/*Rectangle2D.Double rec1=new Rectangle2D.Double(100, 100, 90, 90);
		//g2.draw(new Rectangle2D.Double(100, 100, 90, 90));
		g2.setPaint(Color.darkGray);
		g2.fill(rec1);
		g2.setPaint(Color.ORANGE);
		g2.draw(rec1);
		
		Rectangle2D.Double rec2=new Rectangle2D.Double(270, 200, 90, 90);
		//g2.draw(new Rectangle2D.Double(270, 200, 90, 90));
		g2.setPaint(Color.darkGray);
		g2.fill(rec2);
		g2.setPaint(Color.ORANGE);
		g2.draw(rec2);
		
		g2.draw(new Line2D.Double(100, 100, 270, 200));
		g2.draw(new Line2D.Double(100, 190, 270, 290));
		g2.draw(new Line2D.Double(190, 100, 360, 200));
		g2.draw(new Line2D.Double(190, 190, 360, 290));*/
		
		//OJO
		/*Ellipse2D.Double elip1=new Ellipse2D.Double(200, 200, 100, 100);
		//g2.draw(new Ellipse2D.Double(200, 200, 100, 100));
		g2.setPaint(Color.blue);
		g2.fill(elip1);
		g2.setPaint(Color.black);
		g2.draw(elip1);
		
		Ellipse2D.Double elip2=new Ellipse2D.Double(225, 225, 50, 50);
		//g2.draw(new Ellipse2D.Double(225, 225, 50, 50));
		g2.setPaint(Color.GRAY);
		g2.fill(elip2);
		g2.setPaint(Color.black);
		g2.draw(elip2);
		
		g2.draw(new Arc2D.Double(53, -30, 390, 330, 220, 100, Arc2D.OPEN));
		g2.draw(new Arc2D.Double(53, 200, 390, 330, -220, -100, Arc2D.OPEN));
		*/
		
		//g2.fill3DRect(100, 100, 200, 150, false);
		
		//DibujoTarea
		
		//-----------------------Cuadro1-----------------------
		g2.setPaint(Color.red);
		g2.draw(new Line2D.Double(113,243,10,303));
		g2.draw(new Line2D.Double(150,264,45,324));
		g2.draw(new Line2D.Double(10,303,45,324));
		g2.draw(new Line2D.Double(45,324,45,559));
		g2.draw(new Line2D.Double(10,303,10,540));
		g2.draw(new Line2D.Double(10,540,45,559));
		g2.draw(new Line2D.Double(45,559,97,529));
		g2.draw(new Line2D.Double(97,529,97,491));
		g2.draw(new Line2D.Double(97,491,79,499));
		g2.draw(new Line2D.Double(79,499,79,421));
		g2.draw(new Line2D.Double(79,421,146,383));
		g2.draw(new Line2D.Double(146,383,146,461));
		g2.draw(new Line2D.Double(146,461,130,470));
		g2.draw(new Line2D.Double(183,480,183,324));
		g2.draw(new Line2D.Double(164,491,183,480));
		g2.draw(new Line2D.Double(112,402,112,442));
		g2.draw(new Line2D.Double(112,442,146,461));
		g2.draw(new Line2D.Double(112,442,79,461));
		//-----------------------Cuadro2----------------------
		//g2.setPaint(Color.ORANGE);
		g2.draw(new Line2D.Double(150,305,150,264));
		g2.draw(new Line2D.Double(150,305,199,333));
		g2.draw(new Line2D.Double(199,333,199,292));
		g2.draw(new Line2D.Double(199,292,150,264));
		g2.draw(new Line2D.Double(78,264,62,254));
		g2.draw(new Line2D.Double(62,254,62,213));
		g2.draw(new Line2D.Double(62,213,268,99));
		g2.draw(new Line2D.Double(268,99,334,139));
		g2.draw(new Line2D.Double(62,213,113,243));
		g2.draw(new Line2D.Double(199,292,374,196));
		g2.draw(new Line2D.Double(199,333,374,238));
		g2.draw(new Line2D.Double(132,214,199,176));
		g2.draw(new Line2D.Double(199,176,268,214));
		g2.draw(new Line2D.Double(268,214,199,252));
		g2.draw(new Line2D.Double(199,252,132,214));
		g2.draw(new Line2D.Double(166,233,199,215));
		g2.draw(new Line2D.Double(199,176,199,215));
		g2.draw(new Line2D.Double(199,215,233,233));
		//-----------------------Cuadro3----------------------
		//g2.setPaint(Color.red);
		g2.draw(new Line2D.Double(339,118,339,177));
		g2.draw(new Line2D.Double(339,177,374,196));
		g2.draw(new Line2D.Double(374,196,374,177));
		g2.draw(new Line2D.Double(374,177,441,218));
		g2.draw(new Line2D.Double(441,218,441,294));
		g2.draw(new Line2D.Double(441,294,374,254));
		g2.draw(new Line2D.Double(374,254,374,238));
		g2.draw(new Line2D.Double(339,118,374,99));
		g2.draw(new Line2D.Double(374,99,581,219));
		g2.draw(new Line2D.Double(339,118,548,237));
		g2.draw(new Line2D.Double(548,237,581,219));
		g2.draw(new Line2D.Double(339,256,339,277));
		g2.draw(new Line2D.Double(339,277,475,355));
		g2.draw(new Line2D.Double(548,237,548,356));
		g2.draw(new Line2D.Double(581,219,581,336));
		g2.draw(new Line2D.Double(408,198,408,235));
		g2.draw(new Line2D.Double(408,235,441,253));
		g2.draw(new Line2D.Double(408,235,374,254));
		//-----------------------Cuadro4----------------------
		//g2.setPaint(Color.green);
		g2.draw(new Line2D.Double(511,335,459,365));
		g2.draw(new Line2D.Double(459,365,493,384));
		g2.draw(new Line2D.Double(493,384,548,355));
		g2.draw(new Line2D.Double(548,356,511,335));
		g2.draw(new Line2D.Double(459,365,459,561));
		g2.draw(new Line2D.Double(493,384,493,583));
		g2.draw(new Line2D.Double(597,287,581,294));
		g2.draw(new Line2D.Double(597,287,631,308));
		g2.draw(new Line2D.Double(631,308,581,336));
		g2.draw(new Line2D.Double(631,308,631,543));
		g2.draw(new Line2D.Double(631,543,564,583));
		g2.draw(new Line2D.Double(528,404,597,365));
		g2.draw(new Line2D.Double(597,365,597,445));
		g2.draw(new Line2D.Double(597,445,527,483));
		g2.draw(new Line2D.Double(527,483,527,404));
		g2.draw(new Line2D.Double(564,384,564,426));
		g2.draw(new Line2D.Double(564,426,597,445));
		g2.draw(new Line2D.Double(527,445,564,426));
		//-----------------------Cuadro5----------------------
		//g2.setPaint(Color.pink);
		g2.draw(new Line2D.Double(459,523,441,513));
		g2.draw(new Line2D.Double(441,513,303,590));
		g2.draw(new Line2D.Double(493,583,528,563));
		g2.draw(new Line2D.Double(528,563,581,593));
		g2.draw(new Line2D.Double(581,593,581,633));
		g2.draw(new Line2D.Double(581,593,372,711));
		g2.draw(new Line2D.Double(581,633,372,749));
		g2.draw(new Line2D.Double(372,711,372,749));
		g2.draw(new Line2D.Double(372,711,268,650));
		g2.draw(new Line2D.Double(372,749,268,691));
		g2.draw(new Line2D.Double(441,552,459,561));
		g2.draw(new Line2D.Double(441,552,374,592));
		g2.draw(new Line2D.Double(374,592,441,631));
		g2.draw(new Line2D.Double(441,631,511,594));
		g2.draw(new Line2D.Double(511,594,493,583));
		g2.draw(new Line2D.Double(441,552,441,592));
		g2.draw(new Line2D.Double(441,592,407,611));
		g2.draw(new Line2D.Double(441,592,475,611));
		//-----------------------Cuadro6----------------------
		//g2.setPaint(Color.yellow);
		g2.draw(new Line2D.Double(61,549,61,628));
		g2.draw(new Line2D.Double(61,628,268,747));
		g2.draw(new Line2D.Double(268,747,303,729));
		g2.draw(new Line2D.Double(268,747,268,691));
		g2.draw(new Line2D.Double(303,729,303,711));
		g2.draw(new Line2D.Double(97,491,268,589));
		g2.draw(new Line2D.Double(127,470,302,571));
		g2.draw(new Line2D.Double(268,589,268,650));
		g2.draw(new Line2D.Double(268,650,303,631));
		g2.draw(new Line2D.Double(303,631,303,571));
		g2.draw(new Line2D.Double(269,589,303,571));
		g2.draw(new Line2D.Double(164,572,232,612));
		g2.draw(new Line2D.Double(232,612,232,687));
		g2.draw(new Line2D.Double(232,687,164,649));
		g2.draw(new Line2D.Double(164,649,164,572));
		g2.draw(new Line2D.Double(199,629,164,649));
		g2.draw(new Line2D.Double(199,629,232,649));
		g2.draw(new Line2D.Double(199,629,199,592));
	}
	
}
