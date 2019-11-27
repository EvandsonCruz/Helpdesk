<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Chamados</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="css/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Chamados <a href="Usuario.jsp" style="color: white;">*</a></h2> 
  <input class="form-control" id="myInput" type="text" placeholder="Pesquisar...">
  <br>
  <table class="table table-bordered table-striped">
    <thead>
      <tr>
        <th>Id</th>
        <th>Idade</th>
        <th>Assunto</th>
        <th>Estado</th>
        <th>Disponibilidade</th>
        <th>Fila</th>
        <th>Atendimento</th>
        <th>Cliente</th>
      </tr>
    </thead>
    <tbody id="myTable" >
    <tr>
        <td><a href="getChamado.jsp" target="blank">0001</a></td>
          <td>2019-11-26</td>
              <td>Pc não liga</td>
              <td>Aberto</td>
              <td>Desbloqueado</td>
              <td>Fila2</td>
              <td>Evandson</td>
              <td>Zezinho</td>
      </tr>
      <tr>
        <td><a href="getChamado.jsp" target="blank">0002</a></td>
          <td>2019-11-26</td>
              <td>Criar email</td>
              <td>Aberto</td>
              <td>Desbloqueado</td>
              <td>Fila2</td>
              <td>Evandson</td>
              <td>Luizinho</td>
      </tr>
      <tr>
        <td><a href="getChamado.jsp" target="blank">0003</a></td>
          <td>2019-11-26</td>
              <td>Alterar Servidor</td>
              <td>Aberto</td>
              <td>Bloqueado</td>
              <td>Fila3</td>
              <td>Evandson</td>
              <td>Mariazinha</td>
      </tr>
    </tbody>
  </table>
  
  
</div>

<script>
$(document).ready(function(){
  $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#myTable tr").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});
</script>

</body>
</html>
</html>