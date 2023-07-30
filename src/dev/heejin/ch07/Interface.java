package dev.heejin.ch07;

public class Interface {

    interface Movable{
        void move(int x, int y);
    }

    interface Attackable{
        void attack(Unit u);
    }
    interface Fightable extends Movable, Attackable{}

    abstract class Unit {
        String name;
        int x, y;
        abstract void move(int x, int y);
        void stop() {};

        public String getName() {
            return "'" + name + "'";
        }

        public String getLocation(){
            return "[" + x + " , " + y+ "]";
        }
    }

    class Fighter extends Unit implements Fightable {

        @Override
        public void move(int x, int y) {
            this.x = x;
            this.y = y;
            System.out.println("Fighter" + this.getName() + " move to " + this.getLocation());
        }

        @Override
        public void attack(Unit u) {
            System.out.println(this.getName() + " attack! " + u.getName());
        }

    }
    public void main() {

        Fighter fighter = new Fighter();
        fighter.name = "fighter1";

        Fighter fighter2 = new Fighter();
        fighter2.name = "fighter2";

        fighter.move(1, 2);
        fighter.attack(fighter2);
    }
}
