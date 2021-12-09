package com.example.vpking.dao

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "vp_table")
data class VizipipaData (
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0L,

    @ColumnInfo(name="nev")
    val nev: String,

    @ColumnInfo(name="isChecked")
    var isChecked: Boolean = false
)
