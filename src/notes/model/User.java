package notes.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class User {

    private final StringProperty login;
    private ObservableList<Note> notesData = FXCollections.observableArrayList();

    public User(String login) {
        this.login = new SimpleStringProperty(login);
        //Hardcode for testing
        notesData.add(new Note("Title0", "Body0"));
        notesData.add(new Note("Title1", "Body1"));
        notesData.add(new Note("Title2", "Body2"));
        notesData.add(new Note("Title3", "Body3"));
    }
    
    /**
    * Нужен метод addNote(Note note) {}
    * т.к. можно сломать систему сделав getNotesData() = null
    * В итогде User.getNotesData() после этого будет возвращать null.
    **/
    
    public ObservableList<Note> getNotesData() {
        return notesData;
    }
    public void setNotesData(ObservableList<Note> notesData) {
        this.notesData = notesData;
    }

    public String getLogin() {
        return login.get();
    }
    public StringProperty loginProperty() {
        return login;
    }
    public void setLogin(String login) {
        this.login.set(login);
    }
}
