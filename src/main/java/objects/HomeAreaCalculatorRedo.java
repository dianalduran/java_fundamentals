package objects;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle firstRoom = calculator.getRoom();
        Rectangle secondRoom = calculator.getRoom();
        double totalArea = calculator.calculateAreaOfRoom(firstRoom, secondRoom);

        System.out.println("Area of both rooms: " + totalArea);
    }

    public Rectangle getRoom(){
        System.out.println("Enter the room length");
        double length = scanner.nextDouble();
        System.out.println("Enter the room width");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateAreaOfRoom(Rectangle firstRoom, Rectangle secondRoom){
        return firstRoom.calculateArea() + secondRoom.calculateArea();
    }
}
