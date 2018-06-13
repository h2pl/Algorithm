package 过去笔试记录.Basic.datastructure;

/**
 * Created by 周杰伦 on 2017/3/10.
 */
public class except {
    public static void fun()throws Exception{


    }
    public static void exe()throws Exception{
        int i=1/0;
        fun();
    }
    public static void main(String args[])throws Exception{

        try {
            exe();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("sadas");
        }
    }

}
