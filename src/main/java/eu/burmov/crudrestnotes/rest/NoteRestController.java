package eu.burmov.crudrestnotes.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import eu.burmov.crudrestnotes.entity.Note;
import eu.burmov.crudrestnotes.service.NoteService;

@RestController
public class NoteRestController {
	
	@Autowired
	private NoteService noteService;
	
	// Get
	@RequestMapping(method = RequestMethod.GET, value = "/notes")
	public List<Note> getNotes() {
		return noteService.getNotes();
	}
	@RequestMapping(method = RequestMethod.GET, value = "/notes/{id}")
	public Note getNote(@PathVariable int id) {
		Note note = noteService.getNote(id);
		if(note == null) {
			throw new NoteNotFoundException("Note with id " + id + " has not been found");
		}
		return note;
	}
	
	// Save, update, delete
	@RequestMapping(method = RequestMethod.POST, value = "/notes")
	public Note saveNote(@Valid @RequestBody Note note) {
		note.setId(0);
		return noteService.saveNote(note);
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/notes")
	public Note updateNote(@Valid @RequestBody Note note) {
		Note n = noteService.getNote(note.getId());
		if(n == null) {
			throw new NoteNotFoundException("Note with id " + note.getId() + " was not found and could not be updated");
		}
		return noteService.saveNote(note);
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/notes/{id}")
	public Note deleteNote(@PathVariable int id) {
		Note note = noteService.getNote(id);
		if(note == null) {
			throw new NoteNotFoundException("Note with id " + id + " was not been found and could not be deleted");
		}
		return note;
	}

}
