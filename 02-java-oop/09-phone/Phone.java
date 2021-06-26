public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
  
    public String getRingTone() {
      return this.ringTone;
    }
  
    public int getBatteryPercentage() {
      return this.batteryPercentage;
    }
  
    public String getCarrier() {
      return this.carrier;
    }
  
    public String getVersionNumber() {
      return this.versionNumber;
    }
  
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
      this.versionNumber = versionNumber;
      this.batteryPercentage = batteryPercentage;
      this.carrier = carrier;
      this.ringTone = ringTone;
    }
  
    public abstract void displayInfo();
  
}
