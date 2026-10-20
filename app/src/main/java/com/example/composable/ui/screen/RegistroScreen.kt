package com.example.composable.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composable.ui.theme.ComposableTheme

// Colores índigo y gris del diseño hecho en Google Stitch
private val Indigo = Color(0xFF4F46E5)
private val IndigoOscuro = Color(0xFF3525CD)
private val GrisTexto = Color(0xFF464555)
private val GrisBorde = Color(0xFFC7C4D8)
private val FondoClaro = Color(0xFFF8F9FF)

// Pantalla de Registro: solo diseño visual, sin lógica ni navegación
@Composable
fun RegistroScreen() {
    Scaffold(containerColor = FondoClaro) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // 1. Flecha hacia atrás
            item {
                Box(modifier = Modifier.fillMaxWidth()) {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Volver",
                            tint = IndigoOscuro
                        )
                    }
                }
            }

            // 2 y 3. Título y subtítulo
            item {
                Column(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "Crea tu cuenta",
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF0B1C30)
                    )
                    Text(
                        text = "Empieza tu viaje con nosotros",
                        style = MaterialTheme.typography.bodyLarge,
                        color = GrisTexto
                    )
                }
                Spacer(modifier = Modifier.height(24.dp))
            }

            // 4 a 7. Campos del formulario con valores de ejemplo
            item {
                CampoRegistro(
                    etiqueta = "Nombre completo",
                    valor = "Carlos Mendoza",
                    icono = { Icon(Icons.Default.Person, contentDescription = null) },
                    iconoFinal = { Icon(Icons.Default.CheckCircle, contentDescription = null, tint = Indigo) }
                )
                CampoRegistro(
                    etiqueta = "Correo electrónico",
                    valor = "carlos.mendoza@ejemplo.com",
                    icono = { Icon(Icons.Default.Email, contentDescription = null) },
                    iconoFinal = { Icon(Icons.Default.CheckCircle, contentDescription = null, tint = Indigo) }
                )
                CampoRegistro(
                    etiqueta = "Contraseña",
                    valor = "contrasena123",
                    esContrasena = true,
                    icono = { Icon(Icons.Default.Lock, contentDescription = null) },
                    iconoFinal = { Icon(Icons.Default.Visibility, contentDescription = "Mostrar contraseña") }
                )
                CampoRegistro(
                    etiqueta = "Confirmar contraseña",
                    valor = "contrasena123",
                    esContrasena = true,
                    icono = { Icon(Icons.Default.Lock, contentDescription = null) }
                )
            }

            // 8. Checkbox de términos (marcado de ejemplo)
            item {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Checkbox(
                        checked = true,
                        onCheckedChange = null,
                        colors = CheckboxDefaults.colors(checkedColor = Indigo)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Acepto los ", color = GrisTexto)
                    Text("términos y condiciones", color = Indigo, fontWeight = FontWeight.SemiBold)
                }
                Spacer(modifier = Modifier.height(16.dp))
            }

            // 9. Botón principal
            item {
                Button(
                    onClick = { },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp),
                    shape = MaterialTheme.shapes.medium,
                    colors = ButtonDefaults.buttonColors(containerColor = Indigo)
                ) {
                    Text("Crear cuenta", fontSize = 16.sp, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.width(8.dp))
                    Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null)
                }
                Spacer(modifier = Modifier.height(24.dp))
            }

            // 10. Separador
            item {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    HorizontalDivider(modifier = Modifier.weight(1f), color = GrisBorde)
                    Text(" O regístrate con ", color = GrisTexto, fontSize = 14.sp)
                    HorizontalDivider(modifier = Modifier.weight(1f), color = GrisBorde)
                }
                Spacer(modifier = Modifier.height(16.dp))
            }

            // 11. Botón de Google
            item {
                OutlinedButton(
                    onClick = { },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp)
                ) {
                    Text("G", color = Color(0xFF4285F4), fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    Spacer(modifier = Modifier.width(12.dp))
                    Text("Continuar con Google", color = Color(0xFF0B1C30), fontWeight = FontWeight.Medium)
                }
                Spacer(modifier = Modifier.height(16.dp))
            }

            // 12. Pie de página
            item {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("¿Ya tienes una cuenta? ", color = GrisTexto)
                    TextButton(onClick = { }) {
                        Text("Inicia sesión", color = Indigo, fontWeight = FontWeight.Bold)
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}

// Campo de texto reutilizable con un valor fijo de ejemplo
@Composable
private fun CampoRegistro(
    etiqueta: String,
    valor: String,
    icono: @Composable () -> Unit,
    esContrasena: Boolean = false,
    iconoFinal: (@Composable () -> Unit)? = null
) {
    OutlinedTextField(
        value = valor,
        onValueChange = { },
        label = { Text(etiqueta) },
        leadingIcon = icono,
        trailingIcon = iconoFinal,
        visualTransformation = if (esContrasena) PasswordVisualTransformation() else VisualTransformation.None,
        singleLine = true,
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = Indigo,
            unfocusedBorderColor = GrisBorde
        ),
        modifier = Modifier.fillMaxWidth()
    )
    Spacer(modifier = Modifier.height(12.dp))
}

@Preview(showBackground = true)
@Composable
private fun PreviewRegistro() {
    ComposableTheme {
        RegistroScreen()
    }
}
