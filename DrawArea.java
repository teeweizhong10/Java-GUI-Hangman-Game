import java.awt.*;
import javax.swing.*;

/**
 * This file contains all the properties of the hangman drawing.
 * @author Wei Zhong Tee
 * @since 1 March 2020
 */


public class DrawArea extends JComponent {

  private int shape;
	/**
	 * constructor for the class DrawArea
	 * @param r the radius number of failed attempts the user has had to guess characters.
	 */
	public DrawArea(int r){
		this.shape = r;
	}

  /**
   * DrawShape is a setter method that tells the paintComponent which hangman piece to draw
   * @param num a number that determines which hangman piece to draw based on how many incorrect guesses a user has made
   */
  public void DrawShape(int num) {
    this.shape = num;
  }

  /**
   * paintComponent draws the hangman parts
   * @param g
   */

	public void paintComponent(Graphics g){
		removeAll();

		if(shape == 1) {
      g.setColor(Color.black);
	    int [ ] x = {400,420,420,400};//xcoordinates for polygon
	    int [ ] y = {100,100,400,400};//yccordinates for polygon
	    Polygon p = new Polygon(x, y, x.length);//how many sides the last thing
	    g.fillPolygon(p);

      int [ ] a = {250,250,400,400};//xcoordinates for polygon
      int [ ] b = {100,120,120,100};//yccordinates for polygon
      Polygon p1 = new Polygon(a, b, a.length);//how many sides the last thing
      g.fillPolygon(p1);

      int [ ] c = {250,250,500,500};//xcoordinates for polygon
      int [ ] d = {400,420,420,400};//yccordinates for polygon
      Polygon p2 = new Polygon(c, d, c.length);//how many sides the last thing
      g.fillPolygon(p2);
		}

    if (shape == 2) {
      g.setColor(Color.black);
	    int [ ] x = {400,420,420,400};//xcoordinates for polygon
	    int [ ] y = {100,100,400,400};//yccordinates for polygon
	    Polygon p = new Polygon(x, y, x.length);//how many sides the last thing
	    g.fillPolygon(p);

      int [ ] a = {250,250,400,400};//xcoordinates for polygon
      int [ ] b = {100,120,120,100};//yccordinates for polygon
      Polygon p1 = new Polygon(a, b, a.length);//how many sides the last thing
      g.fillPolygon(p1);

      int [ ] c = {250,250,500,500};//xcoordinates for polygon
      int [ ] d = {400,420,420,400};//yccordinates for polygon
      Polygon p2 = new Polygon(c, d, c.length);//how many sides the last thing
      g.fillPolygon(p2);

      g.setColor(Color.black);
			g.fillOval(220,110,30*2, 30*2);
    }

    if (shape == 3) {
      g.setColor(Color.black);
	    int [ ] x = {400,420,420,400};//xcoordinates for polygon
	    int [ ] y = {100,100,400,400};//yccordinates for polygon
	    Polygon p = new Polygon(x, y, x.length);//how many sides the last thing
	    g.fillPolygon(p);

      int [ ] a = {250,250,400,400};//xcoordinates for polygon
      int [ ] b = {100,120,120,100};//yccordinates for polygon
      Polygon p1 = new Polygon(a, b, a.length);//how many sides the last thing
      g.fillPolygon(p1);

      int [ ] c = {250,250,500,500};//xcoordinates for polygon
      int [ ] d = {400,420,420,400};//yccordinates for polygon
      Polygon p2 = new Polygon(c, d, c.length);//how many sides the last thing
      g.fillPolygon(p2);

      g.setColor(Color.black);
			g.fillOval(220,110,30*2, 30*2);

      int [ ] e = {250,260,260,250};//xcoordinates for polygon
      int [ ] f = {100,100,300,300};//yccordinates for polygon
      Polygon p3 = new Polygon(e, f, e.length);//how many sides the last thing
      g.fillPolygon(p3);
    }

    if (shape == 4) {
      g.setColor(Color.black);
      int [ ] x = {400,420,420,400};//xcoordinates for polygon
      int [ ] y = {100,100,400,400};//yccordinates for polygon
      Polygon p = new Polygon(x, y, x.length);//how many sides the last thing
      g.fillPolygon(p);

      int [ ] a = {250,250,400,400};//xcoordinates for polygon
      int [ ] b = {100,120,120,100};//yccordinates for polygon
      Polygon p1 = new Polygon(a, b, a.length);//how many sides the last thing
      g.fillPolygon(p1);

      int [ ] c = {250,250,500,500};//xcoordinates for polygon
      int [ ] d = {400,420,420,400};//yccordinates for polygon
      Polygon p2 = new Polygon(c, d, c.length);//how many sides the last thing
      g.fillPolygon(p2);

      g.setColor(Color.black);
      g.fillOval(220,110,30*2, 30*2);

      int [ ] e = {250,260,260,250};//xcoordinates for polygon
      int [ ] f = {100,100,300,300};//yccordinates for polygon
      Polygon p3 = new Polygon(e, f, e.length);//how many sides the last thing
      g.fillPolygon(p3);

      int [ ] h = {250,260,210,200};//xcoordinates for polygon
      int [ ] i = {200,200,260,260};//yccordinates for polygon
      Polygon p4 = new Polygon(h, i, h.length);//how many sides the last thing
      g.fillPolygon(p4);
    }

    if (shape == 5) {
      g.setColor(Color.black);
      int [ ] x = {400,420,420,400};//xcoordinates for polygon
      int [ ] y = {100,100,400,400};//yccordinates for polygon
      Polygon p = new Polygon(x, y, x.length);//how many sides the last thing
      g.fillPolygon(p);

      int [ ] a = {250,250,400,400};//xcoordinates for polygon
      int [ ] b = {100,120,120,100};//yccordinates for polygon
      Polygon p1 = new Polygon(a, b, a.length);//how many sides the last thing
      g.fillPolygon(p1);

      int [ ] c = {250,250,500,500};//xcoordinates for polygon
      int [ ] d = {400,420,420,400};//yccordinates for polygon
      Polygon p2 = new Polygon(c, d, c.length);//how many sides the last thing
      g.fillPolygon(p2);

      g.setColor(Color.black);
      g.fillOval(220,110,30*2, 30*2);

      int [ ] e = {250,260,260,250};//xcoordinates for polygon
      int [ ] f = {100,100,300,300};//yccordinates for polygon
      Polygon p3 = new Polygon(e, f, e.length);//how many sides the last thing
      g.fillPolygon(p3);

      int [ ] h = {250,260,210,200};//xcoordinates for polygon
      int [ ] i = {200,200,260,260};//yccordinates for polygon
      Polygon p4 = new Polygon(h, i, h.length);//how many sides the last thing
      g.fillPolygon(p4);

      int [ ] j = {250,260,310,300};//xcoordinates for polygon
      int [ ] k = {200,200,260,260};//yccordinates for polygon
      Polygon p5 = new Polygon(j, k, j.length);//how many sides the last thing
      g.fillPolygon(p5);
    }

    if (shape == 6) {
      g.setColor(Color.black);
      int [ ] x = {400,420,420,400};//xcoordinates for polygon
      int [ ] y = {100,100,400,400};//yccordinates for polygon
      Polygon p = new Polygon(x, y, x.length);//how many sides the last thing
      g.fillPolygon(p);

      int [ ] a = {250,250,400,400};//xcoordinates for polygon
      int [ ] b = {100,120,120,100};//yccordinates for polygon
      Polygon p1 = new Polygon(a, b, a.length);//how many sides the last thing
      g.fillPolygon(p1);

      int [ ] c = {250,250,500,500};//xcoordinates for polygon
      int [ ] d = {400,420,420,400};//yccordinates for polygon
      Polygon p2 = new Polygon(c, d, c.length);//how many sides the last thing
      g.fillPolygon(p2);

      g.setColor(Color.black);
      g.fillOval(220,110,30*2, 30*2);

      int [ ] e = {250,260,260,250};//xcoordinates for polygon
      int [ ] f = {100,100,300,300};//yccordinates for polygon
      Polygon p3 = new Polygon(e, f, e.length);//how many sides the last thing
      g.fillPolygon(p3);

      int [ ] h = {250,260,210,200};//xcoordinates for polygon
      int [ ] i = {200,200,260,260};//yccordinates for polygon
      Polygon p4 = new Polygon(h, i, h.length);//how many sides the last thing
      g.fillPolygon(p4);

      int [ ] j = {250,260,310,300};//xcoordinates for polygon
      int [ ] k = {200,200,260,260};//yccordinates for polygon
      Polygon p5 = new Polygon(j, k, j.length);//how many sides the last thing
      g.fillPolygon(p5);

      int [ ] l = {250,260,210,200};//xcoordinates for polygon
      int [ ] m = {300,300,360,360};//yccordinates for polygon
      Polygon p6 = new Polygon(l, m, l.length);//how many sides the last thing
      g.fillPolygon(p6);
    }

    if (shape == 7) {
      g.setColor(Color.black);
      int [ ] x = {400,420,420,400};//xcoordinates for polygon
      int [ ] y = {100,100,400,400};//yccordinates for polygon
      Polygon p = new Polygon(x, y, x.length);//how many sides the last thing
      g.fillPolygon(p);

      int [ ] a = {250,250,400,400};//xcoordinates for polygon
      int [ ] b = {100,120,120,100};//yccordinates for polygon
      Polygon p1 = new Polygon(a, b, a.length);//how many sides the last thing
      g.fillPolygon(p1);

      int [ ] c = {250,250,500,500};//xcoordinates for polygon
      int [ ] d = {400,420,420,400};//yccordinates for polygon
      Polygon p2 = new Polygon(c, d, c.length);//how many sides the last thing
      g.fillPolygon(p2);

      g.setColor(Color.black);
      g.fillOval(220,110,30*2, 30*2);

      int [ ] e = {250,260,260,250};//xcoordinates for polygon
      int [ ] f = {100,100,300,300};//yccordinates for polygon
      Polygon p3 = new Polygon(e, f, e.length);//how many sides the last thing
      g.fillPolygon(p3);

      int [ ] h = {250,260,210,200};//xcoordinates for polygon
      int [ ] i = {200,200,260,260};//yccordinates for polygon
      Polygon p4 = new Polygon(h, i, h.length);//how many sides the last thing
      g.fillPolygon(p4);

      int [ ] j = {250,260,310,300};//xcoordinates for polygon
      int [ ] k = {200,200,260,260};//yccordinates for polygon
      Polygon p5 = new Polygon(j, k, j.length);//how many sides the last thing
      g.fillPolygon(p5);

      int [ ] l = {250,260,210,200};//xcoordinates for polygon
      int [ ] m = {300,300,360,360};//yccordinates for polygon
      Polygon p6 = new Polygon(l, m, l.length);//how many sides the last thing
      g.fillPolygon(p6);

      int [ ] n = {250,260,310,300};//xcoordinates for polygon
      int [ ] o = {300,300,360,360};//yccordinates for polygon
      Polygon p7 = new Polygon(n, o, n.length);//how many sides the last thing
      g.fillPolygon(p7);
    }

	}
}
