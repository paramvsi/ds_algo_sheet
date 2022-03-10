package sheet.arrays.twopointer;

class Node {
    Node next;
    int value;
}

public class LinkedListCycleDetection {
    public static Node findCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast.next.next != null && slow.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            //cycle exist ?
            if (fast == slow) {
                // Now the node where the slow and head will meet will be the cycle head node.
                while (slow != head) {
                    head = head.next;
                    slow = slow.next;
                }

                return head;
            }
        }

        return null;
    }
}
