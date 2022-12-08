class Coffee implements Drink {
    int price;
    Size size;


    public int getPrice(){
        return price;
    }
    
    public Size getSize() {
        return size;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
    public void setSize(Size size) {
        this.size = size;
    }
    
    public void print() {
        System.out.println("price: " + this.price +" size: " + this.size);
    }
}