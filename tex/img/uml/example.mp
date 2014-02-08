input metauml;
outputformat := "svg";
outputtemplate := "%j.%o";
beginfig(1);

Actor.Empleado("Empleado");
Actor.Gerente("Gerente");

Usecase.Alquilar("Alquilar");
	Usecase.Buscar("Buscar","articulo");
		Usecase.BPorTitulo("por titulo");
		Usecase.BPorGenero("por genero");
		Usecase.BPorAutor("por autor");
		Usecase.BPorFecha("por fecha");

Usecase.Devolver("Devolver");
	Usecase.Pago("Pago");

Usecase.AdminSocio("Gestionar", "socios");
	Usecase.AdminSocioAlta("Alta socio");
	Usecase.AdminSocioBaja("Baja socio");
	Usecase.AdminSocioVIP("Contrato", "tarifa plana");

Usecase.LogIn("Log in");
	Usecase.AdminArtic("Gestionar", "articulos");
		Usecase.AdminArticCrear("Anadir", "articulo");
		Usecase.AdminArticBorrar("Quitar", "articulo");
	Usecase.Morosos("Listado de", "morosos");
	Usecase.Ventas("Top-ventas");
	Usecase.NuevoEmpleado("Alta", "empleados");
%%%


% Empleado/Gerente
%topToBottom(200)(Empleado, Gerente);
Gerente.c = Empleado.c + (0, 250);

% Grupo de acciones EMPLEADO
topToBottom(5)(Alquilar, Devolver, AdminSocio);
Group.G_EmpleadoAcciones(Alquilar, Devolver, AdminSocio);
leftToRight(50)(Empleado, G_EmpleadoAcciones);

% Grupo de busquedas
topToBottom(5)(BPorTitulo, BPorGenero, BPorAutor, BPorFecha);
Group.G_BPor(BPorTitulo, BPorGenero, BPorAutor, BPorFecha);
leftToRight(60)(Buscar, G_BPor);
leftToRight(60)(Alquilar, Buscar);

% Grupo de gestion de usuarios
topToBottom(5)(AdminSocioAlta, AdminSocioBaja, AdminSocioVIP);
Group.G_AdminSocio(AdminSocioAlta, AdminSocioBaja, AdminSocioVIP);
leftToRight(30)(AdminSocio, G_AdminSocio);

% Grupo de acciones GERENTE
topToBottom(5)(NuevoEmpleado, Ventas, Morosos, AdminArtic);
Group.G_GerenteAcciones(AdminArtic, Morosos, Ventas, NuevoEmpleado);
leftToRight(50)(Gerente, G_GerenteAcciones, LogIn);

% Grupo de gestion de articulos
topToBottom(5)(AdminArticCrear, AdminArticBorrar);
Group.G_AdminArtic(AdminArticCrear, AdminArticBorrar);
leftToRight(100)(AdminArtic, G_AdminArtic);

% Grupo Global
Group.G_Videoclub(G_EmpleadoAcciones, Buscar, G_BPor, LogIn, G_GerenteAcciones, G_AdminSocio, G_AdminArtic);

drawObjects(Empleado, Gerente, G_Videoclub);
iGroup.left:=100;
draw objectBox(G_Videoclub);

% Tareas empleado
link(association)(Empleado.e -- Alquilar.w);
link(association)(Empleado.e -- Devolver.w);
link(association)(Empleado.e -- AdminSocio.w);

% Buscar
clink(dependency)(Alquilar, Buscar);
item(iAssoc)("<<include>>")(obj.s = .5[Alquilar.c,Buscar.c]);

clink(dependency)(BPorTitulo, Buscar);
item(iAssoc)("<<extends>>")(obj.s = .5[Buscar.c,BPorTitulo.c]);
clink(dependency)(BPorGenero, Buscar);
item(iAssoc)("<<extends>>")(obj.s = .5[Buscar.c,BPorGenero.c]);
clink(dependency)(BPorAutor, Buscar);
item(iAssoc)("<<extends>>")(obj.s = .5[Buscar.c,BPorAutor.c]);
clink(dependency)(BPorFecha, Buscar);
item(iAssoc)("<<extends>>")(obj.s = .5[Buscar.c,BPorFecha.c]);

% AdminSocio
clink(associationUni)(AdminSocio, AdminSocioAlta);
clink(associationUni)(AdminSocio, AdminSocioBaja);
clink(associationUni)(AdminSocio, AdminSocioVIP);

% Tareas gerente
link(association)(Gerente.e -- AdminArtic.w);
link(association)(Gerente.e -- Morosos.w);
link(association)(Gerente.e -- Ventas.w);
link(association)(Gerente.e -- NuevoEmpleado.w);

clink(dependency)(AdminArtic, LogIn);
item(iAssoc)("<<includes>>")(obj.s = .5[AdminArtic.c,LogIn.c]);
clink(dependency)(Morosos, LogIn);
item(iAssoc)("<<includes>>")(obj.s = .5[Morosos.c,LogIn.c]);
clink(dependency)(Ventas, LogIn);
item(iAssoc)("<<includes>>")(obj.s = .5[Ventas.c,LogIn.c]);
clink(dependency)(NuevoEmpleado, LogIn);
item(iAssoc)("<<includes>>")(obj.s = .5[NuevoEmpleado.c,LogIn.c]);

% AdminArtic
clink(dependency)(AdminArtic, Buscar);
item(iAssoc)("<<include>>")(obj.w = .5[AdminArtic.c,Buscar.c]);
clink(associationUni)(AdminArtic, AdminArticCrear);
%item(iAssoc)("<<extends>>")(obj.c = .5[AdminArticCrear.c,AdminArtic.c]);
clink(associationUni)(AdminArtic, AdminArticBorrar);
%item(iAssoc)("<<extends>>")(obj.c = .5[AdminArticBorrar.c,AdminArtic.c]);

endfig;
end

