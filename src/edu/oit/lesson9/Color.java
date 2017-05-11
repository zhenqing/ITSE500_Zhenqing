package edu.oit.lesson9;

public enum Color implements Paintable{
    RED(1),ORANGE(2),YELLOW(3),GREEN(4);
    private int value;
    Enum e;
    private Color(int value){
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    public static String getSomething(Color color) {
        switch(color){
        case RED:
            return "apple";
        case ORANGE:
            return "orange";
        case YELLOW:
            return "banana";
        default:
            return "grass";
        }
    }

    public String getSomething() {
        switch(this){
        case RED:
            return "apple";
        case ORANGE:
            return "orange";
        case YELLOW:
            return "banana";
        default:
            return "grass";
        }
    }
    @Override
    public void paint() {
        
    }
}
