import java.util.Scanner;

public class ComplexNumber{
   double real, img;
	
   ComplexNumber(double r, double i){
	this.real = r;
	this.img = i;
   }
	
   public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
   {
        ComplexNumber temp = new ComplexNumber(0, 0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }
    public static void main(String args[]) {
	double r1, r2, i1, i2;
    	Scanner in = new Scanner(System.in);
	System.out.println("enter the real and imaginary part of 1st complex number:");
	r1=in.nextDouble();
	i1=in.nextDouble();
	System.out.println("enter the real and imaginary part of 2nd complex number:");
	r2=in.nextDouble();
	i2=in.nextDouble();
	ComplexNumber c1 = new ComplexNumber(r1, i1);
	ComplexNumber c2 = new ComplexNumber(r2, i2);
        ComplexNumber temp = sum(c1, c2);
        System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
    }
}
