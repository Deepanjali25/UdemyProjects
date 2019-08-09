package Udemy;

class Movie {
    private String name;
    public Movie(String name) {
        this.name = name;
    }
    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}
class Jaws extends Movie {
    public Jaws() {
        super ("Udemy.Jaws");
    }
    public String plot() {
        return "A shark eats lot of people";
    }
}
class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}
class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}
class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}
class Forgetable extends  Movie {
    public Forgetable() {
        super("Udemy.Forgetable");
    }
    // No plot method
}
public class Main5 {
    public static void main(String[] args) {
        for (int i=1; i<11; i++) {
            Movie movie = randomMovie();
            System.out.println("Udemy.Movie # " + i + ": " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }
        //Udemy.Printer printer = new Udemy.Printer(50,false);
        //System.out.println("Initial page count = " + printer.getPagesPrinted());
        //int pagesPrinted = printer.printPages(4);
       // System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
       // pagesPrinted = printer.printPages(2);
        //System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

        //Udemy.Player player = new Udemy.Player("Anjali",50,"Sword");
        //System.out.println("Initial health is " + player.getHealth());
    }
    public static  Movie randomMovie() {
        int randomNUmber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNUmber);
        switch (randomNUmber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
