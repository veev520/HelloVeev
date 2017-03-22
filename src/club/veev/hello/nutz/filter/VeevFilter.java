package club.veev.hello.nutz.filter;

import org.nutz.mvc.ActionContext;
import org.nutz.mvc.ActionFilter;
import org.nutz.mvc.View;

/**
 * Created by Veev on 2017/3/22
 */
public class VeevFilter implements ActionFilter {

    @Override
    public View match(ActionContext actionContext) {
        actionContext.getResponse().addHeader("Access-Control-Allow-Origin", "*");
        return null;
    }
}
