package zuniga.ricardo.quiz23a

import androidx.lifecycle.SavedStateHandle
import org.junit.Assert.assertEquals
import org.junit.Test

class QuizViewModelTest
@Test
fun seMuevePorElBancoDePreguntas() {
    fun proveeTextoPreguntaEsperada() {
        val savedStateHandle = SavedStateHandle()
        val quizViewModel = QuizViewModel(savedStateHandle)
        assertEquals(R.string.question_jalisco, quizViewModel.currentQuestionText)
        quizViewModel.moveToNext()
        assertEquals(R.string.question_ameca, quizViewModel.currentQuestionText)

    }
}
