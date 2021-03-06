package me.aidanmees.trivia.client.gui.tab;

import java.awt.Font;

import org.darkstorm.minecraft.gui.font.UnicodeFontRenderer;

public abstract class TabGuiItem {
	
	public boolean selected = false;
	
	public boolean maximised = false;
	
	public int x;
	
	public int y;
	
	public int width;
	
	public int height;
	
	public TabGuiItem parent;
	
	public int getWidth() {
		return 0;
	}
	
	public int getHeigth() {
		return 0;
	}
	
	public static UnicodeFontRenderer fontRenderer = new UnicodeFontRenderer(new Font("Comfortaa", Font.PLAIN, 20));
	
	public TabGuiItem() {
		
	}
	
	public void update() {
		
	}
	
	public void setValues() {
		this.width = getWidth();
		this.height = getHeigth();
	}
	
	public void render() {
		
	}

	public void keyPressed(int keyCode) {
		if(this.parent != null) {
			this.parent.keyPressed(keyCode);
		}
	}
	
}
