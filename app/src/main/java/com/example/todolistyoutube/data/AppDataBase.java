package com.example.todolistyoutube.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.todolistyoutube.model.Note;

@Database(entities = {Note.class}, version = 1, exportSchema = false)
public abstract class AppDataBase extends RoomDatabase {
    public abstract NoteDao noteDao();
}
