<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/demo.css">
<link type="text/css" rel="stylesheet" href="css/zTreeStyle/zTreeStyle.css">
<script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="js/jquery.ztree.core.js"></script>
<script type="text/javascript">
    var zTreeObj;
    var setting = {
		async: {
            enable: true,
            url:"ztree/asyncGetNodes",
            autoParam:["id"],
            dataFilter: filter
        },
    	view: {
    		showLine: false,
    		nameIsHTML: true
    	},
        data: {
        	simpleData: {
        		enable: true
        	}
        }
    };
    
    function filter(treeId, parentNode, childNodes) {
        return childNodes;
    }
    
    function initTree(){
    	$.ajax({
    		url: "ztree/getNodes",
    		type: "get",
    		dataType: "json",
    		success: function(data){
    			zTreeObj = $.fn.zTree.init($("#treeDemo"), setting, data);
     			var nodes = zTreeObj.getNodes();
     			zTreeObj.reAsyncChildNodes(nodes[0], "refresh", false, function(){
     				zTreeObj.selectNode(nodes[0]);
     			});
    		},
    		error: function(){
    			
    		}
    	});
    }
    
    $(function(){
    	initTree();
    });
    
</script>
</head>
<body>
<div>
    <ul id="treeDemo" class="ztree"></ul>
</div>
</body>
</html>