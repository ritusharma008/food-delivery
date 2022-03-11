class pens {    // class
    String color;
    String type;

    public void write() {        // method
        System.out.println("Writing");
    }

    public void printColor() {  // method
        System.out.println(this.color);
    }
    public void printType() {
        System.out.println(this.type);
    }

}  
public class oops {
    public static void main(String[] args) {
        pens pen = new pens();   // object
        pen.color = "blue";
        pen.type = "gel";
         
        pens pen1 = new pens();
        pen1.color = "black";
        pen1.type = "ballpen";
        
        pen.write();
        pen1.printColor(); // call methods
        pen.printColor();
        pen1.printType();
    }
}