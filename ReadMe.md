# 1. Configurar la URL base
   Si estás ejecutando tu aplicación en localhost, la URL base será:

bash
Copiar
Editar
http://localhost:8080/api/products
Si la ejecutas en otro servidor, cambia localhost:8080 por la IP o dominio correspondiente.
#

# 2. Pruebas en Postman 
   A) Crear un Producto (POST)
   Método: POST
   URL: http://localhost:8080/api/products
   Headers:
   Content-Type: application/json
   Body (JSON, formato raw):
   json
   Copiar
   Editar


   {
   "name": "Producto1",
   "description": "Descripción del producto 1"
   }

   Respuesta esperada: Un timestamp de la actualización en Firebase.
   

# B) Obtener un Producto por Nombre (GET) 
   Método: GET
   URL: http://localhost:8080/api/products/Producto1
   Respuesta esperada (si existe en Firebase):
   json
   Copiar
   Editar
   {
   "name": "Producto1",
   "description": "Descripción del producto 1"
   }

   # C) Obtener Todos los Productos (GET)
   Método: GET
   URL: http://localhost:8080/api/products
   Respuesta esperada (ejemplo):
   json
   Copiar
   Editar

   [
   {
   "name": "Producto1",
   "description": "Descripción del producto 1"
   },
   {
   "name": "Producto2",
   "description": "Descripción del producto 2"
   }
   ]

   # D) Actualizar un Producto (PUT)
   Método: PUT
   URL: http://localhost:8080/api/products
   Headers:
   Content-Type: application/json
   Body (JSON, formato raw):
   json
   Copiar
   Editar


   {
   "name": "Producto1",
   "description": "Nueva descripción del producto 1"
   }

   Respuesta esperada: Un timestamp de la actualización.
   
# E) Eliminar un Producto (DELETE)
   Método: DELETE
   URL: http://localhost:8080/api/products/Producto1

   Respuesta esperada:
   csharp
   Copiar
   Editar

   Document with Product ID Producto1 has been deleted successfully