package top.top7.map;

/******
 *       Created by LEARNING on 2020/10/30 13:54.
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

import java.util.*;

/**
 * HashMap集合：
 *
 * 1. HashMap集合底层是哈希表/散列表的数据结构
 * 2. 哈希表是一个 一维数组和单向链表 的结合体,融合了两者的优点
 * 3. 放在HashMap集合key部分及放在HashSet集合中的元素，需要同时重写 hashCode(); 与 equals(); 方法
 * 4. 向HashMap集合中存/取元素时,会先调用key的hashCode 方法确定元素的数组存储下标,后调用key的equals方法对比该数组位置所对应的链表中每一个元素的key
 * 5. HashMap集合的key value 值都可以为null,但key中只能有一个null,key无序不可重复
 * 6. HashMap是非线程安全的
 * 7. jdk8之后,当链表中元素数超过8时会自动转为红黑树,当红黑树元素少于6时,会转回单向链表
 */
public class PMap3HashMap {
    public static void main(String[] args) {

    }
}


/**
 * 自定义类,并重写hashCode 与 equals方法
 * 重写equals实现自定义比较规则,重写hashCode保证equals方法的准确性及散列分布策略
 */
class User {


}