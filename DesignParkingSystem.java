class ParkingSystem {
    private int small;
    private int big;
    private int medium;

    public ParkingSystem(int big, int medium, int small) {
        this.small=small;
        this.big=big;
        this.medium=medium;
    }

    public boolean addCar(int carType) {
        if(carType==3){
            small--;
            return small>=0;
        }
        else if(carType==2){
            medium--;
            return medium>=0;
        }
        else{
            big--;
            return big>=0;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */