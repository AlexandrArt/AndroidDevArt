package com.android_arts.customdialogarts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;


public class CustomDialogArts extends Activity {
	final private static int DIALOG_REG = 1;
	final private static int DIALOG_LOGIN = 2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_custom_dialog_arts);
		Button registration = (Button) findViewById(R.id.button1);
		Button login = (Button) findViewById(R.id.button2);
		registration.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				showDialog(DIALOG_REG);
			}
		});
		
		login.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				showDialog(DIALOG_LOGIN);
			}
		});
	}

	
	
	
	@Override
	protected Dialog onCreateDialog(int id) {

		AlertDialog dialogDetails = null;

		switch (id) {
		case DIALOG_REG:
			LayoutInflater inflater = LayoutInflater.from(this);
			View dialogview = inflater.inflate(R.layout.dialog, null);

			AlertDialog.Builder dialogbuilder = new AlertDialog.Builder(this);
			dialogbuilder.setTitle("Registration");
			dialogbuilder.setView(dialogview);
			dialogDetails = dialogbuilder.create();

			break;
		case DIALOG_LOGIN:
			LayoutInflater inflater2 = LayoutInflater.from(this);
			View dialogview2 = inflater2.inflate(R.layout.dialog2, null);

			AlertDialog.Builder dialogbuilder2 = new AlertDialog.Builder(this);
			dialogbuilder2.setTitle("Login");
			dialogbuilder2.setView(dialogview2);
			dialogDetails = dialogbuilder2.create();

			break;
		}
		

		return dialogDetails;
	}

	@Override
	protected void onPrepareDialog(int id, Dialog dialog) {

		switch (id) {
		case DIALOG_REG:
			final AlertDialog alertDialog = (AlertDialog) dialog;
			Button loginbutton = (Button) alertDialog
					.findViewById(R.id.btn_login);
			Button cancelbutton = (Button) alertDialog
					.findViewById(R.id.btn_cancel);
			final EditText userName = (EditText) alertDialog
					.findViewById(R.id.txt_name);
			final EditText mail = (EditText) alertDialog
					.findViewById(R.id.e_mail);
			final EditText password = (EditText) alertDialog
					.findViewById(R.id.password);
			final EditText c_password = (EditText) alertDialog
					.findViewById(R.id.c_password);

			loginbutton.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					alertDialog.dismiss();
					Toast.makeText(
							CustomDialogArts.this,
							"User Name : " + userName.getText().toString()
							        + "  E-Mail : "
							        + mail.getText().toString()
									+ "  Password : "
									+ password.getText().toString()
									+ " Confirm Password : "
									+ c_password.getText().toString(),
							Toast.LENGTH_LONG).show();
				}
			});

			cancelbutton.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					alertDialog.dismiss();
				}
			});
			break;
			
			
		case DIALOG_LOGIN:
			final AlertDialog alertDialog2 = (AlertDialog) dialog;
			Button loginbutton2 = (Button) alertDialog2
					.findViewById(R.id.btn_login_a);
			Button cancelbutton2 = (Button) alertDialog2
					.findViewById(R.id.btn_cancel_a);
			final EditText userName2 = (EditText) alertDialog2
					.findViewById(R.id.txt_name2);
		
			final EditText password2 = (EditText) alertDialog2
					.findViewById(R.id.password2);


			loginbutton2.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					alertDialog2.dismiss();
					Toast.makeText(
							CustomDialogArts.this,
							"User Name : " + userName2.getText().toString()
							       
									+ "  Password : "
									+ password2.getText().toString()
									,
							Toast.LENGTH_LONG).show();
				}
			});

			cancelbutton2.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					alertDialog2.dismiss();
				}
			});
			break;
		}
	}

}
