package com.example.colorpicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;

public class WebFragment extends Fragment {

    private String url;

    public WebFragment() {
        // Required empty public constructor
    }

    public static WebFragment newInstance(String url) {
        WebFragment fragment = new WebFragment();
        Bundle args = new Bundle();
        args.putString("url", url);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate layout
        View root = inflater.inflate(R.layout.fragment_web, container, false);

        // Find WebView
        WebView webView = root.findViewById(R.id.web_view);

        // Get URL from arguments
        if (getArguments() != null) {
            url = getArguments().getString("url");

            webView.setWebViewClient(new WebViewClient()); // handle navigation inside WebView
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setDomStorageEnabled(true);
            webView.getSettings().setLoadWithOverviewMode(true);
            webView.getSettings().setUseWideViewPort(true);
            webView.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_NO_CACHE);
//not sure how to do this part.. i keep getting webpage not available and the internet told me this would help
            // it still says webpage not availabel but it is working as a button with a link


        }
        webView.loadUrl("http://www.google.com");

        return root;
    }
}
