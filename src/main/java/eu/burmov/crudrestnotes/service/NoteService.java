package eu.burmov.crudrestnotes.service;

import java.util.List;

import eu.burmov.crudrestnotes.entity.Note;

public interface NoteService {
	public List<Note> getNotes();
	public Note getNote(int id);
	public Note saveNote(Note n);
	public Note deleteNote(int id);
}
