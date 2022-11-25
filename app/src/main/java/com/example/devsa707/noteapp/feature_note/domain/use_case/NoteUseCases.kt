package com.example.devsa707.noteapp.feature_note.domain.use_case

data class NoteUseCases(
    val getNotesUseCase: GetNotesUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase,
    val addNoteUseCase : AddNoteUseCase,
    val getNote : GetNote
)
