<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>

<div class="container">
	<div>
		<a type="button" class="btn btn-primary btn-md" href="/add-vehiculo">Adiciobar Vehiculo</a>
	</div>
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3>Lista de Vehiculos</h3>
		</div>
		<div class="panel-body">
			<table class="table table-striped">
				<thead>
					<tr>
						<th width="20%">Placa</th>
						<th width="20%">Hora Entrada</th>
						<th width="200%">Hora Salida</th>
						<th width="20%">Ubicacion</th>
						<th width="20%">Tipo Vehiculo</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${vehiculos}" var="vehiculo">
						<tr>
							<td>${vehiculo.placa}</td>
							<td>${vehiculo.horaEntrada}</td>
							<td>${vehiculo.horaSalida}</td>
							<td>${vehiculo.ubicacion}</td>
							<td>${vehiculo.tipoVehiculo}</td>
							<td><a type="button" class="btn btn-success"
								href="/update-vehiculo?id=${vehiculo.id}">Actualizar</a>
							<a type="button" class="btn btn-warning"
								href="/delete-vehiculo?id=${vehiculo.id}">Eliminar</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>
<%@ include file="common/footer.jsp"%>