package com.capstone.milkteabooking.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.capstone.milkteabooking.R;
import com.capstone.milkteabooking.models.User;
import com.capstone.milkteabooking.utilities.AppConst;
import com.capstone.milkteabooking.utilities.Validation;

import io.reactivex.disposables.Disposable;

public class EditPasswordActivity extends BaseActivity implements View.OnClickListener {
    private EditText txtPassword, txtConfirmPassword, txtCurrentPassword;
    private User user;
    private Button btnChangePassword;

    @Override
    protected int getLayoutView() {
        return R.layout.activity_edit_password;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getBundleExtra(AppConst.BUNDLE);
        if (bundle.getSerializable(AppConst.PATIENT_OBJ) != null) {
            user = (User) bundle.getSerializable(AppConst.PATIENT_OBJ);
        } else {
            user = new User();
            user.setId(-1);
        }

    }

    @Override
    public String getMainTitle() {
        return getResources().getString(R.string.edit_pass_title);
    }

    @Override
    public void bindView() {
        txtPassword = findViewById(R.id.edt_password);
        txtCurrentPassword = findViewById(R.id.edt_current_password);
        txtConfirmPassword = findViewById(R.id.edt_confirm_password);
        btnChangePassword = findViewById(R.id.btn_update_password);
        btnChangePassword.setOnClickListener(this);

    }

    @Override
    public void updateUIData(Object obj) {

    }

    @Override
    public void onCancelLoading() {

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    public boolean isValid() {
        boolean isValid = true;
        txtPassword.setError(null);
        txtConfirmPassword.setError(null);
        View focusView = null;
        String password = txtPassword.getText().toString().trim();
        String currentPassword = txtCurrentPassword.getText().toString().trim();
        String confirmPassword = txtConfirmPassword.getText().toString().trim();
        if (!Validation.isPasswordValid(currentPassword)) {
            txtCurrentPassword.setError(getString(R.string.error_invalid_password));
            isValid = false;
            focusView = txtCurrentPassword;
        } else if (!confirmPassword.equals(password)) {
            txtConfirmPassword.setError(getString(R.string.error_invalid_confirm_password));
            isValid = false;
            focusView = txtConfirmPassword;
        } else if (!Validation.isPasswordValid(password)) {
            txtPassword.setError(getString(R.string.error_invalid_password));
            isValid = false;
            focusView = txtPassword;
        }
        if (!isValid) {
            focusView.requestFocus();
        }
        return isValid;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_update_password:
                if (isValid()) {
//                    callApiUpdate(user.getPhone(), txtCurrentPassword.getText().toString().trim(), txtPassword.getText().toString().trim());
                }
                break;
        }
    }

    private Disposable userServiceDisposable;

    public void callApiUpdate(String phone, String currentPassword, String newPassword) {
        showLoading();

    }


}
