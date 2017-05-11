package edu.oit.lesson9;

public enum Country {
    US("US","com"),UK("UK", "co.uk"),DE("DE", "de"),FR("FR", "fr"),ES("ES", "es"),IT("IT","it"),CA("CA", "ca"),JP("JP","co.jp"),MX("MX","mx"),IN("IN","in");
    public static final Country[] EURO = {UK,DE,FR,ES,IT};
    private String suffix;
    private String code;
    private Country(String code, String suffix){
        this.suffix = suffix;
        this.code = code;
    }
     
}
