package com.test.ztree.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.ztree.entity.TreeNode;
import com.test.ztree.idao.ZtreeMapper;

@Repository
public class ZtreeDao {

    @Autowired
    private ZtreeMapper ztreeMapper;

    public List<TreeNode> getNodes() {
        return ztreeMapper.getNodes();
    }

    public List<TreeNode> asyncGetNodes(TreeNode treeNode) {
        return ztreeMapper.asyncGetNodes(treeNode);
    }

}
