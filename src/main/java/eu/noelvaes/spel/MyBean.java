package eu.noelvaes.spel;

import java.io.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component("myBean")
public class MyBean {
   private String myValue;
   private int intValue;
   private double doubleValue;
   private boolean booleanValue;
   private Object objectValue;
   private Date date;
   private OtherBean other;
   private String name;
   private int max;
   private int rounded;
   private File file;
   private String result;
   private List<String> list;
   private int[] array;
   private String mapValue;
   private String homeDir;
   private String tomcatDir;

   @Value("#{'hello'}")
   public void setMyValue(String myValue) {
      this.myValue = myValue;
   }

   @Value("#{5}")
   public void setIntValue(int intValue) {
      this.intValue = intValue;
   }

   @Value("#{7.36}")
   public void setDoubleValue(double doubleValue) {
      this.doubleValue = doubleValue;
   }

   @Value("#{true}")
   public void setBooleanValue(boolean booleanValue) {
      this.booleanValue = booleanValue;
   }

   @Value("#{null}")
   public void setObjectValue(Object objectValue) {
      this.objectValue = objectValue;
   }

   @Value("#{'02/05/2011 14:36'}")
   public void setDate(Date date) {
      this.date = date;
   }

   @Value("#{otherBean}")
   public void setOther(OtherBean other) {
      this.other = other;
   }

   @Value("#{otherBean.name?:'Elvis'}")
   public void setName(String name) {
      this.name = name;
   }

   @Value("#{T(Integer).MAX_VALUE}")
   public void setMax(int max) {
      this.max = max;
   }

   @Value("#{T(Math).round(5.6)}")
   public void setRounded(int rounded) {
      this.rounded = rounded;
   }

   @Value("#{new java.io.File('MyFile.txt')}")
   public void setFile(File file) {
      this.file = file;
   }

   @Value("#{otherBean.method()}")
   public void setResult(String result) {
      this.result = result;
   }

   @Value("#{{'Hello','World'}}")
   public void setList(List<String> list) {
      this.list = list;
   }

   @Value("#{new int[] {1,2,3}}")
   public void setArray(int[] array) {
      this.array = array;
   }

   @Value("#{otherBean.map['key1']}")
   public void setMapValue(String mapValue) {
      this.mapValue = mapValue;
      System.getenv("");
   }

   @Value("#{systemProperties['user.home']}")
   public void setHomeDir(String homeDir) {
      this.homeDir = homeDir;
   }

   @Value("#{systemEnvironment['TOMCAT_HOME']}")
   public void setTomcatDir(String tomcatDir) {
      this.tomcatDir = tomcatDir;
   }

   @Override
   public String toString() {
      return String
            .format(
                  "MyBean [myValue=%s, intValue=%s, doubleValue=%s, booleanValue=%s, objectValue=%s, date=%s, other=%s, name=%s, max=%s, rounded=%s, file=%s, result=%s, list=%s, array=%s, mapValue=%s, homeDir=%s, tomcatDir=%s]",
                  myValue, intValue, doubleValue, booleanValue, objectValue,
                  date, other, name, max, rounded, file, result, list,
                  Arrays.toString(array), mapValue, homeDir, tomcatDir);
   }
   
   
   
}
