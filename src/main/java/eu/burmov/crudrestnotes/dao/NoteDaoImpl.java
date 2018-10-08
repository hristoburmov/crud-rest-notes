package eu.burmov.crudrestnotes.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import eu.burmov.crudrestnotes.entity.Note;

@Repository
public class NoteDaoImpl implements NoteDao {
	
	@Autowired
	private SessionFactory factory;

	@Override
	public List<Note> getNotes() {
		Session session = factory.getCurrentSession();
		return (session.createQuery("from Note", Note.class)).getResultList();
	}

	@Override
	public Note getNote(int id) {
		Session session = factory.getCurrentSession();
		return session.get(Note.class, id);
	}

	@Override
	public Note saveNote(Note n) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(n);
		return n;
	}

	@Override
	public Note deleteNote(int id) {
		Session session = factory.getCurrentSession();
		Note note = session.get(Note.class, id);
		session.delete(note);
		return note;
	}

}
