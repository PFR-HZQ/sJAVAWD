public class zhangyu implements Buycoffeewithmoney,buycolaandhamburger{

    @Override
    public Coffee buycoffee( int money ) {
        return new Coffee( "张煜花了"+money+"块买的摩卡" );
    }



    @Override
    public void buycola() {
        System.out.println("张煜买了一杯可乐" );
    }

    @Override
    public void buyhamburger() {
        System.out.println("张煜买了一个汉堡" );
    }
}
