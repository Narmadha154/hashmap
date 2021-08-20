
package hashmaptask;
import java.util.*;
public class HashMapTaskRunner{
   public static String[] getString(int size){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Strings:");
     String [] stringArray=new String[size];
      for(int i=0;i<size;i++){
            stringArray[i]=sc.next();
      }
    return stringArray;
   }
   
   public static int[] getInteger(int size){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the integers:");
     int [] integerArray=new int[size];
      for(int i=0;i<size;i++){
            integerArray[i]=sc.nextInt();
      }
    return integerArray;
   }
    public static HashMap<String,Student> createCustomMap(){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no.of data:");
      int size=sc.nextInt();
      System.out.println("Enter the rollNo:");
      int [] rollNo=new int[size];
       for(int i=0;i<size;i++){
          rollNo[i]=sc.nextInt();
       }
      System.out.println("Enter the name:");
      String [] name=new String[size];
      for(int i=0;i<size;i++){
          name[i]=sc.next();
      }
      System.out.println("Enter the marks:");
      int [] marks=new int[size];
      for(int i=0;i<size;i++){
          marks[i]=sc.nextInt();
      }
       System.out.println("Enter the number of key value pair:");
       int keyValue=sc.nextInt();
       String [] keyArray=getString(keyValue);
       HashMap<String,Student> customMap=new HashMap<>();
       for(int i=0;i<keyArray.length;i++){
          customMap.put(keyArray[i],new Student(rollNo[i],name[i],marks[i]));
       }
      return customMap;
    }
   public static void main(String [] args){
    System.out.println("Enter the program number:");
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    switch(number){
       case 1:
          int size=HashMapTask.findSize();
          System.out.println("Size of the Hashmap:"+size);
          break;
       case 2:
          System.out.println("Enter the number of key value pair:");
          int keyValue=sc.nextInt();
          String [] keyArray=getString(keyValue);
          String [] valueArray=getString(keyValue);
          HashMap<String,String> stringMap=HashMapTask.findStringMapSize(keyArray,valueArray);
          System.out.println("Hashmap elements:");
          for(Map.Entry str : stringMap.entrySet()){    
            System.out.println(str.getKey()+" "+str.getValue());    
          }    
          int mapSize1=stringMap.size();
          System.out.println("Size of the String Hashmap:"+mapSize1);
          break;
      case 3:
          System.out.println("Enter the number of key value pair:");
          int keyValue1=sc.nextInt();
          int [] keyIntArray=getInteger(keyValue1);
          int [] valueIntArray=getInteger(keyValue1);
          HashMap<Integer,Integer> integerMap=HashMapTask.findIntegerMapSize(keyIntArray,valueIntArray);
          System.out.println("Hashmap elements:");
          for(Map.Entry intMap : integerMap.entrySet()){    
           System.out.println(intMap.getKey()+" "+intMap.getValue());    
          }   
          int mapSize2=integerMap.size();
          System.out.println("Size of the Integer Hashmap:"+mapSize2);
          break;
      case 4:
          System.out.println("Enter the number of key value pair:");
          int keyValue2=sc.nextInt();
          String [] keyStrIntArray=getString(keyValue2);
          int [] valueStrIntArray=getInteger(keyValue2);
          HashMap<String,Integer> strIntMap=HashMapTask.findStringIntegerMapSize(keyStrIntArray,valueStrIntArray);
          int mapSize=strIntMap.size();
          System.out.println("Hashmap elements:");
           for(Map.Entry map: strIntMap.entrySet()){    
                System.out.println(map.getKey()+" "+map.getValue());    
           }  
          System.out.println("Size of the String Integer Hashmap:"+mapSize);
          break;
     case 5:
          HashMap<String,Student> customHashMap=createCustomMap();
          System.out.println("Hashmap elements:");
         for(Map.Entry str : customHashMap.entrySet()){    
            System.out.println(str.getKey()+" "+str.getValue());    
          }    
          int customHashMapSize=customHashMap.size();
          System.out.println("Size of the String Hashmap:"+customHashMapSize);
          break;
     case 6:
          System.out.println("Enter the number of key value pair:");
          int keyValue3=sc.nextInt();
          String [] keyStrArray=getString(keyValue3);
          String [] valueStrArray=getString(keyValue3);
          HashMap<String,String> strMap=HashMapTask.findStringMapSize(keyStrArray,valueStrArray);
          System.out.println("Hashmap elements:");
          for(Map.Entry str : strMap.entrySet()){    
            System.out.println(str.getKey()+" "+str.getValue());    
          }    
          int strMapSize=strMap.size();
          System.out.println("Size of the String Hashmap:"+strMapSize);
          break;
    case 7:
           System.out.println("Enter the number of key value pair:");
           int keyValue4=sc.nextInt();
           int [] keyIntArr=getInteger(keyValue4);
           int [] valueIntArr=getInteger(keyValue4);
           HashMap<Integer,Integer> nullMap=HashMapTask.addNull(keyIntArr,valueIntArr);
           System.out.println("HashMap elements:"+nullMap);
           int nullMapSize=nullMap.size();
           System.out.println("HashMap size:"+nullMapSize);
           break;
     case 8:
           System.out.println("Enter the number of key value pair:");
           int keyValue5=sc.nextInt();
           int [] keyStrArr=getInteger(keyValue5);
           int [] valueStrArr=getInteger(keyValue5);
           System.out.println("Enter the key to be checked:");
           int key=sc.nextInt();
           boolean value=HashMapTask.checkKey(keyStrArr,valueStrArr,key);
           System.out.println("Given key present in the hashmap:"+value);
           break;
     case 9:
           System.out.println("Enter the number of key value pair:");
           int keyVal=sc.nextInt();
           String [] keyStArray=getString(keyVal);
           String [] valueStArray=getString(keyVal);
           System.out.println("Enter the value to be checked:");
           String strValue=sc.next();
           boolean booleanValue=HashMapTask.checkValue(keyStArray,valueStArray,strValue);
           System.out.println("Given value is present in the hashmap:"+booleanValue);
           break;
     case 10:
          System.out.println("Enter the number of key value pair:");
          int keyValuePair=sc.nextInt();
          String [] keyStArr=getString(keyValuePair);
          String [] valueStArr=getString(keyValuePair);
          String [] newValue=getString(keyValuePair);
          HashMap<String,String> changedHash=HashMapTask.changeValues(keyStArr,valueStArr,newValue);
          System.out.println("Hashmap elements:");
          for(Map.Entry mapChange: changedHash.entrySet()){    
                System.out.println(mapChange.getKey()+" "+mapChange.getValue());    
          } 
          break;
     case 11:
         System.out.println("Enter the number of key value pair:");
         int keyValPair=sc.nextInt();
         String [] keyStrIntArr=getString(keyValPair);
         int [] valueStrIntArr=getInteger(keyValPair);
         System.out.println("Enter the key for which you want the value:");
         String existingKey=sc.next();
         int valueForKey=HashMapTask.getValue(keyStrIntArr,valueStrIntArr,existingKey);
         System.out.println("Value for the given key is:"+valueForKey);
         break;
    case 12:
         System.out.println("Enter the number of key value pair:");
         int keyValPair1=sc.nextInt();
         String [] keyStIntArray=getString(keyValPair1);
         int [] valueStIntArray=getInteger(keyValPair1);
         System.out.println("Enter the non existing key for which you want the value:");
         String nonExistingKey=sc.next();
         int valueKey=HashMapTask.getValue(keyStIntArray,valueStIntArray,nonExistingKey);
         System.out.println("Value for the given key is:"+valueKey);
         break;
     case 13:
         System.out.println("Enter the number of key value pair:");
         int kyValue=sc.nextInt();
         String [] keyArr=getString(kyValue);
         String [] valueArr=getString(kyValue);
         System.out.println("Enter the non existing key for which you want the value:");
         String nonExistKey=sc.next();
         String valueOfKey=HashMapTask.getValueForKey(keyArr,valueArr,nonExistKey);
         System.out.println("Value for the given key is:"+valueOfKey);
         break;
     case 14:
         System.out.println("Enter the number of key value pair:");
         int kyVal=sc.nextInt();
         int [] keyIntArr1=getInteger(kyVal);
         int [] valueIntArr1=getInteger(kyVal);
         System.out.println("Enter the key which you want to remove:");
         int removeKey=sc.nextInt();
         HashMap<Integer,Integer> changedMap=HashMapTask.removeKey(keyIntArr1,valueIntArr1,removeKey);
         System.out.println("Hashmap elements after changes:");
           for(Map.Entry map: changedMap.entrySet()){    
                System.out.println(map.getKey()+" "+map.getValue());    
           } 
         int changedSize=changedMap.size();
         System.out.println("Size of the HashMap after change:"+changedSize);
         break;
     case 15:
         System.out.println("Enter the number of key value pair:");
         int kValue=sc.nextInt();
         String [] keyArr1=getString(kValue);
         String [] valueArr1=getString(kValue);
         System.out.println("Enter the key which you want to remove:");
         String removedKey=sc.next();
         System.out.println("Enter the value for which you want to check matching:");
         String matchValue=sc.next();
         HashMap<String,String> changedHashMap=HashMapTask.removeMatchedValue(keyArr1,valueArr1,removedKey,matchValue);
         System.out.println("Hashmap elements after changes:");
           for(Map.Entry map: changedHashMap.entrySet()){    
                System.out.println(map.getKey()+" "+map.getValue());    
           }  
         int changedHashSize=changedHashMap.size();
         System.out.println("Size of the HashMap after changes:"+changedHashSize);
         break;
     case 16:
         System.out.println("Enter the number of key value pair:");
         int kVal=sc.nextInt();
         String [] keySIArray=getString(kVal);
         int [] valueSIArray=getInteger(kVal);
         System.out.println("Enter the key which you want to replace:");
         String replaceKey=sc.next();
         System.out.println("Enter the value to be replaced:");
         int replaceValue=sc.nextInt();
         HashMap<String,Integer> replacedHashMap=HashMapTask.replaceValue(keySIArray,valueSIArray,replaceKey,replaceValue);
         System.out.println("Hashmap elements after changes:");
          for(Map.Entry hashMap: replacedHashMap.entrySet()){    
                System.out.println(hashMap.getKey()+" "+hashMap.getValue());    
           }  
         int replacedHashSize=replacedHashMap.size();
         System.out.println("Size of the HashMap after changes:"+replacedHashSize);
         break;
      case 17:
         System.out.println("Enter the number of key value pair:");
         int kValPair=sc.nextInt();
         String [] keySIArr=getString(kValPair);
         int [] valueSIArr=getInteger(kValPair);
         System.out.println("Enter the key which you want to replace:");
         String replaceKey1=sc.next();
         System.out.println("Enter the value to be replaced:");
         int replaceValue1=sc.nextInt();
         System.out.println("Enter the value for which you want to check matching:");
         int matchValue1=sc.nextInt();
         HashMap<String,Integer> replacedHashMap1=HashMapTask.replaceMatchedValue(keySIArr,valueSIArr,replaceKey1,replaceValue1,matchValue1);
         System.out.println("Hashmap elements after changes:");
          for(Map.Entry hashMap: replacedHashMap1.entrySet()){    
                System.out.println(hashMap.getKey()+" "+hashMap.getValue());    
           }  
         int replacedHashSize1=replacedHashMap1.size();
         System.out.println("Size of the HashMap after changes:"+replacedHashSize1);
         break;
     case 18:
          System.out.println("Enter the number of key value pair:");
          int numOfKeyValue=sc.nextInt();
          String [] keySIArr1=getString(numOfKeyValue);
          int [] valueSIArr1=getInteger(numOfKeyValue);
          String [] keySIArr2=getString(numOfKeyValue);
          int [] valueSIArr2=getInteger(numOfKeyValue);
          System.out.println("Hashmap1 elements before changes:");
          HashMap<String,Integer> transferedHashMap=HashMapTask.transferKeysValues(keySIArr1,valueSIArr1,keySIArr2,valueSIArr2);
          System.out.println("Hashmap2 elements after transfers:");
          for(Map.Entry hashMap: transferedHashMap.entrySet()){    
                System.out.println(hashMap.getKey()+" "+hashMap.getValue());    
           }
           int transferedHashSize=transferedHashMap.size();
           System.out.println("Size of the HashMap2 after changes:"+transferedHashSize);
           break;
      case 19:
          System.out.println("Enter the number of key value pair:");
          int kvPair=sc.nextInt();
          String [] keySIntArr=getString(kvPair);
          int [] valueSIntArr=getInteger(kvPair);
          HashMap<String,Integer> map=HashMapTask.iterateHashMap(keySIntArr,valueSIntArr);
          System.out.println("Hashmap elements:");
          for(Map.Entry hashMap1: map.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
          }
         break;
      case 20:
          System.out.println("Enter the number of key value pair:");
          int kvPairNum=sc.nextInt();
          String [] keySIntArr1=getString(kvPairNum);
          int [] valueSIntArr1=getInteger(kvPairNum);
          HashMap<String,Integer> clearedHashMap=HashMapTask.removeAllEntries(keySIntArr1,valueSIntArr1);
          System.out.println("Hashmap elements after changes:"+clearedHashMap);
          int afterSize=clearedHashMap.size();
          System.out.println("Size of the HashMap after changes:"+afterSize);
          break;
     default:
         System.out.println("No program");
         break;
     }
  }
 }

