
package sinegraph;


public class SineGraph {

    /**
     * @param args the command line arguments
     */
    
       class sine {
  static final double xPrecision = 10.0; // (1/xPrecision) is the precision on x-values
  static final double yPrecision = 10.0; // (1/yPrecision) is the precision on y-values
  static final int PI = (int) (3.1415 * xPrecision);
  static final int TPI = 2 * PI; // twice PI
  static final int HPI = PI / 2; // half PI

  public static void main(String[] args) {
    double xd;

    for(int start = (int) (1 * yPrecision), y = start; y >= -start; y--){
      double x0 = Math.asin(y / yPrecision),
            x1 = bringXValueWithinPrecision(x0),
            x2 = bringXValueWithinPrecision(x0 + TPI / xPrecision),
            x3 = bringXValueWithinPrecision(PI/xPrecision - x0);

      // for debug
      //System.out.println(y + " " + x0 + " " + x1 + " " + x2 + " " + x3);

      for(int x = 0; x <= TPI; x++){
        xd = (x / xPrecision);

        if(x1 == xd || x2 == xd  || x3 == xd)
          System.out.print("");
        else System.out.print(" ");
      }

      System.out.println();
    }
  }

  public static double bringXValueWithinPrecision(double num){
      // obviously num has 16 floating points
      // we need to get num within our precision
      return Math.round(num xPrecision) / xPrecision;
  }
}
    }
    

