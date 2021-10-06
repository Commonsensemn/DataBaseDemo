package Tools;

import java.util.Random;

/**
  @author: Common sense
 * @CreationTime: 2021/10/1 17:33 星期五
 * @ClassName: ToolsDay1
 * @ClassDescription: 工具类
 */
public class ToolsDay1 {

    /**
     * 随机数生成器（随机的范围位1到4984651）
     * @author: Common sense
     * @Date: 2021/10/6 21:06
     * @描述: 随机数生成器，随机的范围位1到4984651，次方法可以更改
     * @return int
     **/
    public static int randomNb(){
        int max=4984651;
        int min=1;
        Random random = new Random();
        int s = random.nextInt(max)%(max-min+1) + min;
        return s;
    }
}
