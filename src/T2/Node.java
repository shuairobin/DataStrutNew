package T2;

/**
 * Created by Robin on 2017/5/17.
 * 节点类：
 * 1.数据域：可能是一个简单变量，也可以是复杂的类
 * 2.链域：下一个节点的地址
 */
public class Node {
    String name;
    Node next;
    public Node(){
    }
    public Node(String name){
        this.name = name;
        next=null;
    }

}
