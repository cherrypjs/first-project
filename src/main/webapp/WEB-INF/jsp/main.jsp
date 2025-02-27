<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Welcome BookMall</title>
  <link rel="stylesheet" type="text/css" href="../css/main.css">
</head>
<body>

<div class="wrapper">
  <div class="wrap">
    <div class="top_gnb_area">
      <h1>gnb area</h1>
    </div>
    <div class="top_area">
      <div class="logo_area">
        <h1>logo area</h1>
      </div>
      <div class="search_area">
        <h1>Search area</h1>
      </div>
      <div class="login_area">
        <div class="login_button"><a href="${path}/rest/">로그인</a></div>
        <span><a href="${path}/rest/insert">회원가입</a></span>
      </div>
      <div class="clearfix"></div>
    </div>
    <div class="navi_bar_area">
      <h1>navi area</h1>
    </div>
    <div class="content_area">
      <h1>content area</h1>
    </div>
  </div>
</div>

</body>
</html>
