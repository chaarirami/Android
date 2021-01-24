package com.example.mytraining;

import androidx.fragment.app.Fragment;

//To navigate from fragment to fragment
public interface NavigationHost {
    void navigateTo(Fragment fragment, boolean addToBackstack);
}
