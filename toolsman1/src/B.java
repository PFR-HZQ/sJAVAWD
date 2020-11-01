public class B {
    public static void main( String[] args ) {
        System.out.println("场景B，张涛学姐给张煜钱，张煜给张涛带回咖啡 ");
        taotaosister taotaosister =new taotaosister();
        zhangyu zhangyu = new zhangyu();
        taotaosister.letsomeonebuycoffee( zhangyu,12 );
        zhangyu.buycola();
        zhangyu.buyhamburger();
    }

}
