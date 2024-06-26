package SayisalAnaliz;

public class LineerInterpolasyon {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public LineerInterpolasyon(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        System.out.println("y1 + (y2 - y1) * ((x - x1) / (x2 - x1)) ");
    }

    public double tahminEt(double x) {
        return this.y1 + (x - this.x1) / (this.x2 - this.x1) * (this.y2 - this.y1);
    }
}