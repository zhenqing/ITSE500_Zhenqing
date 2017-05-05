package edu.oit.lesson4;

public class Puppy {
    public static String type = "animal";
    private String name;
    
    private void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public Puppy(String str) {
        this.name = str;
    }
    
    public Puppy() {
        
    }
    
    public void say() {
        int num = 10;
        for(int i=0;i<3;i++){
            System.out.println("wang wang");
        }
        System.out.println(name);
    }
    
    public void say(String something) {
        int num = 10;
        for(int i=0;i<3;i++){
            System.out.println(something);
        }
        System.out.println(name);
    }
    
    public static int add(int i, int j){
        return i +j;
    }

    

}
