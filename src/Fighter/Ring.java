package Fighter;

public class Ring {
    public static void main(String[] args) {
       Fighter f1 = new Fighter("Jack",10,103,80,0);
       Fighter f2 = new Fighter("Land",20,83,75,0);

       Match match = new Match(f1,f2,75,85);
       match.run();
    }
}