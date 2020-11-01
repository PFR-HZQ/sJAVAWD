import java.util.Scanner;

public class total {
    public static void main( String[] args ) {
        character mainperson = new character();
        character boss = new character();
        Scanner in = new Scanner( System.in );
        System.out.println("请输入主角名称：" );
        String name = in.nextLine( );
        System.out.println("请输入主角生命值：" );
        int healthpoint = in.nextInt();
        System.out.println("请输入主角攻击力：" );
        int atk = in.nextInt( );
        System.out.println("请输入主角防御力：");
        int dfp = in.nextInt();
        mainperson.setName( name );
        mainperson.setHealthpoint( healthpoint );
        mainperson.setAtk( atk );
        mainperson.setDfp( dfp );
        System.out.println("当前怪物：" );//输入怪物模板
        boss.setName( "Scop" );
        boss.setHealthpoint( 1000);
        boss.setAtk( 150);
        boss.setDfp( 20);
        System.out.println( "怪物名"+boss.getName());//输出怪物
        System.out.println("生命值"+boss.getHealthpoint() );
        System.out.println("攻击力"+ boss.getAtk() );
        System.out.println("防御力"+boss.getDfp() );
        int count=0;
        if(mainperson.getHealthpoint()< boss.getHealthpoint( )){
            System.out.println("主角意识到对方生命力属性高于自己，开起超级赛亚人模式，属性加倍" );
            mainperson.setHealthpoint( 10* mainperson.getHealthpoint( ) );//主角10倍生命值
            mainperson.setAtk(10* mainperson.getAtk( ));//主角10倍攻击力
            mainperson.setDfp(10* mainperson.getDfp( ));//主角10倍防御力
            System.out.println("超级赛亚人模式主角属性： " );
            System.out.println( "生命值:"+mainperson.getHealthpoint());//当前属性
            System.out.println( "攻击力:"+mainperson.getAtk());
            System.out.println( "防御力："+mainperson.getDfp());
        }
        while (mainperson.getHealthpoint()>0&&boss.getHealthpoint()>0){
            ++count;
            System.out.println("第 "+count+" 回合" );
            int a1= boss.getDfp( )>= mainperson.getAtk( )? 1 : mainperson.getAtk( )- boss.getDfp( );//主角伤害
            int a2= mainperson.getDfp( )>= boss.getAtk( )? 1 : boss.getAtk()- mainperson.getDfp( );//怪物伤害
            mainperson.setHealthpoint( mainperson.getHealthpoint( )-a2 );
            boss.setHealthpoint( boss.getHealthpoint( )-a1 );
            System.out.println("主角生命值："+ mainperson.getHealthpoint());
            System.out.println("怪物生命值："+boss.getHealthpoint() );
        }
        if(boss.getHealthpoint()<=0) System.out.println("第 "+count+" 回合结束主角胜" );
        else System.out.println("第 "+count+" 回合结束boss胜"  );


        



    }
}
