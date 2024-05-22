package com.bright.listofmessages

import Conversation
import Program
import ProgramCard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bright.listofmessages.ui.theme.ListOfMessagesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListOfMessagesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Conversation(
                        listOf(
                            Program("Master’s Degree in Computer",
                                "Over 4,600 International Students & Alumni From 108 Countries\n" +
                                        "The Computer Professionals Program has been running for 27 years, and is one of the largest Master’s in Computer Science programs in the USA.  We encourage enrollment of U.S. and international students through four annual entries."),
                            Program("PhD in Maharishi Vedic Science",
                                "BECOME AN EXPERT IN CONSCIOUSNESS\n" +
                                        "- Explore the most profound principles of Maharishi Vedic Science\n" +
                                        "- Read the Vedic Literature for its sound value to develop higher consciousness\n" +
                                        "- Explore the fundamentals of scientific research and learn how to conduct your own\n" +
                                        "- Base your studies on scientific methodology\n" +
                                        "- Examine in depth Dr. Tony Nader’s discovery of Veda in human physiology"),
                            Program("BS in Computer Science",
                                "PREPARE FOR A CAREER IN A FAST-GROWING FIELD\n" +
                                        "- Learn computer programming, data algorithms, web development, and more\n" +
                                        "- Focus on one full-time course per month to learn more with less stress\n" +
                                        "- Enhance your creativity through practice of the Transcendental Meditation® technique\n" +
                                        "- Learn from expert professors who support your personal growth and academic success\n" +
                                        "- Federal grants and loans typically cover all or most costs for US students"),
                            Program("Bachelor of Applied Arts & Sciences",
                                    "Through the Bachelor of Applied Arts & Sciences, you’ll gain a deep understanding of consciousness—through knowledge and experience—and how it enhances and connects different academic disciplines"),
                            Program("Bachelor’s Specialization in Ayurveda Wellness & Integrative Health",
                                    "Our program integrates modern medicine and science with the natural approach of Ayurveda — and teaches you how to use them together to create optimal health"),
                            Program("Bachelor’s Specialization in Pre-Professional Art Therapy",
                                "This specialization will prepare you for most graduate programs in art therapy, which is a necessary prerequisite to becoming a licensed art therapist. Art therapy can also be incorporated into other therapeutic practices, if you decide to pursue graduate school in a related field."),
                            Program("Bachelor’s Specialization in Yoga & Ayurveda Wellness",
                                "We teach the Maharishi AyurVedaSM health system – the modern, scientific revival of complete Ayurveda. Maharishi AyurVeda includes balancing the deepest value of mind – consciousness, which is the basis of balancing the body. It incorporates all aspects of mind, body, behavior, and environment in a scientific framework."),
                            Program("Bachelor’s Specialization in Life & Wellness Coaching",
                                "As a graduate of this program, you’ll take with you a deep understanding and personal mastery of:\n" +
                                        "\n" +
                                        "- Fundamental coaching skills, including active listening, mirroring, motivating, being self-aware, and providing feedback and suggestions.\n" +
                                        "- Principles of healthy living, as described in Maharishi AyurVeda and other contemporary disciplines of health and wellness (e.g., positive psychology, diet and nutrition, and health-related fitness).\n" +
                                        "- Business planning, such as documenting client intake, progress, and outcomes, keeping financial records, managing a schedule, and developing a network of connections to the local community.\n" +
                                        "- Applying the principles of healthy & effective living to your own life to develop radiant health and expanded self-awareness that will serve as a strong foundation for life and wellness coaching."),
                            Program("Bachelor’s Specialization in Consciousness & Human Potential",
                                "You’ll learn:\n" +
                                        "- The philosophy of Yoga as found in Maharishi’s commentary on the Bhagavad Gita and Patanjali’s Yoga Sutras, and how Yoga practice enhances your life\n" +
                                        "- How to accelerate personal growth through the Transcendental Meditation® technique, yoga asanas, retreats, and other practical approaches\n" +
                                        "- The latest scientific research on brain functioning and how meditation leads to clearer thinking\n" +
                                        "- Strategies for social transformation leading to a more peaceful world\n" +
                                        "- Modern perspectives on consciousness in the light of Maharishi Vedic Science"),
                            Program("Bachelor’s Specialization in Positive Psychology & Consciousness Awakening the Inner Self",
                                "Throughout this program, you’ll explore what makes life fulfilling and meaningful. Learn about the latest scientific research on happiness, wellbeing, and higher states of consciousness, and discover how to easily live this knowledge and share it with others. Understanding the role of positive emotions, meaningful relationships, and the experience of transcending will give you valuable insights into what it takes to live a happy and fulfilling life."),
                            Program("author8",
                                "By encapsulating mutable state within composable functions, Compose ensures that UI components automatically update when the underlying state changes, eliminating the need for manual synchronization and reducing the risk of bugs. "),
                            Program("Bachelor’s Specialization in Cinematic Arts & New Media",
                                "Our classes are project-based and focused on building your portfolio. By choosing the projects, classes, and topics you’re passionate about, you can create exactly the path you need to pursue the career of your choice.\n" +
                                        "\n" +
                                        "By the time you graduate, you’ll have an impressive portfolio and know exactly what it takes to succeed in a media career."),
                            Program("Bachelor’s Specialization in Creative Writing",
                                "Our program is founded on the idea that creativity is not meant to be a struggle, but instead a fun and rewarding process. Developing writers in this online bachelor’s specialization can learn in a supportive, inclusive environment that emphasizes spiritual and personal growth.\n" +
                                        "\n" +
                                        "In every class, we offer our students tools and techniques to awaken creativity in authentic ways that deeply engage mind, heart, and soul."),
                            Program("Bachelor’s Specialization in Regenerative Organic Agriculture",
                                "THINK GLOBAL, ACT LOCAL\n" +
                                        "- Learn how to regenerate soils, maximize water efficiency, and increase biodiversity throughout your landscape\n" +
                                        "- Receive personalized mentorship from experts in the field\n" +
                                        "- Connect with farms across the US and beyond to further develop your skill sets\n" +
                                        "- Become a consultant in Regenerative Organic Agriculture\n" +
                                        "- Federal grants and loans typically cover all or most costs for US students"),
                            Program("Bachelor’s Specialization in Sustainable & Regenerative Living",
                                "TRANSFORM YOURSELF AND YOUR WORLD\n" +
                                        "- Become a leader in the sustainability movement\n" +
                                        "- Gain a solid foundation in philosophies of sustainable and regenerative living\n" +
                                        "- Learn by doing, with meaningful community-centered projects\n" +
                                        "- Join a supportive community of like-minded students\n" +
                                        "- Federal grants and loans typically cover all or most costs for US students"),
                            Program("Bachelor’s Specialization in Business Administration",
                                "- Gain real experience starting your own business\n" +
                                        "- Develop your product or concept and learn to present it to investors\n" +
                                        "- Focus on a product or service of real benefit to the world\n" +
                                        "- Enhance your creativity by practicing the Transcendental Meditation® technique\n" +
                                        "- Federal grants and loans typically cover all or most costs for US students")

                        )
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ConversationPreview() {
    ListOfMessagesTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Conversation(
                listOf(
                    Program("Master’s Degree in Computer",
                        "Over 4,600 International Students & Alumni From 108 Countries\n" +
                                "The Computer Professionals Program has been running for 27 years, and is one of the largest Master’s in Computer Science programs in the USA.  We encourage enrollment of U.S. and international students through four annual entries."),
                    Program("PhD in Maharishi Vedic Science",
                        "BECOME AN EXPERT IN CONSCIOUSNESS\n" +
                                "- Explore the most profound principles of Maharishi Vedic Science\n" +
                                "- Read the Vedic Literature for its sound value to develop higher consciousness\n" +
                                "- Explore the fundamentals of scientific research and learn how to conduct your own\n" +
                                "- Base your studies on scientific methodology\n" +
                                "- Examine in depth Dr. Tony Nader’s discovery of Veda in human physiology"),
                    Program("BS in Computer Science",
                        "PREPARE FOR A CAREER IN A FAST-GROWING FIELD\n" +
                                "- Learn computer programming, data algorithms, web development, and more\n" +
                                "- Focus on one full-time course per month to learn more with less stress\n" +
                                "- Enhance your creativity through practice of the Transcendental Meditation® technique\n" +
                                "- Learn from expert professors who support your personal growth and academic success\n" +
                                "- Federal grants and loans typically cover all or most costs for US students"),
                    Program("Bachelor of Applied Arts & Sciences",
                        "Through the Bachelor of Applied Arts & Sciences, you’ll gain a deep understanding of consciousness—through knowledge and experience—and how it enhances and connects different academic disciplines"),
                    Program("Bachelor’s Specialization in Ayurveda Wellness & Integrative Health",
                        "Our program integrates modern medicine and science with the natural approach of Ayurveda — and teaches you how to use them together to create optimal health"),
                    Program("Bachelor’s Specialization in Pre-Professional Art Therapy",
                        "his specialization will prepare you for most graduate programs in art therapy, which is a necessary prerequisite to becoming a licensed art therapist. Art therapy can also be incorporated into other therapeutic practices, if you decide to pursue graduate school in a related field."),
                )
            )
        }
    }
}

