package In2017.exam3;
import java.util.*;

/**
 * Created by 周杰伦 on 2017/4/11.
 */
public class StockPrice {




/*请完成下面这个函数，实现题目要求的功能*/
/*当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ */
        /******************************开始写代码******************************/
        public static int maxProfit(int[] prices,int k) {

            //判断日期长度是否大于1
            if (prices.length <= 1) {
                return 0;
            }

            //构建三个状态数组
            int[] unhold = new int[prices.length];

            int[] hold = new int[prices.length];

            int[] cooldown = new int[prices.length];

            unhold[0] = 0;

            hold[0] = -prices[0];

            cooldown[0] = Integer.MIN_VALUE;

            for (int i = 1; i < prices.length; i++) {
                unhold[i] = Math.max(unhold[i - 1], cooldown[i - 1]);
                hold[i] = Math.max(hold[i - 1], unhold[i - 1] - prices[i]);
                cooldown[i] = hold[i - 1] + prices[i];
            }

            return Math.max(unhold[prices.length - 1],cooldown[prices.length - 1]);

        }
        /******************************结束写代码******************************/


        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int res;

            int _stockPrices_size = 0;
            _stockPrices_size = Integer.parseInt(in.nextLine().trim());
            int[] _stockPrices = new int[_stockPrices_size];
            int _stockPrices_item;
            for(int _stockPrices_i = 0; _stockPrices_i < _stockPrices_size; _stockPrices_i++) {
                _stockPrices_item = Integer.parseInt(in.nextLine().trim());
                _stockPrices[_stockPrices_i] = _stockPrices_item;
            }

            int _k;
            _k = Integer.parseInt(in.nextLine().trim());

            res = maxProfit(_stockPrices, _k);
            System.out.println(String.valueOf(res));

        }
    }


