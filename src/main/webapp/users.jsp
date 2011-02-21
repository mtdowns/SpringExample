<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>My Users!</h2>
<ul>
<c:forEach var="user" items="${userList}">
	<li>${user}</li>
</c:forEach>
</ul>
</body>
</html>
