package OOPS.ClassObject.Practice;
 
//class defination
 class rectangle {
    double length;
    double width;


  //constructor
  public rectangle(double length , double width){
    this.length = length;
    this.width = width;

  }

  //Method calculate area
  public double calculateArea(){
    return  length*width;
  }

      // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }


    // Method to display rectangle properties
    public void displayProperties() {
        System.out.println("Rectangle Length: " + length);
        System.out.println("Rectangle Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
      
}
