# Builder - Patron de Diseño

## Usos
- Soluciona problema de los multiples constructores (telescoping constructors)
- Niega el uso de los setters de la clase por ende no necesitas crearlos

## Desventajas
- Inmutable : no podes modificar el objeto uno vez que llamaste a build(), ya que no tenes setters

