package club.veev.hello.nutz.module;

import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.Inject;

/**
 * Created by Veev on 2017/3/21
 */
public abstract class BaseModule {
    /** 注入与属性同名的一个ioc对象 */
    @Inject
    protected Dao dao;
}
