import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Project name(项目名称)：日期格式化
 * Package(包名): PACKAGE_NAME
 * Class(类名): test_DateFormat
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/17
 * Time(创建时间)： 20:03
 * Version(版本): 1.0
 * Description(描述)： 格式化日期表示将日期/时间格式转换为预先定义的日期/时间格式。
 * 例如将日期“Fri May 18 15:46:24 CST2016” 格式转换为 “2016-5-18 15:46:24 星期五”的格式。
 * 在 Java 中，可以使用 DateFormat 类和 SimpleDateFormat 类来格式化日期，下面详细介绍这两个格式化日期类的使用。
 * DateFormat 类
 * DateFormat 是日期/时间格式化子类的抽象类，它以与语言无关的方式格式化并解析日期或时间。
 * 日期/时间格式化子类（如 SimpleDateFormat）允许进行格式化（也就是日期→文本）、解析（文本→日期）和标准化日期。
 * 在创建 DateFormat 对象时不能使用 new 关键字，而应该使用 DateFormat 类中的静态方法 getDateInstance()，示例代码如下：
 * DateFormat df = DateFormat.getDatelnstance();
 * 在创建了一个 DateFormat 对象后，可以调用该对象中的方法来对日期/时间进行格式化。DateFormat 类中常用方法如表 1 所示。
 * 表 1 DateFormat类的常用方法
 * 方法	描述
 * String format(Date date)	将 Date 格式化日期/时间字符串
 * Calendar getCalendar()	获取与此日期/时间格式相关联的日历
 * static DateFormat getDateInstance()	获取具有默认格式化风格和默认语言环境的日期格式
 * static DateFormat getDateInstance(int style)	获取具有指定格式化风格和默认语言环境的日期格式
 * static DateFormat getDateInstance(int style,
 * Locale locale)	获取具有指定格式化风格和指定语言环境的日期格式
 * static DateFormat getDateTimeInstance()	获取具有默认格式化风格和默认语言环境的日期/时间
 * 格式
 * static DateFormat getDateTimeInstance(int
 * dateStyle,int timeStyle)	获取具有指定日期/时间格式化风格和默认语言环境的
 * 日期/时间格式
 * static DateFormat getDateTimeInstance(int
 * dateStyle,int timeStyle,Locale locale)	获取具有指定日期/时间格式化风格和指定语言环境的日期/时间格式
 * static DateFormat getTimeInstance()	获取具有默认格式化风格和默认语言环境的时间格式
 * static DateFormat getTimeInstance(int style)	获取具有指定格式化风格和默认语言环境的时间格式
 * static DateFormat getTimeInstance(int style,
 * Locale locale)	获取具有指定格式化风格和指定语言环境的时间格式
 * void setCalendar(Calendar newCalendar)	为此格式设置日历
 * Date parse(String source)	将给定的字符串解析成日期/时间
 * 格式化样式主要通过 DateFormat 常量设置。将不同的常量传入到表 1 所示的方法中，以控制结果的长度。DateFormat 类的常量如下。
 * SHORT：完全为数字，如 12.5.10 或 5:30pm。
 * MEDIUM：较长，如 May 10，2016。
 * LONG：更长，如 May 12，2016 或 11:15:32am。
 * FULL：是完全指定，如 Tuesday、May 10、2012 AD 或 11:l5:42am CST。
 */

public class test_DateFormat
{
    public static void main(String... args)
    {
        // 获取不同格式化风格和中国环境的日期
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.CHINA);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CHINA);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA);
        // 获取不同格式化风格和中国环境的时间
        DateFormat df5 = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.CHINA);
        DateFormat df6 = DateFormat.getTimeInstance(DateFormat.FULL, Locale.CHINA);
        DateFormat df7 = DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.CHINA);
        DateFormat df8 = DateFormat.getTimeInstance(DateFormat.LONG, Locale.CHINA);
        // 将不同格式化风格的日期格式化为日期字符串
        String date1 = df1.format(new Date());
        String date2 = df2.format(new Date());
        String date3 = df3.format(new Date());
        String date4 = df4.format(new Date());
        // 将不同格式化风格的时间格式化为时间字符串
        String time1 = df5.format(new Date());
        String time2 = df6.format(new Date());
        String time3 = df7.format(new Date());
        String time4 = df8.format(new Date());
        // 输出日期
        System.out.println("SHORT：" + date1 + " " + time1);
        System.out.println("FULL：" + date2 + " " + time2);
        System.out.println("MEDIUM：" + date3 + " " + time3);
        System.out.println("LONG：" + date4 + " " + time4);
    }
}
