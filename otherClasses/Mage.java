public class Fighter extends FantasyCharacter
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
}