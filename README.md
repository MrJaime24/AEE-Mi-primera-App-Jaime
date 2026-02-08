# 📱 Android Navigation & Intents Demo

Este proyecto es una aplicación Android nativa desarrollada en **Kotlin** que demuestra el manejo del ciclo de vida de las Actividades, la navegación entre pantallas y el paso de datos bidireccional utilizando `Intents`.

El objetivo principal de esta práctica es implementar una arquitectura de **5 Actividades** prescindiendo del método tradicional `setContentView(R.layout...)` y utilizando en su lugar **View Binding** con el método `inflate` para una gestión más eficiente y segura de las vistas.

## 🚀 Características Principales

La aplicación consta de un flujo de navegación estructurado en 5 pantallas:

1.  **Login (Actividad Principal):**
    * Formulario de validación de usuario y contraseña.
    * Navegación a la pantalla de Inicio enviando el nombre de usuario mediante `Intent`.
2.  **Inicio (Dashboard):**
    * Recepción y visualización del nombre de usuario.
    * Menú de navegación a tres sub-secciones.
    * Recepción de datos de retorno (Callback) desde la pantalla de Contacto usando `ActivityResultLauncher`.
3.  **Contacto:**
    * Formulario completo (Nombre, Email, Mensaje).
    * Devolución de datos a la pantalla de Inicio al finalizar, sin iniciar una nueva actividad (uso de `setResult`).
4.  **Sobre Nosotros:**
    * Pantalla informativa estática.
5.  **Localización:**
    * Simulación de visualización de mapa y dirección.

## 🛠 Tecnologías y Herramientas

* **Lenguaje:** Kotlin
* **Entorno:** Android Studio
* **Diseño UI:** XML Layouts
* **Gestión de Vistas:** View Binding (uso de `Binding.inflate`)
* **Navegación:** Intents explícitos & Activity Result API

## 💻 Instalación y Configuración

1.  **Clonar el repositorio:**
    ```bash
    git clone [https://github.com/MrJaime24/AEE-Mi-primera-App-Jaime.git]
    ```
2.  **Abrir en Android Studio:**
    Selecciona `File > Open` y busca la carpeta del proyecto.
3.  **Sincronizar Gradle:**
    Asegúrate de que la sincronización se complete correctamente.
4.  **Configuración de ViewBinding:**
    El proyecto ya incluye la activación en el `build.gradle`:
    ```gradle
    buildFeatures {
        viewBinding = true
    }
    ```
5.  **Ejecutar:**
    Conecta tu dispositivo o inicia un emulador y presiona `Run`.

## 👤 Autor
Desarrollado por Jaime Martín Garcia como parte de una práctica de desarrollo de aplicaciones móviles Android.
