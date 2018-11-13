package com.test.ztree.idao;

import java.util.List;

import com.test.ztree.entity.TreeNode;

public interface ZtreeMapper {

    List<TreeNode> getNodes();

    List<TreeNode> asyncGetNodes(TreeNode treeNode);

}
