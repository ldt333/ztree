package com.test.ztree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.ztree.dao.ZtreeDao;
import com.test.ztree.entity.TreeNode;

@Service
public class ZtreeService {

    @Autowired
    private ZtreeDao ztreeDao;

    public List<TreeNode> getNodes() {
        return ztreeDao.getNodes();
    }

    public List<TreeNode> asyncGetNodes(TreeNode treeNode) {
        return ztreeDao.asyncGetNodes(treeNode);
    }

}
