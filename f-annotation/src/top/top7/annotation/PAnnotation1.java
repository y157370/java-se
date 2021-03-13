package top.top7.annotation;

/******
 *       Created by LEARNING on 2020/12/27 18:42.
 *
 **********************************************************************
 *                .-~~~~~~~~~-._       _.-~~~~~~~~~-.
 *            __.'              ~.   .~              `.__
 *          .'//                  \./                  \\`.
 *        .'//                     |                     \\`.
 *      .'// .-~"""""""~~~~-._     |     _,-~~~~"""""""~-. \\`.
 *    .'//.-"                 `-.  |  .-'                 "-.\\`.
 *  .'//______.============-..   \ | /   ..-============.______\\`.
 *.'______________________________\|/______________________________`.
 *
 *
 *                     Don't forget to be awesome!                      
 **********************************************************************
 */

/**
 * 1.注解, 或者叫做注释类型, 英文单词是annotation
 * 2.注解annotation是一种引用数据类型, 编译后同样生成 xxx.class 文件
 * 3.自定义注解的语法格式: 注解类型名的命名遵循java类的命名格式
 * [修饰符列表] @interface 注解类型名{
 *
 * }
 * 4.注解类型的使用:
 * 使用: @注解类型名
 * 注解可以修饰 接口、类、枚举、方法、属性、形参、局部变量、注解类型。。。。。。
 * 5.JDK自带的注解：
 *
 * @Override ：位于java.lang包下，是标志性注解，给编译器做参考用。该注解用来修饰子类重写的方法，作用于编译阶段，与运行阶段无关，当
 *          编译器遇到该注解时会检查被修饰的方法是否是重写父类的，若不是则会报错，该注解只能修饰方法，该注解并不是强制性的
 * @Deprecated : 位于java.lang包下. 使用该注解注释的元素表示为已过时的(主要是向程序员传达该信息)不建议程序员使用该元素,通常是因为它很危险或存在更好的选择
 *
 */
public class PAnnotation1 {
    @Deprecated
    public void m1() {
    }
    public static void main(String[] args) {
        new PAnnotation1().m1();//已过时方法,不推荐使用
    }
}
