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
    public void reorderList(ListNode head) {
        if(head==null||head.next==null){
            return;
        }

        Map<Integer,ListNode> map=new HashMap<>();
        ListNode node=head;
        int index=0;
        while(node!=null){
            map.put(index,node);
            node=node.next;
            index=index+1;
        }
        int l=0,r=map.size()-1;
        while(l<=r){
            
            ListNode leftNode=map.get(l);
            ListNode rightNode=map.get(r);

            if(rightNode==leftNode){
                rightNode.next=null;
                break;
            }

            leftNode.next=rightNode;
            l++;
            if(l<r){
            rightNode.next=map.get(l);
            }
            else if(l==r){
                rightNode.next=null;
            }
            r--;
        }
        
    }
}
