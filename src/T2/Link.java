package T2;

import T2.Node;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Robin on 2017/5/18.
 * 链表类
 */
public class Link {
    //定义头节点
    Node head;

    public Link(){
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
        while(p.next != null){
            p=p.next;
        }
        p.next = new Node(data);
    }
    //删除节点
    public void delNode(String data){
        /**
         * 1.获取表头
         * 2.通过表头找到最后一个元素
         * 3.把最后一个元素的删除
         */
        Node p = head;
        if(p.next==null){
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

    public ArrayList<String> printListFromTailToHead(){
        Node p = head;
        Stack<String> stack = new Stack<>();
        while (p.next != null){
            stack.push(p.next.name);
            p = p.next;
        }
        ArrayList<String> list = new ArrayList<>();
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        System.out.println();
        return list;
    }

    public void display(){
        Node p = head;
        while(p.next!=null){
            System.out.println(p.next.name+"->>");
            p = p.next;
        }
    }

    public void findNode(String data){
        Node p = head;
        if(p.next==null){
            return;
        }
        while (p.next!=null){
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
        Node p = head;
        while(p.next != null){
            if(p.next.name.equals(param)){
                Node t = p.next;
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
        int n = 0;
        Node p = head;
        while (p.next != null){
            p = p.next;
            n++;
        }
        return n ;
    }
    public static void main(String[] args){
        Link link = new Link();
        link.addNode("组长");
        link.addNode("部门经理");
        link.addNode("主管副总");
        link.addNode("总经理");
        link.display();
//        ArrayList<String> list =  link.printListFromTailToHead();
//        System.out.println(list.toString());
    }
}
