Función num <- PedirValor (n)
	Definir num Como Entero
	Definir leerValor Como logico
	leerValor = Verdadero
	
	Escribir 'Ingrese el ', n, ' número'
	
	Mientras leerValor = Verdadero Hacer
		Leer num
		Si num<0 O num>10 Entonces
			Escribir 'El numero debe ser mayor que 0 y menor que 10'
		SiNo
			leerValor = Falso
		FinSi
	FinMientras
FinFunción


Algoritmo PromedioNumeros
	// Variables
	Definir n1, n2, n3, n4, n5, promedio, suma Como Real
	// Entradas
	Escribir 'Calcular el promedio de 5 numeros'
	Escribir 'Ingrese los 5 numeros para los que vamos a calcular el promedio'
	n1 = PedirValor('primer')
	n2 = PedirValor('segundo')
	n3 = PedirValor('tercer')
	n4 = PedirValor('cuarto')
	n5 = PedirValor('quinto')
	// Proceso 
	suma = n1+n2+n3+n4+n5
	promedio = suma/5
	// Salidas
	Escribir 'El promedio de los 5 numeros ingresados es: ', promedio
FinAlgoritmo
