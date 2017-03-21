package club.veev.hello.nutz;

import org.nutz.mvc.annotation.IocBy;
import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.annotation.SetupBy;
import org.nutz.mvc.ioc.provider.ComboIocProvider;

/**
 * Created by Veev on 2017/3/21
 */
@SetupBy(value=MainSetup.class)
@IocBy(type=ComboIocProvider.class,
        args={"*js", "club/veev/hello/conf/ioc/",
                "*anno", "club.veev.hello",
                "*tx"})
@Modules(scanPackage=true)
public class MainModule {
}
