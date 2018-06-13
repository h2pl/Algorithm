package 常用算法;

/**
 * Created by 周杰伦 on 2018/6/6.
 */
public class N进制转换 {
    // 2-16进制表示的位数
    public String[] arr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "A", "B", "C", "D", "E", "F"};

    // 转换结果
    public String  conversion = "";

    /**
     * @param number 要转换的十进制数
     * @param system 转换的进制位
     */
    public void convert(int number, int system) {
        conversion = arr[number % system] + conversion;

        if(number/system==0) return;

        convert(number/system, system);
    }
}
