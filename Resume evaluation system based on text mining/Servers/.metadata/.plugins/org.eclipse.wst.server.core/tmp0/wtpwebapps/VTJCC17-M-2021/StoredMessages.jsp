<!DOCTYPE html>
<!--
	Indus by TEMPLATE STOCK
	templatestock.co @templatestock
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.dao.DBConnection"%>
<html lang="en" class="no-js">
	<head>
        <style>
a{
font-size: 15px;
color: blue;
font-style: italic;
}
td,tr,th{
font-size:15px;
color: black;
font-family: verdana;
}
th{
color: black;
}
</style>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1"> 
        <title>Provably secure and lightweight identity-based
authenticated data sharing protocol for
cyber-physical cloud environment</title>
        <link rel="StyleSheet" href=w3.css>

        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="css/et-lineicon.css" />
        <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <link href='http://fonts.googleapis.com/css?family=Roboto:400,500,400italic,500italic,700' rel='stylesheet' type='text/css'>
        <!--[if IE]>
        	<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
	</head>
	<body>

        <!-- Preloader -->
        <div class="animationload">
            <div class="loader">
                Loading...
            </div>
        </div> 
        <!-- End Preloader -->

        <!-- =========================
                 HOME
        ========================== -->

		<section id="home">
			<div class="content">
                <div id="large-header" class="large-header">
                    <canvas id="demo-canvas"></canvas>
                    <div id="countdown_dashboard" class="home-main container">
                        <div class="row">
                            <div class="logo">
                                <h1 style="color: white"> Provably secure and lightweight identity-based
authenticated data sharing protocol for
cyber-physical cloud environment</h1>
                            </div>
                            <br><br>
                            <div class="row">
                            <!-- DAYS -->
                            <div class="col-md-3" data-scroll-reveal="enter bottom move 25px, after 0.3s">
                                <div class="dash days_dash">
                                    <a href="DOHome.jsp" class="dash_title" style="font-size: 25px;">DO HOME</a>
                                </div>
                            </div>
                            <!-- HOURS -->
                            <div class="col-md-3" data-scroll-reveal="enter bottom move 25px, after 0.3s">
                                <div class="dash hours_dash">
                                <a href="Store.jsp" class="dash_title" style="font-size: 25px;">Encrypt Message</a>
                                </div>
                            </div>
                            <div class="col-md-3" data-scroll-reveal="enter bottom move 25px, after 0.3s">
                                <div class="dash hours_dash">
                                <a href="StoreMessages.jsp" class="dash_title" style="font-size: 25px;">Stored Messages</a>
                                </div>
                            </div>
                            <!-- MINUTES -->
                            <!-- SECONDS -->
                           
                        <div class="col-md-3" data-scroll-reveal="enter bottom move 25px, after 0.3s">
                                <div class="dash seconds_dash">
                                    <a href="index.html" class="dash_title" style="font-size: 25px;">Sign Out</a>
                                </div>
                        </div>
                        </div>
                    </div> <!-- END COUNTDOWN -->
                </div> <!-- LARGE HEADER -->
            </div> <!-- END CONTENT -->
        </section>
        <!-- =========================
                 CONTACT
        ========================== -->

         <section id="contact" class="contact">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                         <h4>REQUESTED MK KEYS</h4>
                         
                         <div class="row">
<% 
String uid = (String)session.getAttribute("email");
String sql = "select * from store where doid='"+uid+"'";
ResultSet rs = DBConnection.getMyDecryptFilesKeys(uid);
System.out.println("UID :"+uid);
%>
<BR>
<table width="100%" border="1">
<thead style="color:white;">
<tr class="w3-blue">
<th>FID</th>
<th>DO ID</th>
<th>DC ID</th>
<th>MK Keys</th>
</tr>
<%
try{
	while(rs.next()){
%>

<tr class="w3-card-2 w3-hover-blue-grey w3-text-white">
<td><a href="DCDownload.jsp"><%=rs.getString(1) %></a></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(3) %></td>
<td><%=rs.getString(4) %></td>
<td style="color: white;"><a href="DODecrypt?email=<%=rs.getString(2) %>">Decrypt</a> </td>
</tr>

<%} 
}catch(SQLException e){
	e.printStackTrace();
}
%>
</table>
	</div>
            </div> <!-- end container -->
        </section> <!-- end Contact -->
                        <div class="line-separate line-white text-center"><span></span></div>
                    </div> <!-- end Our Location -->
                </div> <!-- end row -->
                <!-- CONTACT FORM -->
                <div id="cformSuccessMsg" style="display: none;" class="confirm-message"></div>

            
            

        <!-- =========================
                 FOOTER
        ========================== -->

            
        <!-- JAVASCRIPTS -->
        <script src="js/jquery.min.js"></script>
        <script src="js/jquery.lwtCountdown-1.0.js"></script>
        <script src="js/jquery.stellar.min.js"></script>
        <script src="js/jquery.nicescroll.min.js"></script>
        <script src="js/animated.js"></script>
        <script src="js/main.js"></script>
	</body>
</html>