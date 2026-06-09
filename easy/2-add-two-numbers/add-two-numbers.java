/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;

        int carry = 0;

        while( l1 != null || l2 != null || carry != 0){
            
            int digit1 = 0;
            int digit2 = 0;

            if(l1 != null){
                digit1 = l1.val;
            }

            if(l2 != null){
                digit2 = l2.val;
            }
            
            int sum = digit1 + digit2 + carry;

            carry = sum / 10;

            int digit = sum % 10;

            ListNode newNode = new ListNode(digit);

            tail.next = newNode;

            tail = tail.next;

            if(l1 != null){
                l1 = l1.next;
            }
            else{
                l1 = null;
            }

            if(l2 != null){
                l2 = l2.next;
            }
            else{
                l2 = null;
            }
        }

        dummyHead = dummyHead.next;

        return dummyHead;


        /*
        ListNode Head = new ListNode(0, null);
        ListNode current = Head;

        int carryOver = 0;

        while(l1 != null && l2 != null){

            int newVal = l1.val + l2.val + carryOver;
            System.out.println("The newVal for this node is: " + newVal);

            
            carryOver = newVal / 10;
            newVal = newVal % 10;

            current.val = newVal;

            if(l1.next != null && l2.next != null){
                current.next = new ListNode();
                current = current.next;
            }

    
            l1 = l1.next;
            l2 = l2.next;

            System.out.println(carryOver);
        }

        while(l1 != null){
            current.val = l1.val + carryOver;
            carryOver = 0;

            if(l1.next != null){
                current.next = new ListNode();
                current = current.next;
            }
        }

        while(l2 != null){
            current.val = l2.val + carryOver;
            carryOver = 0;

            if(l2.next != null){
                current.next = new ListNode();
                current = current.next;
            }
        }

        
        return Head;
        */



        /*
        ListNode headTemp = new ListNode(0, null);
        ListNode walker = headTemp;

        while(l1 != null || l2 != null){
            int carryOn = 0;
            int l1Val;
            int l2Val;

            if(l1 == null){
                l1Val = 0;
            }
            else
                l1Val = l1.val;

            if(l2 == null){
                l2Val = 0;
            }
            else
                l2Val = l2.val;

            int newVal = l1Val + l2Val;

            if(newVal > 9){
                carryOn = newVal/10;
                newVal = newVal%10;
            }

            if(l1.next != null)
                l1 = l1.next;
            
            if(l2.next != null)
                l2 = l2.next;


            walker.val = newVal;
            ListNode newNode = new ListNode(0, null);
            walker.next = newNode;
            
        }

        while(headTemp != null){
            System.out.println(headTemp.next);
            headTemp = headTemp.next;
        }

        return headTemp;

        */
    }
}