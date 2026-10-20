package com.example.composable.ui.screen

// Código generado por Google Stitch (proyecto AppLoginTutorial, Prompt 1 - Registro).
// Cambios para adaptarlo al proyecto:
// - package com.example.composable.ui.screen y nombre RegistroScreen (Stitch lo llamó RegisterScreen)
// - se quitó verticalScroll(rememberScrollState()) porque la actividad pide no usar remember
// - systemBarsPadding() para que la flecha no quede debajo de la barra de estado
// - el Preview usa ComposableTheme, el tema del proyecto

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
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composable.ui.theme.ComposableTheme

// Paleta de colores Índigo & Grises (Material Design 3)
private val IndigoPrimary = Color(0xFF4F46E5)
private val IndigoContainer = Color(0xFFEEF2FF)
private val BackgroundSurface = Color(0xFFF8FAFC)
private val NeutralDark = Color(0xFF0F172A)
private val NeutralMuted = Color(0xFF64748B)
private val BorderLight = Color(0xFFE2E8F0)

@Composable
fun RegistroScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = BackgroundSurface
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .systemBarsPadding()
                .padding(horizontal = 24.dp)
                .padding(top = 16.dp, bottom = 32.dp)
        ) {
            // 1. Botón de flecha hacia atrás arriba a la izquierda
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
            Spacer(modifier = Modifier.height(24.dp))

            // 2. Título grande: "Crea tu cuenta"
            Text(
                text = "Crea tu cuenta",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = NeutralDark
            )
            Spacer(modifier = Modifier.height(6.dp))

            // 3. Subtítulo: "Empieza tu viaje con nosotros"
            Text(
                text = "Empieza tu viaje con nosotros",
                fontSize = 15.sp,
                color = NeutralMuted
            )
            Spacer(modifier = Modifier.height(28.dp))

            // 4. Campo: "Nombre completo" con icono de persona
            OutlinedTextField(
                value = "Carlos Mendoza",
                onValueChange = {},
                label = { Text("Nombre completo") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Icono Nombre",
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
            Spacer(modifier = Modifier.height(16.dp))

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
            Spacer(modifier = Modifier.height(16.dp))

            // 6. Campo: "Contraseña" con icono de candado y ojo
            OutlinedTextField(
                value = "password1234",
                onValueChange = {},
                label = { Text("Contraseña") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "Icono Contraseña",
                        tint = IndigoPrimary
                    )
                },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Visibility,
                        contentDescription = "Alternar visibilidad",
                        tint = NeutralMuted
                    )
                },
                visualTransformation = PasswordVisualTransformation(),
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
            Spacer(modifier = Modifier.height(16.dp))

            // 7. Campo: "Confirmar contraseña" con icono de candado
            OutlinedTextField(
                value = "password1234",
                onValueChange = {},
                label = { Text("Confirmar contraseña") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "Icono Confirmar Contraseña",
                        tint = IndigoPrimary
                    )
                },
                visualTransformation = PasswordVisualTransformation(),
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
            Spacer(modifier = Modifier.height(16.dp))

            // 8. Checkbox: "Acepto los términos y condiciones"
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Checkbox(
                    checked = true,
                    onCheckedChange = {},
                    colors = CheckboxDefaults.colors(
                        checkedColor = IndigoPrimary,
                        checkmarkColor = Color.White
                    )
                )
                Spacer(modifier = Modifier.width(4.dp))
                val termsText = buildAnnotatedString {
                    append("Acepto los ")
                    withStyle(style = SpanStyle(color = IndigoPrimary, fontWeight = FontWeight.SemiBold)) {
                        append("términos y condiciones")
                    }
                }
                Text(
                    text = termsText,
                    fontSize = 14.sp,
                    color = NeutralDark
                )
            }
            Spacer(modifier = Modifier.height(24.dp))

            // 9. Botón principal: "Crear cuenta"
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
                Text(
                    text = "Crear cuenta",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(24.dp))

            // 10. Separador: "O regístrate con"
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                HorizontalDivider(
                    modifier = Modifier.weight(1f),
                    color = BorderLight
                )
                Text(
                    text = "O regístrate con",
                    fontSize = 13.sp,
                    color = NeutralMuted,
                    modifier = Modifier.padding(horizontal = 14.dp)
                )
                HorizontalDivider(
                    modifier = Modifier.weight(1f),
                    color = BorderLight
                )
            }
            Spacer(modifier = Modifier.height(24.dp))

            // 11. Botón: "Continuar con Google" con icono
            OutlinedButton(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    containerColor = Color.White,
                    contentColor = NeutralDark
                ),
                border = ButtonDefaults.outlinedButtonBorder().copy(
                    brush = SolidColor(BorderLight)
                )
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    // Círculo representativo para el logo de Google
                    Box(
                        modifier = Modifier
                            .size(22.dp)
                            .clip(CircleShape)
                            .background(IndigoContainer),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "G",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = IndigoPrimary
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Continuar con Google",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
            Spacer(modifier = Modifier.height(28.dp))

            // 12. Pie: "¿Ya tienes una cuenta? Inicia sesión"
            val footerText = buildAnnotatedString {
                append("¿Ya tienes una cuenta? ")
                withStyle(style = SpanStyle(color = IndigoPrimary, fontWeight = FontWeight.Bold)) {
                    append("Inicia sesión")
                }
            }
            Text(
                text = footerText,
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Preview(showBackground = true, widthDp = 390, heightDp = 844)
@Composable
private fun PreviewRegistro() {
    ComposableTheme {
        RegistroScreen()
    }
}
