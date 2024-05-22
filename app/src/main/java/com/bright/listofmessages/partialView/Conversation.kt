import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable

@Composable
fun Conversation(programs: List<Program>) {
    LazyColumn {
        items(programs) {prog -> ProgramCard(prog) }
    }
}