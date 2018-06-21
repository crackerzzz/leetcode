package leetcode.easy;

/**
 * <pre>
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
 * 
 * </pre>
 * 
 * @author shreejwal.shrestha
 *
 */
public class MergeSortedList {

	public static void main(String[] args) {
		final ListNode l1 = new ListNode(9);
		//l1.next = new ListNode(2);
		//l1.next.next = new ListNode(4);

		final ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);

		printNode(l1);
		printNode(l2);

		printNode(new Solution().mergeTwoLists(l1, l2));
	}

	public static void printNode(ListNode node) {
		final StringBuilder builder = new StringBuilder();
		ListNode temp = node;
		while (temp != null) {
			builder.append(temp.val);
			temp = temp.next;
			if (temp != null) {
				builder.append(" -> ");
			}
		}

		System.out.println(builder.toString());
	}

	static class Solution {
		public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
			if (l1 == null) {
				return l2;
			}
			if (l2 == null) {
				return l1;
			}
			ListNode newList = null;
			ListNode header = null;
			while (l1 != null && l2 != null) {
				int value;
				if (l1.val < l2.val) {
					value = l1.val;
					l1 = l1.next;
				} else {
					value = l2.val;
					l2 = l2.next;
				}
				if (newList == null) {
					newList = new ListNode(value);
					header = newList;
				} else {
					newList.next = new ListNode(value);
					newList = newList.next;
				}
			}

			append(newList, l1);
			append(newList, l2);

			return header;
		}

		public void append(ListNode to, ListNode from) {
			while (from != null) {
				to.next = new ListNode(from.val);
				to = to.next;
				from = from.next;
			}
		}
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}