package 过去笔试记录.In2017.exam;

import org.junit.Test;

/**
 * Created by 周杰伦 on 2017/3/15.
 */
public class longStr {
    int findlongstr(char []str){
        int max=1;
        int j;

        for(int i=0;i<str.length;i++){
            int len=1;
            j=i+1;
            while(j<str.length && str[j]!=str[j-1]  ){len++;j++;}
            if(len>max)max=len;
            i=j-1;

        }
        return max;
    }
    @Test
    public void test(){
        char []str={'a','b','c'};
        System.out.println(findlongstr(str));
        char []str1={'a','b','c','c'};
        System.out.println(findlongstr(str1));
        char []str2={'a','b','c','c','d'};
        System.out.println(findlongstr(str2));
        char []str3={'a','b','c','c','d','e'};
        System.out.println(findlongstr(str3));
        char []str4={'a','b','c','c','d','e','f'};
        System.out.println(findlongstr(str4));
    }
}
