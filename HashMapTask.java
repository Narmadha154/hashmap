
package hashmaptask;
import java.util.*;
public class HashMapTask{
       public static int findSize(){
       HashMap map=new HashMap();
       int size=map.size();
       System.out.println("Hashmap elements:"+map);
       return size;
   }
   public static HashMap<String,String> findStringMapSize(String [] keyArray,String [] valueArray){
       HashMap<String,String> map=new HashMap<>();
       for(int i=0;i<keyArray.length;i++){
          map.put(keyArray[i],valueArray[i]);
       }
       return map;
   }
    public static HashMap<Integer,Integer> findIntegerMapSize(int [] keyArray,int [] valueArray){
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<keyArray.length;i++){
          map.put(keyArray[i],valueArray[i]);
       }
       return map;
   }
   public static HashMap<String,Integer> findStringIntegerMapSize(String [] keyArray,int [] valueArray){
       HashMap<String,Integer> map=new HashMap<>();
       for(int i=0;i<keyArray.length;i++){
          map.put(keyArray[i],valueArray[i]);
       }
       return map;
   }
   public static HashMap<String,String> addNullValue(String [] keyArray,String [] valueArray){
       HashMap<String,String> map=new HashMap<>();
       for(int i=0;i<keyArray.length;i++){
          map.put(keyArray[i],valueArray[i]);
       }
       return map;
    }
   public static HashMap<Integer,Integer> addNull(int [] keyArray,int [] valueArray){
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<keyArray.length;i++){
          map.put(keyArray[i],valueArray[i]);
       }
       return map;
   }
   public static boolean checkKey(int [] keyArray,int [] valueArray,int key){
     HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<keyArray.length;i++){
          map.put(keyArray[i],valueArray[i]);
       }
     boolean value= map.containsKey(key);
     return value;
   }
   public static boolean checkValue(String [] keyArray,String [] valueArray,String value){
     HashMap<String,String> map=new HashMap<>();
       for(int i=0;i<keyArray.length;i++){
          map.put(keyArray[i],valueArray[i]);
       }
     boolean checkValue= map.containsValue(value);
     return checkValue;
   }
   public static HashMap<String,String> changeValues(String [] keyArray,String [] valueArray,String [] newValue){
      HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<keyArray.length;i++){
          map.put(keyArray[i],valueArray[i]);
       }
    //  map.replaceAll((key,value)-> value + value);
       for(int i=0;i<newValue.length;i++){
          map.replace(keyArray[i],valueArray[i], newValue[i]);
       }
      return map;                      
   }
   public static int getValue(String [] keyArray,int [] valueArray,String key){
     HashMap<String,Integer> map=new HashMap<>();
      for(int i=0;i<keyArray.length;i++){
          map.put(keyArray[i],valueArray[i]);
       }
     int value=0;
      if(map.containsKey(key)){
           value=map.get(key);
      }
      else{
          System.out.println("Given key is not existing");
      }
      return value;
   } 
   public static String getValueForKey(String [] keyArray,String [] valueArray,String key){
     HashMap<String,String> map=new HashMap<>();
       for(int i=0;i<keyArray.length;i++){
          map.put(keyArray[i],valueArray[i]);
       }
     int size=map.size();
     System.out.println("Size of the HashMap before changes:"+size);
     String value=null;
      if(map.containsKey(key)){
           value=map.get(key);
      }
      else{
          System.out.println("Given key is not existing");
          value="zoho";
      }
      return value;
   } 
   public static HashMap<Integer,Integer> removeKey(int [] keyArray,int [] valueArray,int key){
     HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<keyArray.length;i++){
          map.put(keyArray[i],valueArray[i]);
       }
       System.out.println("Hashmap elements before changes:");
           for(Map.Entry map1: map.entrySet()){    
                System.out.println(map1.getKey()+" "+map1.getValue());    
           } 
     int size=map.size();
     System.out.println("Size of the HashMap before changes:"+size);
      if(map.containsKey(key)){
        map.remove(key);
      }
     else{
       System.out.println("Given key is not existing");
     }
     return map;
   }
   public static HashMap<String,String> removeMatchedValue(String [] keyArray,String [] valueArray,String key,String value){
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<keyArray.length;i++){
          map.put(keyArray[i],valueArray[i]);
        }
        System.out.println("Hashmap elements before changes:");
           for(Map.Entry map2: map.entrySet()){    
                System.out.println(map2.getKey()+" "+map2.getValue());    
           } 
        int size=map.size();
        System.out.println("Size of the HashMap before changes:"+size);
       if(map.containsKey(key)){
            if(value.equals(map.get(key))){
                map.remove(key);
            }
            else{
               System.out.println("Given value not matched with key value");
            }
       }
       else{
        System.out.println("Given key is not existing");   
       }
    return map;
   }
   public static HashMap<String,Integer> replaceValue(String [] keyArray,int [] valueArray,String key,int replaceValue){
         HashMap<String,Integer> map=new HashMap<>();
         for(int i=0;i<keyArray.length;i++){
           map.put(keyArray[i],valueArray[i]);
         }
         System.out.println("Hashmap elements before changes:");
          for(Map.Entry hashMap1: map.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
         int size=map.size();
         System.out.println("Size of the HashMap before changes:"+size);
         if(map.containsKey(key)){
              map.replace(key,replaceValue);
          }
         else{
             System.out.println("Given key is not existing");   
       }
    return map;
   } 
    public static HashMap<String,Integer> replaceMatchedValue(String [] keyArray,int [] valueArray,String key,int replaceValue,int matchValue){
        HashMap<String,Integer> map=new HashMap<>();
           
         for(int i=0;i<keyArray.length;i++){
            map.put(keyArray[i],valueArray[i]);
         }
          System.out.println("Hashmap elements before changes:");
          for(Map.Entry hashMap1: map.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
         int size=map.size();
         System.out.println("Size of the HashMap before changes:"+size);
         if(map.containsKey(key)){
             if(matchValue==map.get(key)){
                 map.replace(key,replaceValue);
             }
             else{
                 System.out.println("Given value not matched with key value");
             }
          }
         else{
           System.out.println("Given key is not existing");   
       }
    return map;
   } 
    public static HashMap<String,Integer> transferKeysValues(String [] keyArray1,int [] valueArray1,String [] keyArray2,int [] valueArray2){
        HashMap<String,Integer> firstMap=new HashMap<>();
         for(int i=0;i<keyArray1.length;i++){
              firstMap.put(keyArray1[i],valueArray1[i]);
          }
         HashMap<String,Integer> secondMap=new HashMap<>();
           for(int i=0;i<keyArray2.length;i++){
                secondMap.put(keyArray2[i],valueArray2[i]);
          }
          System.out.println("Hashmap1 elements before changes:");
          for(Map.Entry hashMap1: firstMap.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
           int size1=firstMap.size();
           System.out.println("Size of the HashMap1 before changes:"+size1);
           System.out.println("Hashmap2 elements before changes:");
           for(Map.Entry hashMap1: secondMap.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
           int size2=secondMap.size();
          System.out.println("Size of the HashMap2 before changes:"+size2);
       secondMap.putAll(firstMap);
       System.out.println("Hashmap1 elements after changes:");
          for(Map.Entry hashMap: firstMap.entrySet()){    
                System.out.println(hashMap.getKey()+" "+hashMap.getValue());    
           }
           int size=firstMap.size();
          System.out.println("Size of the HashMap1 after changes:"+size);
       return secondMap;
  }  
  public static HashMap<String,Integer> iterateHashMap(String [] keyArray,int [] valueArray){
         HashMap<String,Integer> map=new HashMap<>();
         for(int i=0;i<keyArray.length;i++){
               map.put(keyArray[i],valueArray[i]);
         }
         return map;
  }
  public static HashMap<String,Integer> removeAllEntries(String [] keyArray,int [] valueArray){
         HashMap<String,Integer> map=new HashMap<>();
          for(int i=0;i<keyArray.length;i++){
               map.put(keyArray[i],valueArray[i]);
        }
         System.out.println("Hashmap elements before changes:");
          for(Map.Entry hashMap1: map.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
        int size=map.size();
        System.out.println("Size of the HashMap before changes:"+size);
        map.clear(); 
        return map;
   }        
 }
  class Student{
       int rollNo;
       String name;
       int marks;
       Student(int rollNo,String name,int marks){
          this.rollNo=rollNo;
          this.name=name;
          this.marks=marks;
      }
      public String toString(){
           return "RollNo: "+rollNo+" "+"Name: "+name+" "+"Marks: "+marks;
      }
   }
 
 
 
 
 
 
