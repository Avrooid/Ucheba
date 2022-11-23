public class Tank{

    private int x;
    private int y;
    private int direction = 1;
    private int fuel = 100;
    private static final String name = "T34";
    private static int number = 0;
    private int numberTank;

    public Tank(){
        number++;
        numberTank = number;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
        number++;
        numberTank = number;
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        number++;
        numberTank = number;
    }

    public void turnRight() {
        if (direction == 4) {
            direction = 1;
        }

        direction += 1;
    }

    public void turnLeft() {
        if(direction == 1) {
            direction = 4;
        }

        direction -= 1;
    }

    public void goForward(int dx) {
        if(direction == 1) {
            if(Math.abs(dx) >= fuel) {
                fuel = dx < 0 ? -fuel : fuel;
                x += fuel;
                fuel = 0;
            }
            else {
                x += dx;
                fuel -= Math.abs(fuel);
            }
        }
        if(direction == 2) {
            if(Math.abs(dx) >= fuel) {
                fuel = dx < 0 ? -fuel : fuel;
                y += fuel;
                fuel = 0;
            }
            else {
                y += dx;
                fuel -= Math.abs(fuel);
            }
        }
        if(direction == 3) {
            if(Math.abs(dx) >= fuel) {
                fuel = dx < 0 ? -fuel : fuel;
                x -= fuel;
                fuel = 0;
            }
            else {
                x -= dx;
                fuel -= Math.abs(fuel);
            }
        }
        if(direction == 4) {
            if(Math.abs(dx) >= fuel) {
                fuel = dx < 0 ? -fuel : fuel;
                y -= fuel;
                fuel = 0;
            }
            else {
                y -= dx;
                fuel -= Math.abs(fuel);
            }
        }
    }

    public void goBackward(int dx) {
            goForward(-dx);
//        if(direction == 1) {
//            x -= dx;
//        }
//        if(direction == 2) {
//            y -= dx;
//        }
//        if(direction == 3) {
//            x += dx;
//        }
//        if(direction == 4) {
//            y += dx;
//        }
    }

    public void printPosition() {
        System.out.printf("The Tank %s-%d is at %d, %d now.\n", name, numberTank, x, y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
