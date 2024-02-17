package week03.math;

public class ComplexNumber {
    private double real;
    private double imag;
    public ComplexNumber(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    public boolean equals(ComplexNumber number){
        return this.real == number.real && this.imag == number.imag;
    }
  
    public double re(){
        return real;
    }
    public double imag(){
        return imag;
    }
    public void conjugate(){
        this.imag = -this.imag;
    }
    public double abs(){
        return Math.sqrt(real*real+ imag*imag);
    }
    public void add(ComplexNumber number) {
        this.real += number.real;
        this.imag += number.imag;
    }
    
    public void sub(ComplexNumber number) {
        this.real -= number.real;
        this.imag -= number.imag;
    }
    public void mult(ComplexNumber number) {
        float newReal = (float)((this.real * number.real) - (this.imag * number.imag));
        float newImag = (float)((this.real * number.imag) + (this.imag * number.real));
        this.real = newReal;
        this.imag = newImag;
    }
    public double[] exponentiation(int n) {
    double magnitude = Math.pow(this.abs(), n);
    double angle = Math.atan2(this.imag, this.real);
    double newReal = magnitude * Math.cos(n * angle);
    double newImag = magnitude * Math.sin(n * angle);
    return new double[]{newReal, newImag};
    }   
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%.2f + %.2fi", real, imag));
        return sb.toString();
    }
}
    
