# PostTestZem

Composables debe ser un modulo en lugar de un paquete para minimizar los tiempos de compilación.
Se agregan estas dependencias para poder utilizar las clases dentro de los Composable.
La implementación actual es una muestra de como agregar Compose a un proyecto con Layouts en xml.

dependencies {
    implementation 'androidx.compose.ui:ui:1.0.1'
    // Tooling support (Previews, etc.)
    implementation 'androidx.compose.ui:ui-tooling:1.0.1'
    // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
    implementation 'androidx.compose.foundation:foundation:1.0.1'
    // Material Design
    implementation 'androidx.compose.material:material:1.0.1'
    // Material design icons
    implementation 'androidx.compose.material:material-icons-core:1.0.1'
    implementation 'androidx.compose.material:material-icons-extended:1.0.1'
    // Integration with activities
    implementation 'androidx.activity:activity-compose:1.3.1'
    // Integration with ViewModels
    implementation 'androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha07'
    // Integration with observables
    implementation 'androidx.compose.runtime:runtime-livedata:1.0.1'
    
  # ComposablePreview
  ![WhatsApp Image 2021-10-01 at 10 11 30](https://user-images.githubusercontent.com/34403810/135648712-39434f68-ae03-43f6-b8bc-73f702f2e59f.jpeg)
  
![WhatsApp Image 2021-10-01 at 10 11 30 (1)](https://user-images.githubusercontent.com/34403810/135648838-afb3087d-0a2c-420f-be89-8d3f05674b88.jpeg)
