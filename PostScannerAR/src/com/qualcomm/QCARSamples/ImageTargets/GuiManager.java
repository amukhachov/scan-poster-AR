package com.qualcomm.QCARSamples.ImageTargets;


import android.content.Context;
import android.view.View;
import android.widget.ImageButton;

public class GuiManager {
	private View overlayView;
    private ImageButton loadButton;
    private ImageButton favoritesButton;
    
    public GuiManager(final Context context) {
    	
    	overlayView = View.inflate(context, R.layout.interface_overlay, null);
    	loadButton = (ImageButton)overlayView.findViewById(R.id.load_button);
    	favoritesButton = (ImageButton)overlayView.findViewById(R.id.favorites_button);
    	
    }
    
    public void showButtons() {
    	loadButton.setVisibility(View.VISIBLE);
    	favoritesButton.setVisibility(View.VISIBLE);
    }
    
    public void hideButtons() {
    	loadButton.setVisibility(View.GONE);
    	favoritesButton.setVisibility(View.GONE);
    }
    
    public View getOverlayView() {
    	return overlayView;
    }
}
