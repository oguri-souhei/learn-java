class Main {
    public static void main(String[] args) {
      Bicycle b = new ACMEBicycle();
      
      b.changeCadence(100);
      b.changeGear(2);
      b.speedUp(30000);
      
      b.printStates();
    }
  }
  