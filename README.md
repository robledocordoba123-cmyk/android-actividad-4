# Actividad 4 – Construcción de Login en Jetpack Compose

Aplicaciones Móviles Android · SENA ADSO · Manuela Córdoba Robledo

## Qué tiene

| Pantalla | Archivo | Cómo se hizo |
|----------|---------|--------------|
| Login | `ui/screen/LoginScreen.kt` | A mano, paso a paso (estados con `remember`, ojo para mostrar la contraseña) |
| Registro | `ui/screen/RegistroScreen.kt` | Diseñada en Google Stitch (proyecto **AppLoginTutorial**) y pasada a Compose |
| Recuperar contraseña | `ui/screen/RecuperarScreen.kt` | Diseñada en Google Stitch y pasada a Compose |

`MainActivity.kt` abre la app en el Login.

Las pantallas de Registro y Recuperar son **solo diseño**: no usan `remember` ni `mutableStateOf`, los campos tienen valores de ejemplo y los botones tienen `onClick` vacío. Stitch entregó el diseño en HTML, así que se pasó a Jetpack Compose con las mismas reglas del prompt de conversión de la guía. Cada una tiene su `@Preview`.

## Las pantallas corriendo en el emulador

Capturas tomadas en el emulador (Medium Phone, API 37). Como la app no tiene navegación, para ver Registro y Recuperar se cambia en `MainActivity.kt` la pantalla que se llama dentro del `Surface`.

| Login | Registro | Recuperar contraseña |
|:---:|:---:|:---:|
| <img src="docs/capturas/login.png" alt="Login" width="250"> | <img src="docs/capturas/registro.png" alt="Registro" width="250"> | <img src="docs/capturas/recuperar.png" alt="Recuperar contraseña" width="250"> |

## Cómo probarlo

1. Abrir el proyecto en Android Studio y hacer **Sync**.
2. Correr la app en el emulador: se ve el Login.
3. Para ver Registro o Recuperar, abrir su archivo y usar la vista **Split** o **Design** (Preview).
