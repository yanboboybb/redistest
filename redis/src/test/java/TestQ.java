import com.example.redis.dao.RedisUtils;
import com.google.gson.Gson;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import java.util.Date;

/**
 * @Description:
 * @ClassName: TestQ
 * @Author: yanbobo
 * @CreateDate: 2019/8/30 10:04
 */
public class TestQ {

    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void test1() {
        //Object o = RedisUtils.hmGet("zzh:course", "course_id:589");
       /* Object o = RedisUtils.hmGet("zzhedu:product", "product_id:14");

        System.out.println(new Gson().toJson(o));*/

       Date date = new Date("May 29, 2018 11:39:36 AM");
       System.out.println(date.toString());
    }

}
