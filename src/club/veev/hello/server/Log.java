package club.veev.hello.server;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Veev on 2017/3/21
 */
public class Log {

    private static final String TAG = "Log --->";
    private static boolean isShowTime = true;

    public static void setShowTime(boolean bool) {
        isShowTime = bool;
    }

    /**
     ********************************** info ************************************
     */
    public static void i(String msg) {
        i(TAG, msg);
    }

    public static void i(String tag, String msg) {
        println(tag, msg);
    }

    public static void i(Object o) {
        i(TAG, o);
    }

    public static void i(String tag, Object o) {
        println(tag, o);
    }

    /**
     ********************************** println ************************************
     */
    public static void println(String tag, String msg) {
        if(isShowTime) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            tag = simpleDateFormat.format(new Date()) + " / " +tag ;
        }
        System.out.println(tag + ": " + msg);
    }

    public static void println(String msg) {
        System.out.println(TAG + ": " + msg);
    }

    public static void println(Object object) {
        println(TAG, object);
    }

    public static void println(String tag, Object object) {
        if(isShowTime) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            tag = simpleDateFormat.format(new Date()) + " / " +tag ;
        }
        System.out.println(tag + ": " + object.toString());
    }
}
