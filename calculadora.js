function calcula(){
	console.log("Funcion calcula");

	let resultado = 0;
	//leer los datos del formulario, los numeros
	let n1 = Number(document.getElementById("num1").value);//obtener el valor del elemento con id num1
	let n2 = Number(document.getElementById("num2").value);//obtener el valor del elemento con id num2

	//leer la operacion que queremos hacer
	let suma = document.getElementById("suma").checked;
	let resta = document.getElementById("resta").checked;
	let multi = document.getElementById("multi").checked;
	let divi = document.getElementById("divi").checked;

	console.log(suma);
	console.log(resta);
	console.log(multi);
	console.log(divi);

	//realizar la operacion 
	if(suma){
		resultado = n1 + n2;
	}
	if(resta){
		resultado = n1 - n2;
	}
	if(multi){
		resultado = n1 * n2;
	}
	if(divi){
		resultado = n1 / n2;
	}

	//mostrar los resultados
	document.getElementById("salida1").innerHTML = resultado;
	document.getElementById("salida2").innerHTML = resultado;
}