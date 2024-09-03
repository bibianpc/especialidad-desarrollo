Algoritmo Calculadora
	
	Definir numero1, numero2, resultado Como Real
	Definir opcionOperacion Como Entero
	
	Escribir "Calculadora"
	Escribir "1 Sumar"
	Escribir "2 Restar"
	Escribir "3 Multiplicar"
	Escribir "4 Dividir"
	Escribir "Digite el número de la operación que necesita ejecutar"
	Leer opcionOperacion
	
	Segun opcionOperacion Hacer
		1: //Sumar
			Escribir "Ingrese el primer número"
			Leer numero1
			Escribir "Ingrese el segundo número"
			Leer numero2
			resultado = numero1 + numero2
			Escribir "La suma de los 2 numeros ingresados es igual a: ", resultado
			
		2: //Restar
			Escribir "Ingrese el primer número"
			Leer numero1
			Escribir "Ingrese el segundo número"
			Leer numero2
			resultado = numero1 - numero2
			Escribir "La resta de los 2 numeros ingresados es igual a: ", resultado
			
		3: //Multiplicar
			Escribir "Ingrese el primer número"
			Leer numero1
			Escribir "Ingrese el segundo número"
			Leer numero2
			resultado = numero1 * numero2
			Escribir "La multiplicación de los 2 numeros ingresados es igual a: ", resultado
			
		4: //Dividir
			Escribir "Ingrese el primer número (debe ser mayor al segundo numero)"
			Leer numero1
			Escribir "Ingrese el segundo número"
			Leer numero2
			si numero2 <> 0 Entonces
				resultado = numero1 / numero2
				Escribir "La división de los 2 numeros ingresados es igual a: ", resultado	
			SiNo
				Escribir "El segundo número no puede ser igual a cero"
			FinSi					
	FinSegun
FinAlgoritmo

