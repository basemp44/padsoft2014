input metauml;
outputformat := "svg";
outputtemplate := "%j.%o";
beginfig(2);

Actor.Socio("Socio");
Actor.Empleado("Empleado");

Usecase.Sistema("Sistema");

%iGroup.left:=20;
%iGroup.right:=15;
%iGroup.boxed:=1;
%iPicture.boxed:=1;

leftToRight(30)(Empleado, Sistema);
Group.Videoclub(Empleado, Sistema);
leftToRight(50)(Socio, Videoclub);


drawObjects(Socio, Videoclub);
draw objectBox(Videoclub);

link(associationUni)(Socio.e -- Videoclub.w);
link(associationUni)(Empleado.e -- Sistema.w);
label.top("Videoclub", Videoclub.s - (0, 15));

endfig;
end

