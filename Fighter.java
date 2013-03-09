public class Fighter extends FantasyCharacter implements Combat
{
    public int getHeight()
    {
	System.out.println("Height is " + height );
	return height; 
    }

    public void setHeight(int newHeight)
    {
	height = newHeight; 
    }

    public void Talk(String sentence)
    {
	System.out.println(sentence); 
    }
    
    public String ReturnType() 
    {
	return type; 
    }

    public int FightPower()
    {
	return 5;
    }

    public void Fight()
    {
	System.out.println("Fighting"); 
    }
}