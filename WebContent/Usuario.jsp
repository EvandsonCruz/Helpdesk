<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Controle de usuário</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="css/bootstrap.min.js"></script>
	</head>
	<body>
		<!-- Default form contact -->
	<div class="container">
	<div class="d-flex justify-content-center h-100">
<form class="text-center border border-light p-5" action="${pageContext.request.contextPath}/insereAdministrador">

    <p class="h4 mb-4">Usuario</p>

    <!-- Name -->
    <input type="text" id="id" class="form-control mb-4" placeholder="id">
    <input type="text" id="login" class="form-control mb-4" placeholder="login">
    <input type="password" id="senha" class="form-control mb-4" placeholder="senha">
    <select class="browser-default custom-select mb-4" id="privilegio">
        <option value="" disabled>Choose option</option>
        <option value="Administrador" selected>Administrador</option>
        <option value="Efetivo" selected>Efetivo</option>
        <option value="Estagiario" selected>Estagiario</option>
    </select>
    
    
    

    <!-- Send button -->
    <button class="btn btn-info btn-block" type="submit" style="background-color: #B0C4DE; color: black; font-weight: bold;">Alterar</button>
    
</form>
<!-- Default form contact -->
	</body>
</html>