package eu.burmov.crudrestnotes.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.burmov.crudrestnotes.dao.NoteDao;
import eu.burmov.crudrestnotes.entity.Note;

@Service
public class NoteServiceImpl implements NoteService {
	
	@Autowired
	private NoteDao noteDao;

	@Override
	@Transactional
	public List<Note> getNotes() {
		return noteDao.getNotes();
	}

	@Override
	@Transactional
	public Note getNote(int id) {
		return noteDao.getNote(id);
	}

	@Override
	@Transactional
	public Note saveNote(Note n) {
		return noteDao.saveNote(n);
	}

	@Override
	@Transactional
	public Note deleteNote(int id) {
		return noteDao.deleteNote(id);
	}

}
