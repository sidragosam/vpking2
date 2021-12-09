package com.example.vpking.dao

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface VizipipaDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vp: VizipipaData)

    @Query("SELECT * from vp_table WHERE id = :key")
    fun getResultWithId(key: Long): LiveData<VizipipaData>

    @Query("SELECT * FROM vp_table ORDER BY id DESC")
    fun getAllResults(): LiveData<List<VizipipaData>>

}