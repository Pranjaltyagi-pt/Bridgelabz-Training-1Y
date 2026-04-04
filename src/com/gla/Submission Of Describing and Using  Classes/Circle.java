

public class Circle {
        double rad;

        Circle(){
            rad = 0;

        }
        Circle(double r){
          rad = r;

        }
        void dis(){
            System.out.println("Radius of the circle  " +rad);
        }
        public static void main(String[] args) {
            Circle c1 = new Circle();
            c1.dis();
            System.out.println();
             Circle c2 = new Circle(548);
            c2.dis();
        }

}
