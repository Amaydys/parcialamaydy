<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>
<div class="container">
<h2>Error!</h2>
    <p>Ocurrió un error en la URL: ${url}</p>
    <p>Mensaje de excepción: ${exception}</p> 
</div>
<%@ include file="common/footer.jsp"%>