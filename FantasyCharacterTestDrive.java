public class FantasyCharacterTestDrive
{
    public static void main(String[] args)
    {
	FantasyCharacter f = new Fighter();
	Fighter g = new Fighter(); 
	f.setHeight(50); 
	f.Talk("Hello"); 
	f.getHeight();
        f.Fight(); 
	System.out.println(g.FightPower()); 
    }
}