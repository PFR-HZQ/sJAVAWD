public interface buycoffee {
    void Buycoffee();
}
class zhangyu implements buycoffee{

    @Override
    public void Buycoffee() {
        System.out.println("张煜给张涛姐姐买了一杯卡布奇洛" );
    }
}
