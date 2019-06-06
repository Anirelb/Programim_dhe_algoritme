import javax.swing.*;
public class VleratMaksimale
{
public static void main(String[] a)
  { String A1= JOptionPane.showInputDialog("Vlera maksimale e boshtit Ox");
    String A2= JOptionPane.showInputDialog("Vlera maksimale e boshtit Oy");
    int Y1=Integer.parseInt(JOptionPane.showInputDialog("Vlera e pikes 1")); 
    int Y2=Integer.parseInt(JOptionPane.showInputDialog("Vlera e pikes 2"));
    int Y3=Integer.parseInt(JOptionPane.showInputDialog("Vlera e pikes 3"));
    int Y4=Integer.parseInt(JOptionPane.showInputDialog("Vlera e pikes 4"));
    int Y5=Integer.parseInt(JOptionPane.showInputDialog("Vlera e pikes 5"));
    int Y6=Integer.parseInt(JOptionPane.showInputDialog("Vlera e pikes 6"));
    PointGraphWriter P = new  PointGraphWriter();
    P.setAxes(200, 200, 500, A1, A2);
    double scale_factor = 400.0/new Double(A2).doubleValue();
    P.setPoint1( (int)(Y1 * scale_factor));   
    P.setPoint2( (int)(Y2 * scale_factor));   
    P.setPoint3( (int)(Y3 * scale_factor));  
    P.setPoint4( (int)(Y4 * scale_factor));  
    P.setPoint5( (int)(Y5 * scale_factor));
    P.setPoint6( (int)(Y6 * scale_factor));

}
}