package club.veev.hello.nutz.module;

import club.veev.hello.nutz.bean.KV;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;

import java.util.Date;

/**
 * Created by Veev on 2017/5/21
 */
@IocBean
@At("/kv")
@Ok("json")
@Fail("http:500")
public class KVModule extends BaseModule {

    @At
    public String get(@Param("key")String key) {
        KV kv = dao.fetch(KV.class, key);
        return kv == null ? null : kv.getValue();
    }

    @At
    public String put(@Param("key")String key, @Param("value")String value) {
        KV kv = dao.fetch(KV.class, key);
        if (kv == null) {
            kv = new KV(key, value);
            kv.setKey(key);
            kv.setUpdatedAt(new Date());
            kv.setCreatedAt(new Date());
            dao.insert(kv);
        } else {
            kv.setValue(value);
            kv.setUpdatedAt(new Date());
            dao.update(kv);
        }
        return kv.getValue();
    }

    @At
    public int remove(@Param("key")String key) {
        return dao.delete(KV.class, key);
    }
}
