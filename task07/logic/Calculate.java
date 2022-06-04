package by.epam.task07.logic;

public class Calculate{
    public double getSquare(double x1, double y1, double x2, double y2, double x3, double y3) {
        double s = 0.5 * ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3));
        return Math.abs(s);
    }

    public double getPerimetr(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double b = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double c = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        double p = (a + b + c) / 2;
        return p;
    }

    public double getMedian(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double b = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double c = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        double m = 0.5 * Math.sqrt(2 * Math.pow(a, 2) + 2 * Math.pow(b, 2) + Math.pow(c, 2));
        return m;
    }

    public void getCoordinateOfMedian(double x1, double y1, double x2, double y2, double x3, double y3) {
        double xMedian = (x1 + x2 + x3) / 3;
        double yMedian = (y1 + y2 + y3) / 3;
        System.out.println("The coordinates of median is X = " + xMedian + " and Y =" + yMedian);
    }
}
