package com.example.nelsoncomments.presentation

class PostFragment : Fragment(R.layout.fragment_post), BaseFragment {

    private val binding by viewBinding(FragmentPostBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupUi()
    }

    override fun setupUi() {
        binding.ComposePost.setContent {
            AppTheme {
                PostView(postItem)
            }
        }
    }

    val user = User(
        id = 17,
        name = "Nelson",
        email = "nelmof@gmail.com",
        phone = "+57 3005961928",
    )

    val postItem = PostItem(
        body = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the " +
                "industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and " +
                "scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into " +
                "electronic typesetting, remaining essentially unchanged.",
        id = 3,
        user = user,
        comments = listOf(
            "Comment 1",
            "Comment 2",
            "Comment 3"
        )
    )
}


/*
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
}*/
