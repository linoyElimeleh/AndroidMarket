//package com.example.androidmarket.login;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//
//import androidx.fragment.app.Fragment;
//
//import com.example.class3demo2.R;
//import com.example.class3demo2.feed.BaseActivity;
//
//
//public class LoginFragment extends Fragment {
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.fragment_login, container, false);
//
//        Button loginBtn = view.findViewById(R.id.login_login_btn);
//        loginBtn.setOnClickListener(v -> {
//            //TODO - connect to model login function
//            toFeedActivity();
//        });
//        return view;
//    }
//
//    private void toFeedActivity() {
//        Intent intent = new Intent(getContext(), BaseActivity.class);
//        startActivity(intent);
//        getActivity().finish();
//    }
//}