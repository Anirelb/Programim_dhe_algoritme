public class TestTemperature
 {
 public static void main(String[] args) 
 {

    int temperatureDay1 = 25;
    int temperatureDay2 = 19;
    int temperatureDay3 = 20;
    int temperatureDay4 = 32;
    int temperatureDay5 = 25;
    int temperatureDay6 = 19;
    
    PointGraphWriter T = new PointGraphWriter();
    T.setAxes(100, 150, 70, "5", "40");
    int scale_factor = 3;
    T.setPoint1(temperatureDay1*scale_factor);
    T.setPoint2(temperatureDay2*scale_factor);
    T.setPoint3(temperatureDay3*scale_factor);
    T.setPoint4(temperatureDay4*scale_factor);
    T.setPoint5(temperatureDay5*scale_factor);
    T.setPoint6(temperatureDay6*scale_factor);
  }
}