package com.example.composable.ui.screen

// Código generado por Google Stitch (proyecto AppLoginTutorial, Prompt 2 - Recuperar contraseña).
// Cambios para adaptarlo al proyecto:
// - package com.example.composable.ui.screen y nombre RecuperarScreen (Stitch lo llamó ForgotPasswordScreen)
// - se quitó verticalScroll(rememberScrollState()) porque la actividad pide no usar remember
// - systemBarsPadding() para que la flecha no quede debajo de la barra de estado
// - el Preview usa ComposableTheme, el tema del proyecto

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composable.ui.theme.ComposableTheme

// Paleta de tokens de color coherente con la pantalla de Registro
private val IndigoPrimary = Color(0xFF4F46E5)
private val IndigoLightContainer = Color(0xFFEEF2FF)
private val BackgroundSurface = Color(0xFFF8FAFC)
private val CardInfoBackground = Color(0xFFEFF6FF)
private val NeutralDark = Color(0xFF0F172A)
private val NeutralMuted = Color(0xFF64748B)
private val BorderLight = Color(0xFFE2E8F0)
private val InfoIconColor = Color(0xFF3B82F6)

@Composable
fun RecuperarScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = BackgroundSurface
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .systemBarsPadding()
                .padding(horizontal = 24.dp)
                .padding(top = 16.dp, bottom = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // 1. Botón de flecha hacia atrás arriba a la izquierda
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                IconButton(
                    onClick = {},
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(Color.White)
                        .border(1.dp, BorderLight, CircleShape)
                        .size(42.dp)
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Volver",
                        tint = NeutralDark
                    )
                }
            }
            Spacer(modifier = Modifier.height(28.dp))

            // 2. Círculo centrado con fondo índigo claro y un icono de candado grande
            Box(
                modifier = Modifier
                    .size(96.dp)
                    .clip(CircleShape)
                    .background(IndigoLightContainer)
                    .border(2.dp, IndigoPrimary.copy(alpha = 0.15f), CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Icono Candado",
                    tint = IndigoPrimary,
                    modifier = Modifier.size(48.dp)
                )
            }
            Spacer(modifier = Modifier.height(28.dp))

            // 3. Título centrado: "¿Olvidaste tu contraseña?"
            Text(
                text = "¿Olvidaste tu contraseña?",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = NeutralDark,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(10.dp))

            // 4. Párrafo centrado explicativo
            Text(
                text = "No te preocupes. Ingresa el correo asociado a tu cuenta y te enviaremos un enlace para restablecerla.",
                fontSize = 15.sp,
                color = NeutralMuted,
                lineHeight = 22.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 8.dp)
            )
            Spacer(modifier = Modifier.height(32.dp))

            // 5. Campo: "Correo electrónico" con icono de sobre
            OutlinedTextField(
                value = "carlos.mendoza@ejemplo.com",
                onValueChange = {},
                label = { Text("Correo electrónico") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Icono Correo",
                        tint = IndigoPrimary
                    )
                },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = IndigoPrimary,
                    unfocusedBorderColor = BorderLight,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White
                )
            )
            Spacer(modifier = Modifier.height(24.dp))

            // 6. Botón principal con icono de avión de papel: "Enviar enlace de recuperación"
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(54.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = IndigoPrimary,
                    contentColor = Color.White
                )
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Enviar enlace de recuperación",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.Send,
                        contentDescription = "Enviar",
                        modifier = Modifier.size(18.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(16.dp))

            // 7. Botón de texto: "Volver a iniciar sesión"
            TextButton(
                onClick = {},
                modifier = Modifier.padding(vertical = 4.dp)
            ) {
                Text(
                    text = "Volver a iniciar sesión",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = IndigoPrimary
                )
            }
            Spacer(modifier = Modifier.height(36.dp))

            // 8. Tarjeta al final con icono de información
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = CardInfoBackground
                ),
                border = BorderStroke(1.dp, BorderLight)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.Top
                ) {
                    Icon(
                        imageVector = Icons.Default.Info,
                        contentDescription = "Información",
                        tint = InfoIconColor,
                        modifier = Modifier
                            .size(24.dp)
                            .padding(top = 2.dp)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = "Revisa también tu carpeta de spam. El enlace caduca en 30 minutos.",
                        fontSize = 13.sp,
                        color = NeutralDark.copy(alpha = 0.85f),
                        lineHeight = 19.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 390, heightDp = 844)
@Composable
private fun PreviewRecuperar() {
    ComposableTheme {
        RecuperarScreen()
    }
}
