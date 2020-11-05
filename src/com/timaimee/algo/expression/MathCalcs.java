package com.vphealthy.leetcode.datastruct;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * 计算数学表达式
 */
public class MathCalcs {
    /**
     * 计算一下后辍表达式
     *
     * @param expressionLst
     * @return
     */
    public int calcExpressionLst(String expressionLst) {
        char[] chars = expressionLst.toCharArray();
        Stack<String> stack = new Stack<>();
        int value = 0;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (isNumber(aChar)) {
                stack.push(String.valueOf(aChar));
            }
            if (isOperator(aChar)) {
                String b = stack.pop();
                String a = stack.pop();
                Integer integerA = Integer.valueOf(a);
                Integer integerB = Integer.valueOf(b);
                value = clac(integerA, integerB, aChar);
                stack.push(String.valueOf(value));
            }
        }
        return value;
    }

    /**
     * 中辍表达式转后辍表达式
     * 需要栈和队列
     * 入栈要求：当前运算符大于栈顶元素，不可以等于;栈顶为（时，一定进
     * 出栈要求：当前运算符小于或等于栈顶元素;当前运算符为）
     *
     * @param expressionMiddle
     * @return
     */
    public String getExpressionLst(String expressionMiddle) {
        char[] chars = expressionMiddle.toCharArray();
        Queue<Character> queue = new ArrayDeque<>(chars.length);
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (isNumber(aChar)) {
//                System.out.println("isNumber=" + aChar);
                queue.offer(aChar);
            } else if (isLeftBracket(aChar)) {
                stack.push(aChar);
//                System.out.println("isLeftBracket=" + aChar);
            } else if (isRightBracket(aChar)) {
                while (!stack.empty() && stack.peek() != '(') {
                    queue.offer(stack.pop());
                }
                if (!stack.empty()) {
                    stack.pop();//把左括号清掉
                } else {
                    System.out.println("stack is empty");
                }
//                System.out.println("isRightBracket=" + aChar);
            } else if (isOperator(aChar)) {
//                System.out.println("isOperator=" + aChar);
                int operatorLevel = getOperatorLevel(aChar);
                while (!stack.isEmpty() && stack.peek() != '(' && operatorLevel <= getOperatorLevel(stack.peek())) {
                    Character stackTop = stack.pop();
                    //当前运算符大于栈顶元素,输出符号
                    queue.offer(stackTop);
                }
                stack.push(aChar);
            }
        }
        while (!stack.empty()) {
            queue.offer(stack.pop());
        }
//        System.out.println("---");
        StringBuffer sb = new StringBuffer();
        while (queue.peek() != null) {
            Character character = queue.poll();
            sb.append(character);
//            System.out.print(character);
        }
        return sb.toString();
    }

    public boolean isNumber(char a) {
        if (a == '0' || a == '1' ||
                a == '2' || a == '3' ||
                a == '4' || a == '5' ||
                a == '6' || a == '7' ||
                a == '8' || a == '9'
        ) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLeftBracket(char a) {
        if (a == '(') {
            return true;
        } else {
            return false;
        }
    }

    public boolean isRightBracket(char a) {
        if (a == ')') {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOperator(char a) {
        if (a == '+' || a == '-' || a == '*' || a == '/') {
            return true;
        } else {
            return false;
        }
    }

    public int getOperatorLevel(char a) {
        if (a == '+') {
            return 1;
        } else if (a == '-') {
            return 1;
        } else if (a == '*') {
            return 2;
        } else if (a == '/') {
            return 2;
        }
        return 1;
    }

    public int clac(int a, int b, char ch) {
        if (ch == '+') {
            return a + b;
        } else if (ch == '-') {
            return a - b;
        } else if (ch == '*') {
            return a * b;
        } else if (ch == '/') {
            return a / b;
        }
        return 0;
    }
}
