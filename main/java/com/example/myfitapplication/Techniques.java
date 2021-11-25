package com.example.myfitapplication;

public class Techniques {

    private String TechName;
    private String TechSpecs;
    private String TechInfo;
    private String Technique;
    private int Thumbnail;

   public Techniques(String name, String techSpecs, String techInfo, String technique, int thumbnail){

       TechName = name;
       TechSpecs = techSpecs;
       TechInfo = techInfo;
       Technique = technique;
       Thumbnail = thumbnail;

   }

   public String getTechName(){
       return TechName;
   }
   public String getTechSpecs(){
       return TechSpecs;
   }
   public String getTechInfo(){
       return TechInfo;
   }
   public String getTechnique(){
       return Technique;
   }
   public Integer getThumbnail(){
       return Thumbnail;
   }
}
