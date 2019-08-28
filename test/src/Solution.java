/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */

import sun.jvm.hotspot.utilities.Assert;

/**
 * @program: test
 * @description: test
 * @author: sunjiahui
 * @create: 2019-08-27 16:11
 **/
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public static boolean HasSubTree(TreeNode B, TreeNode A) {
        boolean result = false;
        if (B != null && A != null) {
            if (B.val == A.val) {
                result = TreeBIncludeTreeA(B, A);
            }
            if (!result) {
                result = HasSubTree(B.left, A);
            }
            if (!result) {
                result = HasSubTree(B.right, A);
            }
        }
        return result;
    }

    private static boolean TreeBIncludeTreeA(TreeNode b, TreeNode a) {
        if (a == null) {
            return true;
        }
        if (b == null) {
            return false;
        }
        if (b.val != a.val) {
            return false;
        }
        return TreeBIncludeTreeA(b.right, a.right) && TreeBIncludeTreeA(b.left, a.left);

    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(1);
        System.out.println(HasSubTree(b,a));

    }
}
