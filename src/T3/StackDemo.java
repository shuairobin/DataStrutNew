package T3;

import java.util.Stack;

/**
 * Created by Robin on 2017/7/5.
 */
public class StackDemo {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        stack.push("组长");
        stack.push("部门经理");
        stack.push("主管副总");
        stack.push("总经理");
        stack.push("董事长");
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
