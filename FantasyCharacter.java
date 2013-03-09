abstract public class FantasyCharacter
{
    protected int age;
    protected int weight; 
    protected int height; 
    protected char gender;
    protected String type; 

    //    public FantasyCharacter(ing newAge, int newWeight, char newGender, String newType); 
    public abstract void Talk(String sentence); 
    public abstract String ReturnType();
    public abstract void setHeight(int newHeight);
    public abstract int getHeight();
    public abstract int RollDice(); 
}