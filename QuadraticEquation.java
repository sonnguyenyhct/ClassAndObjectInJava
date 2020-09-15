public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return (b*b - 4*a*c);
    }
    public double getRoot1(){
        return (-b + Math.pow((b*b - 4*a*c),0.5))/(2*a);
    }
    public double getRoot2(){
        return (-b - Math.pow((b*b - 4*a*c),0.5))/(2*a);
    }

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(2,3,4);
        if (quadraticEquation.getA() == 0){
            if (quadraticEquation.getB() == 0){
                if (quadraticEquation.getC() == 0){
                    System.out.println("Phuong trinh co vo so nghiem");
                }else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }else {
                System.out.println("Phuong trinh co 1 nghiem " + -quadraticEquation.getC()/quadraticEquation.getB());
            }
        }else {
            if (quadraticEquation.getDiscriminant() > 0){
                System.out.println("Phuong trinh co 2 nghiem " + quadraticEquation.getRoot1() + " va " + quadraticEquation.getRoot2());
            }else if (quadraticEquation.getDiscriminant() == 0){
                System.out.println("Phuong trinh co 1 nghiem" + quadraticEquation.getRoot1());
            }else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}
