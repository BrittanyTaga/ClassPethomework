public class Lol {
    
    //creating attributes
    private String nameOfChamp;
    private String classType;
    private boolean isMage;
    private String phrase;

    //creating constructor
    //this is empty one
    public Lol(){
        this.nameOfChamp = "Ezeral";
        this.classType = "Attack Damage Carry/Mid Lane";
        this.isMage = true;
        this.phrase = "LEGENDS NEVER DIE(screamo)";
    }

    public Lol(String nameOfChamp, String classType){
        this.nameOfChamp = nameOfChamp;
        this.classType = classType;
    }

    public Lol(String name, String classType, Boolean mage){
        this.nameOfChamp = name;
        this.classType = classType;
        this.isMage = mage;
    }

    //get methods that uses all 3 variables

    public String getName(){
       return this.nameOfChamp;
    }

    public String getType(){
        return this.classType;
    }

    public boolean getMage(){
        return this.isMage;
    }

    //method that returns a string
    public String getPhrase(){
        return this.phrase;
    }

    //set methods
    public void setName(String nameOfChamp){
        this.nameOfChamp = nameOfChamp;
    }
    public void setClassType(String classType){
        this.classType = classType;
    }
    public void setisMage(boolean isMage){
        this.isMage = isMage;
    }
}
