<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <style>
        button{
            width: 90px;
        }
    </style>
</head>
<body>
  <form method="post">


              <label for="one"></label><input type="text" name="one" id="one">
              <label for="two"></label><input type="text" name="two" id="two">
              <%=request.getAttribute("kq")%>
      <br />
      <br />
              <button type="submit" name="a" id="+" value="+">+</button>
              <button type="submit" name="a" id="-" value="-">-</button>
              <button type="submit" name="a" id="/" value="/">/</button>
              <button type="submit" name="a" id="*" value="*">*</button>

  </form>
</body>
</html>
