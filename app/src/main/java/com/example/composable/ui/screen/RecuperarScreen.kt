package com.example.composable.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LockReset
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composable.ui.theme.ComposableTheme

// Mismos colores índigo y gris de la pantalla de Registro (diseño de Google Stitch)
private val Indigo = Color(0xFF4F46E5)
private val IndigoOscuro = Color(0xFF3525CD)
private val IndigoClaro = Color(0xFFE2DFFF)
private val GrisTexto = Color(0xFF464555)
private val GrisBorde = Color(0xFFC7C4D8)
private val FondoClaro = Color(0xFFF8F9FF)
private val FondoTarjeta = Color(0xFFEFF4FF)

// Pantalla de Recuperar contraseña: solo diseño visual, sin lógica ni navegación
@Composable
fun RecuperarScreen() {
    Scaffold(containerColor = FondoClaro) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // 1. Flecha hacia atrás
            Box(modifier = Modifier.fillMaxWidth()) {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Volver",
                        tint = IndigoOscuro
                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // 2. Círculo índigo claro con el candado
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(112.dp)
                    .background(IndigoClaro, CircleShape)
            ) {
                Icon(
                    imageVector = Icons.Default.LockReset,
                    contentDescription = "Candado",
                    tint = Indigo,
                    modifier = Modifier.size(56.dp)
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // 3 y 4. Título y párrafo centrados
            Text(
                text = "¿Olvidaste tu contraseña?",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0B1C30),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "No te preocupes. Ingresa el correo asociado a tu cuenta y te enviaremos un enlace para restablecerla.",
                style = MaterialTheme.typography.bodyLarge,
                color = GrisTexto,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(32.dp))

            // 5. Campo de correo con un valor de ejemplo
            OutlinedTextField(
                value = "carlos.mendoza@ejemplo.com",
                onValueChange = { },
                label = { Text("Correo electrónico") },
                leadingIcon = { Icon(Icons.Default.Email, contentDescription = null) },
                trailingIcon = { Icon(Icons.Default.CheckCircle, contentDescription = null, tint = Indigo) },
                singleLine = true,
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Indigo,
                    unfocusedBorderColor = GrisBorde
                ),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(24.dp))

            // 6. Botón principal con el avión de papel
            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                shape = MaterialTheme.shapes.medium,
                colors = ButtonDefaults.buttonColors(containerColor = Indigo)
            ) {
                Text("Enviar enlace de recuperación", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.width(8.dp))
                Icon(Icons.AutoMirrored.Filled.Send, contentDescription = null, modifier = Modifier.size(20.dp))
            }

            Spacer(modifier = Modifier.height(8.dp))

            // 7. Botón de texto para volver
            TextButton(onClick = { }) {
                Text("Volver a iniciar sesión", color = Indigo, fontWeight = FontWeight.SemiBold)
            }

            // Empuja la tarjeta de ayuda hacia el final de la pantalla
            Spacer(modifier = Modifier.weight(1f))

            // 8. Tarjeta de ayuda con el icono de información
            Card(
                colors = CardDefaults.cardColors(containerColor = FondoTarjeta),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(16.dp)
                ) {
                    Icon(Icons.Default.Info, contentDescription = null, tint = Indigo)
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = "Revisa también tu carpeta de spam. El enlace caduca en 30 minutos.",
                        color = GrisTexto,
                        fontSize = 14.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewRecuperar() {
    ComposableTheme {
        RecuperarScreen()
    }
}
