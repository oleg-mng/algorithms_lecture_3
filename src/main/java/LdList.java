import java.util.*;

import static java.lang.Character.isDigit;

public class LdList<I extends Number> {
    public static void main(String[] args) {
//        Queue<Integer> q1 = new LinkedList<>();
//        q1.add(5);
//        q1.add(3);
//        q1.add(28);
//        q1.add(28);
//        System.out.println(q1);
//        q1.remove();
//        System.out.println(q1);

//        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
//        pq2.add(123);
//        pq2.add(3);
//        pq2.add(13);
//        pq2.add(1);
//        System.out.println(pq2);
//        System.out.println(pq2.poll());
//        System.out.println(pq2.poll());

//        Deque<Integer> dq3 = new ArrayDeque<>();
//        dq3.add(3);
//        dq3.add(5);
//        dq3.add(7);
//        dq3.addFirst(17);
//        dq3.addLast(71);
//        System.out.println(dq3);
//        dq3.removeFirst();
//        dq3.removeLast();
//        System.out.println(dq3);
//        dq3.addFirst(55);
//        dq3.addLast(88);
//        System.out.println(dq3);
//        dq3.offerFirst(2);
//        System.out.println(dq3);
//        System.out.println(dq3.getFirst());
//        System.out.println(dq3.peekFirst());

        var exp = "1 2 3 * -".split(" "); // 1 + 2 * 3
        int res = 0;
        System.out.println(Arrays.toString(exp));

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = st.pop() - st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res = st.pop() / st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }
        private static boolean isDigit(String s) throws NumberFormatException {
            try {
                Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }




