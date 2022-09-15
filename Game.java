public class Game 
{
    public static void main(String[] args)
    {
        Player one = new Player("Uy");
        Weapon flaske = new Weapon("flaske", 10000000);
        System.out.println(one.getName() + " just entered the game!");
        System.out.println(one.getName() + " fant en " + flaske.getType() + " som gjør " + flaske.getDamage() + " skade");
    }
}