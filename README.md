# M4-Games MASTERMIND

**Diagrama**

![unknown](https://user-images.githubusercontent.com/97692045/167304417-16fb02c4-262b-46f2-88a2-1fbc4dcf9450.png)

### Estructura Branches

- **Branch 'menuDificultad'**

En esta rama se ha trabajado el menú Vista donde se selecciona  el nivel de dificultad que escoge el usuario. Si no se escoge ningún nivel de dificultad, por defecto saldrá nivel principiante, igual que si el usuario selecciona el botón "Cancelar".
Dependiendo del nivel escogido, tendrá ciertos colores disponibles y diferentes números de intentos.


![Captura](https://user-images.githubusercontent.com/97692045/167302908-70bbdcc2-6711-41f6-9936-7e9eeed22713.PNG)

Opciones diferentes niveles:

1. Principiante -> 4 colores disponibles y 10 intentos
2. Medio -> 5 colores disponibles y 8 intentos
3. Avanzado -> 6 colores adisponibles y 6 intentos

- **Branch 'MenuVistaJuego'**

Aquí se esta definiedo la barra de navegación con las opciones 'Archivo' y 'Ayuda'.

![Captura1](https://user-images.githubusercontent.com/97692045/167303740-273eb202-9b27-4797-b4df-a2ba9e489721.PNG)

Dentro de la opción 'Archivo', tenemos dos opciones:
1. Nuevo Juego
2. Salir

![Captura de pantalla 2022-05-08 173728](https://user-images.githubusercontent.com/97692045/167303781-1e96cb34-1a28-4fb4-a529-401330846869.jpg)

Dentro de la opción 'Ayuda':
1. ¿Como se juega?
2. Ayuda

![Captura de pantalla 2022-05-08 173741](https://user-images.githubusercontent.com/97692045/167303815-25f9b59f-2c6d-4540-8226-3fc19d8037ec.jpg)

- **Branch 'VistaJuego'**

Es dónde se representa la interfaz gráfica para el usuario. Se muestra inicialmente los cuadrados vacios para buscar el color requerido, con la opción de dobleClick hacia delante o hacia atrás, las dos opciones son válidas. 

![Captura de pantalla 2022-05-08 180133](https://user-images.githubusercontent.com/97692045/167304742-91e5d460-e1b2-49bb-9815-e0e068f99e9e.jpg)

<details>
  <summary>Casillas vacias</summary>
<br>
  <p>Cambiamos de color las casillas vacias, con un dobleClick tanto con el botón derecho (hacia delante), como el izquierdo (hacia atrás)</p>
  
 ```java
  
	public void cambiarColor(int mouseButton, Component casilla) {

		// Dinamico segun la dificultad

		if (mouseButton == 1) {
			if (valor >= maxColor)
				valor = 0;
			else
				valor++;
		} else if (mouseButton == maxColor) {
			if (valor <= 0)
				valor = maxColor;
			else
				valor--;
		}
		casilla.setBackground(colores[valor]);

	}
```
</details>
</br>

![Captura de pantalla 2022-05-08 210312](https://user-images.githubusercontent.com/97692045/167311593-60af2877-bab3-4abc-9ce0-6e8640d4f8ae.jpg)


<details>
  <summary>Combinación secreta</summary>
<br>
  <p>Se crea aleatoriamente una combinación de colores, que el usuario tiene que intentar resolver</p>
  
 ```java
  public void generarCasillasSecretas() {
		for (int i = 0; i < 4; i++) {
			int numRandom = (int) (Math.random() * (maxColor+1));
			Casilla casillaSecreta = new Casilla(i, colores[numRandom], false);
			casillasSecretas.add(casillaSecreta);
		}
		System.out.println(casillasSecretas);
```
</details>
</br>

![Captura de pantalla 2022-05-08 210149](https://user-images.githubusercontent.com/97692045/167311540-c15934fb-ea7f-4982-b6f7-3ebe3b80614f.jpg)

<details>
  <summary>Numero de intentos</summary>
<br>
  <p>Se resta 1 intento cada vez, que comprobamos las casillas.</p>
</details>
</br>

![Captura de pantalla 2022-05-08 210817](https://user-images.githubusercontent.com/97692045/167311846-f8d90f78-de7c-49f4-8b22-5027a02f014f.jpg)

<details>
  <summary>Colores disponibles</summary>
<br>
  <p>Se muestran todos los colores disponibles</p>
  
</details>
</br>

![Captura de pantalla 2022-05-08 212028](https://user-images.githubusercontent.com/97692045/167312304-b9a532d6-de36-4933-9829-901b9390bab5.jpg)

<details>
  <summary>Botón Comprobar</summary>
<br>
  <p>Realiza la comprobación tanto del color, como la posicion </p>
  
 ```java
		/*
		 * Acción del botón "Comprobar"
		 */
		comprobarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				nrIntento++;
				
				// Pasar casillas input
				
				controlador.setCasillasInput(casillasInput);

				// Comprobar cuantos colores son correctos
				// Comprobar si el color y la posición es correcta
				controlador.validarCasillas(casillasInput);
				
				// Mostrar el estado de los colores insertados
				controlador.mostrarAciertos(contentPane, nrIntento);

				// Dejar una copia de los colores escogidos en el mismo lugar
				controlador.dejarCopiaPanel(insertarPanel, contentPane, nrIntento);

				// Mover el boton comprobar y el panel insertar colores
				controlador.moverAbajo(comprobarBtn);
				controlador.moverAbajo(insertarPanel);
				contentPane.repaint();
				contentPane.revalidate();
				
				// Actualizar el número de intentos
				labelIntentos.setText((controlador.getMaximoIntentos()- nrIntento) + " Intentos");
				
				if (nrIntento >= controlador.getMaximoIntentos()) {
					controlador.finalizarPartida();
				}

			}
		});

	}
```
</details>
</br>

![Captura de pantalla 2022-05-08 211635](https://user-images.githubusercontent.com/97692045/167312552-2c2728d2-48fe-4461-a535-bfe9156c83f0.jpg)


<details>
  <summary>Casillas Blancas</summary>
<br>
  <p>Se muestra una casilla blanca, cuando ha coincidido que un color comprobado coincide con un color de la combinación secreta</p>
  
 ```java
 	public void mostrarAciertos(JPanel panelPadre, int nrIntento) {
		JPanel panelValidados = new JPanel();
		panelValidados.setLayout(null);
		panelValidados.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
		panelValidados.setBounds(385, 40 * nrIntento, 220, 40);
		// Mostrar con negro los colores acertados y en la posicion correcta
		for (int i = 0; i < totalPerfectos; i++) {
			JEditorPane comp = new JEditorPane();
			comp.setBounds(40 * i + 40, 11, 20, 20);
			comp.setBackground(Color.BLACK);
			comp.setEnabled(false);
			panelValidados.add(comp);
		}
		// Mostrar con blanco solo los colores acertados pero no en la posicion correcta
		for (int i = 0; i < totalEncontrados; i++) {
			JEditorPane comp = new JEditorPane();
			comp.setBounds(40 * (i + totalPerfectos) + 40, 11, 20, 20);
			comp.setBackground(Color.WHITE);
			comp.setEnabled(false);
			panelValidados.add(comp);
		}

		panelPadre.add(panelValidados);

	}

```
</details>
</br>

![Captura de pantalla 2022-05-08 212807](https://user-images.githubusercontent.com/97692045/167312517-c6fa71bb-b923-4365-b26d-17f653739c67.jpg)


<details>
  <summary>Casilla Negra</summary>
<br>
  <p>Se muestra cuando uno de los colores, esta en la posición correcta</p>
  
 ```java
	public void validarCasillas(ArrayList<Casilla> casillasInput) {

		totalPerfectos = 0;
		totalEncontrados = 0;
		// Reset casilla input comprobada con cada nuevo intento
		for (int i = 0; i < casillasInput.size(); i++) {
			Casilla casilla = casillasInput.get(i);
			casilla.setComprobada(false);
		}
		// Reset casilla Secreta comprobada con cada nuevo intento
		for (int i = 0; i < casillasSecretas.size(); i++) {
			Casilla casilla = casillasSecretas.get(i);
			casilla.setComprobada(false);
		}
		/*
		 * 
		 * 
		 */
		// Comprueba color y posición correcta de las parejas casillas de input y
		// secreto de la misma posición.
		for (int i = 0; i < casillasInput.size(); i++) {
			Casilla casillaInput = casillasInput.get(i);
			Color colorCasillaInput = casillasInput.get(i).getBackground();
			Color colorCasillaSecreta = casillasSecretas.get(i).getBackground();
			// Posicion y color correctos
			if (colorCasillaInput.equals(colorCasillaSecreta)) {
				casillasSecretas.get(i).setComprobada(true);
				casillaInput.setComprobada(true);
				totalPerfectos++;
			}
		}

		// Comprueba si el color es correcto en otra posición del grupo de casillas
		// secretas
		for (int i = 0; i < casillasInput.size(); i++) {
			Casilla casillaInput = casillasInput.get(i);
			Color colorCasillaInput = casillasInput.get(i).getBackground();
			// For grupo casillas secretas
			for (int j = 0; j < casillasSecretas.size(); j++) {
				Casilla casillaSecreta = casillasSecretas.get(j);
				Color colorCasillaSecreta = casillaSecreta.getBackground();
				if (!casillaSecreta.getComprobada() 
						&& !casillaInput.getComprobada()
						&& colorCasillaInput.equals(colorCasillaSecreta)) {
					casillaSecreta.setComprobada(true);
					totalEncontrados++;
					// Una vez encontrado salir del loop;
					break;
				}
			}
		}
```
</details>
</br>



