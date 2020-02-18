package deloof.wouter.billsplit.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import deloof.wouter.billsplit.R;

public class AboutFragment extends Fragment {

    public AboutFragment() {
    }
    // Factory method om te instatiëren
    public static AboutFragment newInstance() { return new AboutFragment(); }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_about, container, false);
        return rootView;
    }
}
