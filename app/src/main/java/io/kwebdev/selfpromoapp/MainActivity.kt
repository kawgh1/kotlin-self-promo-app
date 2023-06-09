package io.kwebdev.selfpromoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private var contactNameEditText: TextInputEditText? = null;
    private var contactNumberEditText: TextInputEditText? = null;
    private var myDisplayNameEditText: TextInputEditText? = null;
    private var startDateEditText: TextInputEditText? = null;
    private var seniorCheckBox: CheckBox? = null;
    private var immediateStartCheckBox: CheckBox? = null;
    private var jobTitleSpinner: Spinner? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contactNameEditText = findViewById(R.id.edit_text_contact_name)
        contactNumberEditText = findViewById(R.id.edit_text_contact_number)
        myDisplayNameEditText = findViewById(R.id.edit_text_my_display_name)
        startDateEditText = findViewById(R.id.edit_text_start_date)
        seniorCheckBox = findViewById(R.id.check_box_senior)
        immediateStartCheckBox = findViewById(R.id.check_box_immediate_start)
        jobTitleSpinner = findViewById(R.id.spinner_job_title)

        val previewButton: Button = findViewById(R.id.button_preview)
        previewButton.setOnClickListener {

            Toast.makeText(this, "My button works!", Toast.LENGTH_LONG)

            onPreviewClicked()
        }
    }

    private fun onPreviewClicked() {

        val testString = contactNameEditText?.text.toString() + ", " + contactNumberEditText?.text.toString();
        Toast.makeText(this,testString,Toast.LENGTH_LONG).show()
    }
}