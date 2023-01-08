package Lesson11;

public class Lesson11{
static class Car {
    String Color;
    String Engine;
    int door;
    public Car(String Color,String Engine, int door){
        this.Color=Color;
        this.Engine=Engine;
        this.door=door;
    }
}

 static class CarTest{
    public void changeDoor(Car c1, int d){
        c1.door=d;
    }
    public void changeColor(Car a, Car b){
        String c=b.Color;
        b.Color=a.Color;
        a.Color=c;
    }
}

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("black","V6",4);
        Car car2 = new Car("white","V8",2);
        ct.changeDoor(car1,2);
        ct.changeDoor(car2,4);
        System.out.println(car1.door);
        System.out.println(car2.door);
        ct.changeColor(car1,car2);
        System.out.println(car1.Color);
        System.out.println(car2.Color);
    }
}
