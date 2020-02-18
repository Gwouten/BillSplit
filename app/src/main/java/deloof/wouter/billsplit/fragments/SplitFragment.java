package deloof.wouter.billsplit.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputLayout;

import java.math.BigDecimal;

import deloof.wouter.billsplit.R;

public class SplitFragment extends Fragment {

    private TextInputLayout ilTotalAmount, ilTip, ilPersons;
    private EditText etTotalAmount, etTip, etPersons;
    TextView amount;

    public SplitFragment() {}

    // Factory method
    public static SplitFragment newInstance() { return new SplitFragment(); }

    public View.OnClickListener splitButtonHandler = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            BigDecimal total = new BigDecimal(etTotalAmount.getText().toString());
            BigDecimal tip = new BigDecimal(etTip.getText().toString());
            BigDecimal persons = new BigDecimal(etPersons.getText().toString());

            BigDecimal fullAmount = total.add(tip);

            BigDecimal amountPerPerson = fullAmount.divide(persons);
            amount.setText(String.format("€%.2f", amountPerPerson));
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_split, container, false);

        // reference UI elements
        ilTotalAmount = rootView.findViewById(R.id.il_split_total);
        etTotalAmount = rootView.findViewById(R.id.et_split_total);
        ilTip = rootView.findViewById(R.id.il_split_tip);
        etTip = rootView.findViewById((R.id.et_split_tip));
        ilPersons = rootView.findViewById(R.id.il_split_persons);
        etPersons = rootView.findViewById((R.id.et_split_persons));
        amount = rootView.findViewById(R.id.tv_split_amount_per_person);
        Button splitBtn = rootView.findViewById(R.id.btn_split_split);

        // functionality
        splitBtn.setOnClickListener(splitButtonHandler);


        return rootView;
    }
}
