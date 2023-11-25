package com.example.busschedule.data
import  androidx.room.Dao
import androidx.room.Insert


@Dao
interface BusScheduleDao {
    @Insert
    suspend fun insert(item: Item)
}