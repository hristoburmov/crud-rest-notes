package eu.burmov.crudrestnotes.dao;

import java.util.List;

import eu.burmov.crudrestnotes.entity.Note;

public interface NoteDao {
	public List<Note> getNotes();
	public Note getNote(int id);
	public Note saveNote(Note n);
	public Note deleteNote(int id);
}
