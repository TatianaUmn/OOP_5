public class Complex extends Rational{
    double real; 
    double image; 

    public Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public Complex() {

    }


    public double getImage() {

        return image;
    }

    public void setImage(double image) {
        this.image = image;
    }
    public double getReal() {
        return real;
    }

    public void setReal(double real) {

        this.real = real;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(real).append(":").append(image);
        return sb.toString();
    }
}
