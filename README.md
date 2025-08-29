# TeamApp - Ejercicio de GitHub con Android y Compose

## 🎯 Objetivo
Este ejercicio tiene como objetivo practicar **colaboración con Git y GitHub** dentro de un proyecto Android nativo con **Kotlin y Jetpack Compose**.  
Los estudiantes trabajarán en equipo, utilizando ramas, commits, Pull Requests y revisiones de código, simulando un flujo de trabajo real.

## 🚀 Instrucciones
1. Crea un fork del repositorio de GitHub y clonalo en tu computadora.
2. Crea una rama con tu nombre o con el nombre de la funcionalidad que te corresponda (ejemplo: `feature/nombre-lista`).
3. Implementa la parte del proyecto que te fue asignada (modelo, repositorio, UI, etc.).
4. Haz commits pequeños y descriptivos de tus cambios.
5. Abre un Pull Request (PR) hacia la rama `develop`. Otro compañero debe revisarlo antes de hacer merge.
6. Una vez que todas las *features* estén integradas en `develop`, el equipo debe abrir un PR final hacia `main` del repositorio original.
7. El repositorio debe incluir:
    - Capturas de pantalla de la app corriendo (lista y detalle).
    - Evidencias de los PRs y revisiones de código.
    - Una breve reflexión en este README sobre lo aprendido.

## 📂 Estructura del proyecto
- `MainActivity.kt`: Contiene la pantalla inicial con un mensaje de bienvenida.
- `strings.xml`: Archivo de recursos de texto.
- `develop` branch: Rama donde se integrarán las features antes de pasar a `main`.

## 📝 Entrega
Al finalizar:
- Agrega en este README:
    - Capturas de pantalla de la app funcionando.
    - Explicación de cómo resolvieron los conflictos y organizaron el flujo de trabajo.
    - Reflexión del equipo sobre lo aprendido.

---

### 📸 Capturas de pantalla

![App corriendo](screenshots/programa_corriendo.png)

---

### 🔄 Organización del flujo de trabajo y resolución de conflictos

- Cada integrante creó su propia rama de feature (`feature/nombre`).
- Se realizaron commits pequeños y descriptivos para cada avance.
- Al terminar cada feature, se abrió un Pull Request (PR) hacia la rama `develop`.
- Otro compañero revisó el PR, dejó comentarios y aprobó los cambios.
- Solo después de la aprobación, se hizo merge a `develop`.
- Si hubo conflictos, se resolvieron antes de hacer merge, comunicándonos por chat y revisando los archivos afectados.
- Finalmente, se abrió un PR de `develop` (nuestro repo) hacia `develop` del repositorio original, y todo el equipo revisó y aprobó la integración final.

---

### 💡 Reflexión del equipo

Este ejercicio nos permitió practicar un flujo de trabajo colaborativo real usando Git y GitHub. Aprendimos a:
- Trabajar en ramas independientes para evitar conflictos.
- Hacer commits claros y frecuentes.
- Usar Pull Requests y revisiones de código para mejorar la calidad del proyecto.
- Resolver conflictos de integración de manera ordenada y comunicativa.
- Valorar la importancia de la colaboración y la comunicación en proyectos de desarrollo de software.
