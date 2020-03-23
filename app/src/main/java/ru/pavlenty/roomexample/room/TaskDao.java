package ru.pavlenty.roomexample.room;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import ru.pavlenty.roomexample.room.Task;

/* data access object */
@Dao
public interface TaskDao {

    @Query("select * from task")
    List<Task> getAll();

    @Insert
    void insert(Task task);

    @Update
    void update(Task task);

    @Delete
    void delete(Task task);
}