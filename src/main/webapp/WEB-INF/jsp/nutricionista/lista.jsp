<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>

<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="utf-8">
    <title>ClinicaApp</title>
</head>

<body>
    <!-- A grey horizontal navbar that becomes vertical on small screens -->
    <div class="conteiner  bg-light">
        <%@ include file="../components/nav.jsp" %>
        <div class="container">
            <h3>Classe: Nutricionista</h3>
            <button type="button" class="btn btn-primary"><a href="/nutricionista/incluir" class="link-light">Adicionar</a></button>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>Matricula</th>
                        <th>Especialidades</th>
                        <th>Esportivo</th>
                        <th>CRN</th>
                        <th>Link</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="i" items="${listagem}">
                        <tr>
                            <td>${i.id}</td>
                            <td>${i.nome}</td>
                            <td>${i.matricula}</td>
                            <td>${i.especialidades}</td>
                            <td>${i.esportivo}</td>
                            <td>${i.getConselhoRegional()}</td>
                            <td><a href="/nutricionista/${i.id}/excluir">excluir</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</body>

</html>