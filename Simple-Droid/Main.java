/*
Simple droid program that can hover. Loses batetry very quickly
Author: Dinu Wijetunga 
*/

class Main {
  
  int batteryLevel;

  public int Droid(){
    batteryLevel = 100;
    return batteryLevel;
  }

  public void activate(){
    System.out.println("Droid Online. How may I help you?");
    batteryLevel -= 5;
    System.out.println("Battery level: " + batteryLevel + "%");
  }

  public void chargeBattery(int hours){
    System.out.println("Battery Charging...");
    batteryLevel += hours;
    if (batteryLevel > 100){
      System.out.println("Battery level: 100%");
    }else{
      System.out.println("Battery level: " + batteryLevel + "%");
    }
  }

  public int checkBatteryLevel(){
    System.out.println("Battery level: " + batteryLevel + "%");
    return batteryLevel;
  }

  public void hover(int feet){
    if (feet > 2){
      System.out.println("Error! I cannot hover above 2ft.");
    }else{
      System.out.println("Hovering...");
      batteryLevel -= 20;
      System.out.println("Battery level: " + batteryLevel + "%");
    }
  }
  public static void main(String[] args) {
    Main Tilly = new Main();
    Tilly.Droid();
    Tilly.activate();
    Tilly.chargeBattery(5);
    Tilly.hover(3);

  }
}