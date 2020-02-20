import java.util.Scanner;

class Node15 {
    int data;
    Node15 next;

    Node15(int d) {
        data = d;
        next = null;
    }
}

class Solution4 {

    static Node15 insert(Node15 head, int data) {
        //Complete this method
        Node15 newNode15 = new Node15(data);
        Node15 current = head;

        if(current != null) {
            while(current.next!=null) {
                current = current.next;
            }
            current.next = newNode15;
        } else {
            head = newNode15;
        }

        return head;

    }

    static void display(Node15 head) {
        Node15 start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node15 head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}