package com.sdboy.github;

/**
 * <p></p>
 *
 * @author JG
 * @version V1.0.0
 * @date 2019/2/28 17:13
 * @see
 */
public class ReversalList {
  public static void main(String[] args) {
    int[] input = {1,3,4,5,7,9,29};
    ListNode listNode = buildListNode(input);
    reversalPrint(listNode);
    reversalPrintHead(listNode);
  }

  private static ListNode buildListNode(int[] input){
    ListNode first = null, next = null, newNode;
    if(input != null && input.length>0) {
      for(int i = 0; i < input.length; i++) {
        newNode = new ListNode(input[i]);
        if(first == null){
          first = newNode;
          next = newNode;
        } else {
          next.nextNode = newNode;
          next = newNode;
        }
      }
    }
    return first;
  }

  private static void reversalPrint(ListNode listNode) {
    if(listNode == null){
      return;
    }
    if(listNode.nextNode != null) {
      reversalPrint(listNode.nextNode);
    }
    System.out.println(listNode.val);
  }

  private static void reversalPrintHead(ListNode listNode) {
    ListNode head = new ListNode(-1);
    while (listNode != null) {
//      ListNode node = new ListNode(listNode.val);
//      node.nextNode = head.nextNode;
//      head.nextNode = node;
//      listNode = listNode.nextNode;
      ListNode node = listNode.nextNode;
      listNode.nextNode = head.nextNode;
      head.nextNode = listNode;
      listNode.nextNode = node;
    }

    while (head.nextNode != null) {
      System.out.println(head.nextNode.val);
      head = head.nextNode;
    }
  }
}
