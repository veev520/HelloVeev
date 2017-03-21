package club.veev.hello.nutz.module;

import org.nutz.lang.util.NutMap;

/**
 * Created by Veev on 2017/3/21
 */
public class ErrorModule {
    // 这里采用静态变量， 不用枚举， 提高性能
    public static final int FormatError = 201;
    public static final int OverflowError = 202;

    public static NutMap error(int type, NutMap nutMap) {
        String msg = "";
        switch (type) {
            case FormatError:
                msg = "Invalid format"; // 格式错误
                break;
            case OverflowError:
                msg = "Parameter out of range"; // 超出范围
                break;
        }

        return getError(type, msg, nutMap);
    }

    private static NutMap getError (int code, String msg, NutMap nutMap) {
        return nutMap.setv("ok", false)
                .setv("code", code)
                .setv("msg", msg);
    }
}
