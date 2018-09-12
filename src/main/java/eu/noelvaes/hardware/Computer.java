package eu.noelvaes.hardware;

import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("computer")
public class Computer {
   @Value("#{T(java.time.LocalDate).now()}")
   private LocalDate purchaseDate;
   
   @Value("#{new java.net.URL('https://www.noelvaes.eu')}")
   private URL vendorUrl;
   
   @Value("#{250 * 1.21}")
   private double price;
   
   @Value("#{T(Runtime).getRuntime().totalMemory()}")
   private int memory;
   
   @Value("#{T(Runtime).getRuntime().availableProcessors()}")
   private int processors;
   
   @Value("#{systemEnvironment['PROCESSOR_ARCHITECTURE']}")
   private String cpu;
   
   @Value("#{systemProperties['user.name']}")
   private String ownerName;
   
   @Value("#{systemProperties['os.name']}")
   private String os;
   
   @Value("#{{'bluetooth','smartcard reader','solid state disk','fingerprint reader'}}")
   private List<String> features;

   public int getProcessors() {
      return processors;
   }

   public void setProcessors(int processors) {
      this.processors = processors;
   }

   public LocalDate getPurchaseDate() {
      return purchaseDate;
   }

   public void setPurchaseDate(LocalDate purchaseDate) {
      this.purchaseDate = purchaseDate;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public int getMemory() {
      return memory;
   }

   public void setMemory(int memory) {
      this.memory = memory;
   }

   public String getCpu() {
      return cpu;
   }

   public void setCpu(String cpu) {
      this.cpu = cpu;
   }

   public String getOwnerName() {
      return ownerName;
   }

   public void setOwnerName(String ownerName) {
      this.ownerName = ownerName;
   }

   public String getOs() {
      return os;
   }

   public void setOs(String os) {
      this.os = os;
   }

   public List<String> getFeatures() {
      return features;
   }

   public void setFeatures(List<String> features) {
      this.features = features;
   }

   public URL getVendorUrl() {
      return vendorUrl;
   }

   public void setVendorUrl(URL vendorUrl) {
      this.vendorUrl = vendorUrl;
   }

   @Override
   public String toString() {
      return String.format(
         "Computer [purchaseDate=%s, vendorUrl=%s, price=%s, memory=%s, processors=%s, cpu=%s, ownerName=%s, os=%s, features=%s]",
         purchaseDate, vendorUrl, price, memory, processors, cpu,
         ownerName, os, features);
   }


}
