package objects;

public class HomeAreaCalculator {
    public static void main(String[] args){
        Rectangle firstRoom = new Rectangle();
        firstRoom.setLength(50);
        firstRoom.setWidth(25);
        double areaOfFirstRoom = firstRoom.calculateArea();

        Rectangle secondRoom = new Rectangle(30, 75);
        double areaOfSecondRoom = secondRoom.calculateArea();

        double totalArea = areaOfFirstRoom + areaOfSecondRoom;
        System.out.println("Area of both rooms: " + totalArea);
    }
}
