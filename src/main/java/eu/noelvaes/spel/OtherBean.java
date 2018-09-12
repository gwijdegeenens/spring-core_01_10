package eu.noelvaes.spel;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component("otherBean")
public class OtherBean {
   private String name;

   public String getName() {
      return name;
   }

   @Value("The other bean")
   public void setName(String name) {
      this.name = name;
   }

   public String method() {
      return "Result of method";
   }
   
   public Map<String,String> getMap() {
      Map<String,String> map = new HashMap<String,String>();
      map.put("key1", "value1");
      map.put("key2", "value2");
      return map;
   }
   
}
