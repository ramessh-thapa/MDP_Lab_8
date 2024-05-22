import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.bright.listofmessages.R

@Composable
fun ProgramCard(prog: Program) {
    Row(
        modifier = Modifier
            .padding(8.dp), // Add padding around the card
        verticalAlignment = Alignment.CenterVertically // Center the image vertically
    ) {
        Spacer(modifier = Modifier.width(2.dp))
        Image(
            painter = painterResource(id = R.drawable.miu_logo),
            contentDescription = "person",
            modifier = Modifier
                .clip(CircleShape)
                .size(70.dp)
                .border(width = 2.dp, shape = CircleShape, color = Color.LightGray)

        )
        //create a mutable state variable that trigger UI updates when its value changes
        var isExpanded by remember {
            mutableStateOf(false)
        }
        Column(
            modifier = Modifier.clickable { isExpanded = !isExpanded }
                .padding(start = 8.dp) // Add padding to separate the text from the image
        ) {
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = prog.programName,
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.titleSmall
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = prog.progarmDescription,
                style = MaterialTheme.typography.bodyMedium,
                maxLines = if(isExpanded) Int.MAX_VALUE else 2,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
        Spacer(modifier = Modifier.height(70.dp))
    }
}