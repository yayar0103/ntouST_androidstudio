package com.example.ntoust;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.content.ContentValues;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.awt.font.TextAttribute;
import java.text.DateFormat;
import java.util.Calendar;

public class AddMoneyActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    private TextView date;
    private TextView item;
    private TextView money;
    private Button button;
    private MyDBHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_money);
        findViews();

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment datePicker = new DatePickerFragment();
                datePicker.show(getSupportFragmentManager(), "data picker");
            }
        });

        helper = new MyDBHelper(this, "expense.db", null, 1);

    }

    private void findViews() {
        date = (TextView) findViewById(R.id.textView11);
        item = (EditText) findViewById(R.id.item);
        money = (EditText) findViewById(R.id.cost);
        button = (Button) findViewById(R.id.button);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        String currentDateString = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());

        date.setText(currentDateString);
    }

    public void add(View v){
        String cdate = date.getText().toString();
        String info = item.getText().toString();
        int amount = Integer.parseInt(money.getText().toString());
        ContentValues values = new ContentValues();
        values.put("cdate", cdate);
        values.put("info", info);
        values.put("amount", amount);
        long id = helper.getWritableDatabase().insert("exp", null, values);

        Log.d("ADD", id+"");
    }
}
