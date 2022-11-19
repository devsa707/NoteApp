package com.example.devsa707.noteapp.feature_note.domain.use_case

import com.example.devsa707.noteapp.feature_note.domain.model.InvalidNoteException
import com.example.devsa707.noteapp.feature_note.domain.model.Note
import com.example.devsa707.noteapp.feature_note.domain.repository.NoteRepository

class AddNoteUseCase(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("O titulo da nota não pode estar vazio.")
        }

        if (note.content.isBlank()) {
            throw InvalidNoteException("O conteúdo da nota não pode estar vazio.")
        }
        repository.insertNote(note)
    }
}