package T2;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Robin on 2017/5/18.
 * 链表类
 */
public class CLink {
    //定义头节点
    Node head;

    public CLink(){
        //建表
        head = new Node();
        head.next = null;
    }
    //新增
    public void addNode(String data){
        /**
         * 1.获取表头
         * 2.通过表头找到最后一个元素的后面
         * 3.把新增的节点放到最后一个元素的后面
         */
        Node p = head;
        if(p.next == null){
            Node temp = new Node(data);//第一个节点
            p.next = temp;
            temp.next = head.next;
            return;
        }
        p = p.next;
        //第二个节点开始
        while(p.next != head.next){
            p = p.next;
        }
        //需要新增的节点
        Node temp = new Node(data);
        p.next = temp;
        temp.next = head.next; //尾节点的下一个节点是第一个节点
    }
    //删除节点
    public void delNode(String data){
        /**
         * 1.获取表头
         * 2.通过表头找到最后一个元素
         * 3.把最后一个元素的删除
         */
        Node p = head.next;
        if(p.next != head.next ){
            return;
        }
        while (p.next!=null){
            if(p.next.name.equals(data)){
                p.next = p.next.next;
                break;
            }else {
                p = p.next;
            }
        }
    }



    public void display(){
        Node p = head.next;
        while(p.next!= head.next){
            System.out.println(p.name+"->>");
            p = p.next;
        }
        System.out.println(p.name+"->>");
    }

    public void findNode(String data){
        Node p = head;
        if(p.next==null){
            return;
        }
        while (p.next!= head.next){
            if(p.next.name.equals(data)){
                System.out.println("data="+p.next.name);
                break;
            }else {
                p = p.next;
            }
        }
    }
    //插入
    public void insertNode(String param,String data){
        Node p = head.next;
        while(p.next != head.next){
            if(p.name.equals(param)){
                Node t = p;
                Node insertNode = new Node(data);
                insertNode.next = t.next;
                t.next = insertNode;
                break;
            }else {
                p = p.next;
            }
        }
    }
    //链表大小
    public int size(){
        int n = 1;
        Node p = head;
        while (p.next != head.next){
            p = p.next;
            n++;
        }
        return n ;
    }
    public static void main(String[] args){
        CLink link = new CLink();
        link.addNode("组长");
        link.addNode("部门经理");
        link.addNode("主管副总");
        link.addNode("总经理");
        link.display();

    }
}
