package com.test.ztree.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.ztree.entity.TreeNode;
import com.test.ztree.service.ZtreeService;

@RequestMapping("/ztree")
@RestController
public class ZtreeController {

    @Autowired
    private ZtreeService ztreeService;
    
    @RequestMapping("/getNodes")
    public List<TreeNode> getNodes() {
        List<TreeNode> treeNodeList = ztreeService.getNodes();
        return treeNodeList;
    }
    
    @RequestMapping("/asyncGetNodes")
    public List<TreeNode> asyncGetNodes(TreeNode treeNode) {
 
        List<TreeNode> treeNodeList = ztreeService.asyncGetNodes(treeNode);
        return treeNodeList;
    }  
}
