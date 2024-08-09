public class ContructorDemo {
    public static void main(String[] args) {
        ContRectangle boxA = new ContRectangle(8.0,12.0);
        ContRectangle boxB = new ContRectangle();
        /* 
        Rectangle box = new Rectagle();
        box.setLength(8.0);
        box.setWidt(12.0);
        */
        System.out.println("The boxA's Length is " + boxA.getLength());
        System.out.println("The boxA's Width is " + boxA.getWidth());
        System.out.println("The boxA's Area is " + boxA.getArea());
        System.out.println("The boxB's Length is " + boxB.getLength());
        System.out.println("The boxB's Width is " + boxB.getWidth());
        System.out.println("The boxB's Area is " + boxB.getArea());
    }
}
    
