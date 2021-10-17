import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Project name(项目名称)：日期格式化
 * Package(包名): PACKAGE_NAME
 * Class(类名): test_SimpleDateFormat
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/17
 * Time(创建时间)： 20:12
 * Version(版本): 1.0
 * Description(描述)： 如果使用 DateFormat 类格式化日期/时间并不能满足要求，那么就需要使用 DateFormat 类的子类——SimpleDateFormat。
 * SimpleDateFormat 是一个以与语言环境有关的方式来格式化和解析日期的具体类，它允许进行格式化（日期→文本）、解析（文本→日期）和规范化。
 * SimpleDateFormat 使得可以选择任何用户定义的日期/时间格式的模式。
 * SimpleDateFormat 类主要有如下 3 种构造方法。
 * SimpleDateFormat()：用默认的格式和默认的语言环境构造 SimpleDateFormat。
 * SimpleDateFormat(String pattern)：用指定的格式和默认的语言环境构造 SimpleDateF ormat。
 * SimpleDateFormat(String pattern,Locale locale)：用指定的格式和指定的语言环境构造 SimpleDateF ormat。
 * SimpleDateFormat 自定义格式中常用的字母及含义如表 2 所示。
 * 表 2 日期/时间格式中的字母及其含义与示例
 * 字母	含义	示例
 * y	年份。一般用 yy 表示两位年份，yyyy 表示 4 位年份	使用 yy 表示的年扮，如 11；
 * 使用 yyyy 表示的年份，如 2011
 * M	月份。一般用 MM 表示月份，如果使用 MMM，则会
 * 根据语言环境显示不同语言的月份	使用 MM 表示的月份，如 05；
 * 使用 MMM 表示月份，在 Locale.CHINA
 * 语言环境下，如“十月”；在 Locale.US
 * 语言环境下，如 Oct
 * d	月份中的天数。一般用 dd 表示天数	使用 dd 表示的天数，如 10
 * D	年份中的天数。表示当天是当年的第几天， 用 D 表示	使用 D 表示的年份中的天数，如 295
 * E	星期几。用 E 表示，会根据语言环境的不同， 显示不
 * 同语言的星期几	使用 E 表示星期几，在 Locale.CHINA 语
 * 言环境下，如“星期四”；在 Locale.US 语
 * 言环境下，如 Thu
 * H	一天中的小时数（0~23)。一般用 HH 表示小时数	使用 HH 表示的小时数，如 18
 * h	一天中的小时数（1~12)。一般使用 hh 表示小时数	使用 hh 表示的小时数，如 10 (注意 10 有
 * 可能是 10 点，也可能是 22 点）
 * m	分钟数。一般使用 mm 表示分钟数	使用 mm 表示的分钟数，如 29
 * s	秒数。一般使用 ss 表示秒数	使用 ss 表示的秒数，如 38
 * S	毫秒数。一般使用 SSS 表示毫秒数	使用 SSS 表示的毫秒数，如 156
 */

public class test_SimpleDateFormat
{
    public static void main(String... args)
    {
        Date now = new Date(); // 创建一个Date对象，获取当前时间
        // 指定格式化格式
        SimpleDateFormat f = new SimpleDateFormat(  "yyyy 年 MM 月 dd 日 E HH 点 mm 分 ss 秒");
        System.out.println(f.format(now)); // 将当前时间袼式化为指定的格式
    }
}
