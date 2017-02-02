<%-- 
    Document   : index
    Created on : Jan 25, 2017, 2:13:01 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv='X-UA-Compatible' content='IE=edge' />
        <meta charset="utf-8">
        <!--meta http-equiv="Content-Type" content="text/html; charset=UTF-8"-->
        <!--meta http-equiv="Content-Security-Policy" content="default-src * 'unsafe-inline' 'unsafe-eval' script-srcdata: gap: https://ssl.gstatic.com 'unsafe-eval'; style-src * 'unsafe-inline' 'unsafe-eval'; media-src *"-->
        <title>JSP Page</title>
        <script
		id="sap-ui-bootstrap"
		src='https://openui5.hana.ondemand.com/resources/sap-ui-core.js'
		data-sap-ui-theme="sap_belize"
		data-sap-ui-libs="sap.m"
		data-sap-ui-compatVersion="edge"
                data-sap-ui-bindingSyntax='complex'
                data-sap-ui-resourceroots='{"sap.ui.demo.wt": "./"}'
		data-sap-ui-preload="async">
	</script>
	
        <script>
		sap.ui.getCore().attachInit(function () {
			//jQuery("#content").html("Hello World - UI5 is ready");
                        new sap.m.Shell({
                           app : new sap.ui.core.ComponentContainer({
               name : "sap.ui.demo.wt"
            })
                    }).placeAt("content");
		});
	</script>

    </head>
    <body class='sapUiBody' id="content">
        <!--h1>Hello World!</h1>
        <form action="helloo.htm" >  
            Name: <input type="text" name="name"/><br/>  
            Password: <input type="password" name="password"/><br/>  
         <input type="submit" value="login"/>  
       </form --> 
        
        
  </body>
</html>
