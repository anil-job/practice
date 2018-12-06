package com.trivedi.hardik.interviewcake;

/**
 * Populate each next pointer to point to its next right node. If there is no
 * next right node, the next pointer should be set to NULL.
 * 
 * Initially, all next pointers are set to NULL.
 * 
 * Note:
 * 
 * You may only use constant extra space. Recursive approach is fine, implicit
 * stack space does not count as extra space for this problem. You may assume
 * that it is a perfect binary tree (ie, all leaves are at the same level, and
 * every parent has two children).
 * 
 * @author hatrivedi
 * @date Dec 5, 2018
 * @since 2.5
 */
public class PopulatingNextRightPointersInEahNode {
	public void connect(TreeLinkNode root) {
		if (root == null)
			return;
		if (root.left != null) {
			root.left.next = root.right;
			if (root.next != null)
				root.right.next = root.next.left;
		}
		connect(root.left);
		connect(root.right);
	}
}
