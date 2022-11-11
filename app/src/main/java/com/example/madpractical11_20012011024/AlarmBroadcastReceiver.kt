package com.example.madpractical11_20012011024

import android.content.BroadcastReceiver
import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.util.Log

class AlarmBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        if (intent != null && context != null) {
            val note = Note()
            note.id = intent.getIntExtra(Note.NOTE_ID_KEY, -1).toString()
            note.title = intent.getStringExtra(Note.NOTE_TITLE_KEY).toString()
            note.subTitle = intent.getStringExtra(Note.NOTE_SUBTITLE_KEY).toString()
            note.Description = intent.getStringExtra(Note.NOTE_DESCRIPTION_KEY).toString()
            note.modifiedTime = intent.getStringExtra(Note.NOTE_MODIFIED_TIME_KEY).toString()
            note.reminderTime = intent.getLongExtra(Note.NOTE_REMINDER_TIME_KEY, 0)
            note.isReminder = true
            Log.i(TAG, "onReceiver: Note: $note")
            notificationDialog(context, NoteViewActivity::class.java, note.title, note.Description, note)
        }
        }

    private fun notificationDialog(context: Context, java: Class<NoteViewActivity>, title: String, description: String, note: Note) {

    }
}