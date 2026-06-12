/*
class Car {
    String color;
    String brand;
    int speed;
    int fuel;

    public Car(String brand, String color, int fuel) {
        this.brand = brand;
        this.color = color;
        this.fuel = fuel;
        this.speed = 0;
    }

    public void accelerate() {
        if (fuel > 0) {
            speed += 20;
            fuel -= 10;
            System.out.println(brand + " accelerated. Speed: " + speed + " km/h | Fuel: " + fuel + "%");
        }
    }

    public void decelerate() {
        if (speed > 0) {
            speed -= 20;
            System.out.println(brand + " slowed down. Speed: " + speed + " km/h");
        }
    }

    public void refill() {
        fuel += 30;
        System.out.println(brand + " refueled. Current Fuel: " + fuel + "%");
    }

    public void showFuel() {
        System.out.println("Fuel Status for " + color + " " + brand + ": " + fuel + "%");
    }
}

class CarApp {
    public static void main(String[] args) {
        Car myCar = new Car("Thar", "black", 70);

        myCar.showFuel();
        myCar.accelerate();
        myCar.accelerate();
        myCar.decelerate();
        myCar.refill();
        myCar.showFuel();
    }
}
*/
public class day6 {
    static class Student {
        String name, dept;
        int regNo;
        int maths, physics, chemistry;
        Student(String n, int r, String d) {
            name = n;
            regNo = r;
            dept = d;
        }
        int getMaths() {
            return maths;
        }
        int getPhysics() {
            return physics;
        }
        int getChemistry() {
            return chemistry;
        }
        void setMaths(int m) {
            maths = m;
        }
        void setPhysics(int p) {
            physics = p;
        }

        void setChemistry(int c) {
            chemistry = c;
        }
        void updateMarks(int m) {
            maths = m;
        }
        void updateMarks(int m, int p) {
            maths = m;
            physics = p;
        }
        void updateMarks(int m, int p, int c) {
            maths = m;
            physics = p;
            chemistry = c;
        }
        void show() {
            System.out.println(name + " " + regNo + " " + dept);
            System.out.println(maths + " " + physics + " " + chemistry);
            System.out.println("  ");
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("divya", 101, "maths");
        Student s2 = new Student("poojana", 102, "physics");
        Student s3 = new Student("jeslin", 103, "chemistry");
        s1.updateMarks(85, 95, 90);
        s2.setMaths(80);
        s2.setPhysics(95);
        s2.setChemistry(75);
        s3.updateMarks(98);
        s1.show();
        s2.show();
        s3.show();
    }
}

