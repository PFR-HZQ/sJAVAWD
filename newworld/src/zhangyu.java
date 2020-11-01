public class zhangyu implements CoffeeMaker {
    private Coffeecustmor taotaosister;
    public  void setCoffeecuster(Coffeecustmor coffeecuster){
        this.taotaosister=coffeecuster;
    }
    @Override
    public void makecoffee() {
        //为涛涛姐姐做好咖啡
        Coffee coffeeForSister = new Coffee("摩卡");
        System.out.println("张煜做好了"+coffeeForSister.name+"给涛涛学姐");
//通知涛涛姐姐她的咖啡做好了
//并且将咖啡递给涛涛姐姐
        taotaosister.getcoffee(coffeeForSister);
    }
}
