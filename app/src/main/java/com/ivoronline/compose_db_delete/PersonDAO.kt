package com.ivoronline.compose_db_delete

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PersonDao {

  //INSERT PERSON
  @Insert
  fun insertPerson(product: Person)

  //DELETE PERSON
  @Query("DELETE FROM person WHERE name = :name")
  fun deletePerson(name: String)

}


