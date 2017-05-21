package club.veev.hello.nutz;

import club.veev.hello.server.Log;
import org.nutz.dao.Dao;
import org.nutz.dao.util.Daos;
import org.nutz.ioc.Ioc;
import org.nutz.mvc.NutConfig;
import org.nutz.mvc.Setup;

/**
 * Created by Veev on 2017/3/21
 */
public class MainSetup implements Setup {

    @Override
    public void init(NutConfig nc) {
        Ioc ioc = nc.getIoc();
        Dao dao = ioc.get(Dao.class);
        Daos.createTablesInPackage(dao, "club.veev.hello.nutz.bean", false);

        Log.i("程序起来啦");
    }

    @Override
    public void destroy(NutConfig nc) {
        // web app销毁之前执行的逻辑
        // 这个时候依然可以从nc取出ioc, 然后取出需要的ioc 对象进行操作
    }
}
