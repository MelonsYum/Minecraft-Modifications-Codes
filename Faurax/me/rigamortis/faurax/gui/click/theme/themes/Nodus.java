package me.rigamortis.faurax.gui.click.theme.themes;

import me.rigamortis.faurax.gui.click.theme.*;
import me.rigamortis.faurax.module.helpers.*;
import net.minecraft.client.*;
import me.rigamortis.faurax.*;
import java.util.*;
import me.rigamortis.faurax.utils.*;
import org.lwjgl.opengl.*;
import me.rigamortis.faurax.module.*;
import me.rigamortis.faurax.values.*;
import me.rigamortis.faurax.gui.click.components.*;
import java.text.*;
import me.rigamortis.faurax.gui.click.*;

public class Nodus extends Theme implements RenderHelper
{
    private Minecraft mc;
    
    public Nodus() {
        this.mc = Minecraft.getMinecraft();
        this.setName("Nodus");
        this.setVisible(false);
    }
    
    @Override
    public void panelContructor(final Panel panel, final float mouseX, final float mouseY) {
    }
    
    @Override
    public void panelMouseClicked(final Panel panel, final int mouseX, final int mouseY, final int button) {
        if (panel.isVisible()) {
            for (final Button b : panel.buttons) {
                b.mouseClicked(mouseX, mouseY, button);
            }
            for (final Slider s : panel.sliders) {
                s.mouseClicked(mouseX, mouseY, button);
            }
            for (final CheckBox cb : panel.checkBoxes) {
                cb.mouseClicked(mouseX, mouseY, button);
            }
            for (final DropDown dd : panel.dropDowns) {
                dd.mouseClicked(mouseX, mouseY, button);
            }
            for (final ScrollBar sb : panel.scrollBars) {
                sb.mouseClicked(mouseX, mouseY, button);
            }
            if (mouseX >= panel.x + panel.dragX && mouseY >= panel.dragY + panel.y - 2.0f && mouseX <= panel.dragX + panel.x + 130.0f + 11 * panel.scrollBars.size() && mouseY <= panel.dragY + panel.y + 12.0f && button == 0) {
                panel.dragging = true;
                Client.getGUI().getTopPanel(panel);
                panel.lastDragX = mouseX - panel.dragX;
                panel.lastDragY = mouseY - panel.dragY;
            }
            if (mouseX >= panel.x + panel.dragX + 99.0f + 9 * panel.scrollBars.size() && mouseY >= panel.dragY + panel.y && mouseX <= panel.dragX + panel.x + 115.0f + 9 * panel.scrollBars.size() - 2.0f && mouseY <= panel.dragY + panel.y + 10.0f && button == 0 && !panel.name.equalsIgnoreCase("GUI")) {
                panel.setVisible(panel.dragging = false);
                Client.getGUI().getTopPanel(panel);
            }
        }
    }
    
    @Override
    public void panelMouseMovedOrUp(final Panel panel, final int mouseX, final int mouseY, final int button) {
        if (panel.isVisible()) {
            for (final Slider s : panel.sliders) {
                s.mouseReleased(mouseX, mouseY, button);
            }
            for (final ScrollBar sb : panel.scrollBars) {
                sb.mouseReleased(mouseX, mouseY, button);
            }
        }
        if (button == 0) {
            panel.dragging = false;
        }
    }
    
    @Override
    public void panelDraw(final Panel panel, final int mouseX, final int mouseY) {
        if (panel.isVisible()) {
            final GuiUtils guiUtils = Nodus.guiUtils;
            GuiUtils.drawRect(panel.x + panel.dragX - 1.5f, panel.y + panel.dragY - 3.5f, panel.dragX + panel.x + 110.0f + 9 * panel.scrollBars.size() + 1.5f, panel.dragY + panel.y + 15.0f + 13 * panel.buttons.size() + 13 * panel.sliders.size() + 13 * panel.checkBoxes.size() + 13 * panel.dropDowns.size() + 170 * panel.scrollBars.size() + 100 * panel.radar.size() + 1.5f, 1147561574);
            final GuiUtils guiUtils2 = Nodus.guiUtils;
            GuiUtils.drawRect(panel.x + panel.dragX, panel.y + panel.dragY + 12.5f, panel.dragX + panel.x + 110.0f + 9 * panel.scrollBars.size(), panel.dragY + panel.y + 15.0f + 13 * panel.buttons.size() + 13 * panel.sliders.size() + 13 * panel.checkBoxes.size() + 13 * panel.dropDowns.size() + 170 * panel.scrollBars.size() + 100 * panel.radar.size(), Integer.MIN_VALUE);
            final GuiUtils guiUtils3 = Nodus.guiUtils;
            GuiUtils.drawRect(panel.x + panel.dragX, panel.y + panel.dragY - 2.0f, panel.dragX + panel.x + 110.0f + 9 * panel.scrollBars.size(), panel.dragY + panel.y + 11.0f, -872415232);
            if (!panel.name.equalsIgnoreCase("GUI")) {
                final GuiUtils guiUtils4 = Nodus.guiUtils;
                GuiUtils.drawRect(panel.x + panel.dragX + 99.5f + 9 * panel.scrollBars.size(), panel.y + panel.dragY - 0.5f, panel.dragX + panel.x + 111.0f + 9 * panel.scrollBars.size() - 2.0f, panel.dragY + panel.y + 9.5f, panel.isVisible() ? 1715749956 : 0);
                Nodus.guiUtils.drawOutlineRect(panel.x + panel.dragX + 99.5f + 9 * panel.scrollBars.size(), panel.y + panel.dragY - 0.5f, panel.dragX + panel.x + 111.0f + 9 * panel.scrollBars.size() - 2.0f, panel.dragY + panel.y + 9.5f, 2003199590);
            }
            if (!panel.name.equalsIgnoreCase("GUI") && !panel.name.equalsIgnoreCase("NameTags") && !panel.name.equalsIgnoreCase("Tracers") && !panel.name.equalsIgnoreCase("ESP") && !panel.name.equalsIgnoreCase("ChestStealer") && !panel.name.equalsIgnoreCase("AutoFarm") && !panel.name.equalsIgnoreCase("CopsAndCrims") && !panel.name.equalsIgnoreCase("Criticals") && !panel.name.equalsIgnoreCase("Aura") && !panel.name.equalsIgnoreCase("Speed") && !panel.name.equalsIgnoreCase("Triggerbot") && !panel.name.equalsIgnoreCase("Phase") && !panel.name.equalsIgnoreCase("Jesus") && !panel.name.equalsIgnoreCase("Flight") && !panel.name.equalsIgnoreCase("Speedmine") && !panel.name.equalsIgnoreCase("Regen") && !panel.name.equalsIgnoreCase("Chams") && !panel.name.equalsIgnoreCase("Theme")) {
                this.mc.fontRendererObj.func_175063_a(String.valueOf(panel.name) + " ?F(" + panel.buttons.size() + ")", panel.x + panel.dragX + 3.0f, panel.y + panel.dragY + 1.0f, -11416245);
            }
            else {
                this.mc.fontRendererObj.func_175063_a(panel.name, panel.x + panel.dragX + 3.0f, panel.y + panel.dragY + 1.0f, -11416245);
            }
            GL11.glEnable(3089);
            GuiUtils.scissorBox((int)(panel.x + panel.dragX), (int)(panel.y + panel.dragY + 14.0f), (int)(panel.dragX + panel.x + 130.0f + 11 * panel.scrollBars.size()), (int)(panel.dragY + panel.y + 15.0f + 13 * panel.buttons.size() + 13 * panel.sliders.size() + 13 * panel.checkBoxes.size() + 13 * panel.dropDowns.size() + 170 * panel.scrollBars.size()) + 100 * panel.radar.size());
            for (final ScrollBar sb : panel.scrollBars) {
                sb.draw(mouseX, mouseY);
            }
            GL11.glDisable(3089);
            for (final Button b : panel.buttons) {
                b.draw(mouseX, mouseY);
            }
            for (final Slider s : panel.sliders) {
                s.draw(mouseX, mouseY);
            }
            for (final CheckBox cb : panel.checkBoxes) {
                cb.draw(mouseX, mouseY);
            }
            for (final DropDown dd : panel.dropDowns) {
                dd.draw(mouseX, mouseY);
            }
        }
        if (panel.dragging) {
            panel.dragX = mouseX - panel.lastDragX;
            panel.dragY = mouseY - panel.lastDragY;
        }
    }
    
    @Override
    public void buttonContructor(final Button button, final Panel panel) {
    }
    
    @Override
    public void buttonMouseClicked(final Button button, final Panel panel, final int mouseX, final int mouseY, final int mouse) {
        if (mouseX >= panel.x + panel.dragX + button.x && mouseY >= panel.dragY + panel.y + button.y && mouseX <= panel.dragX + panel.x + button.x + 115.0f && mouseY <= panel.dragY + panel.y + button.y + 12.0f && mouse == 0) {
            for (final Module mod : Client.getModules().mods) {
                if (mod.getName().equalsIgnoreCase(button.name)) {
                    mod.toggle();
                }
            }
            Client.getConfig().saveMods();
        }
    }
    
    @Override
    public void buttonDraw(final Button button, final Panel panel, final float x, final float y) {
        Minecraft.getMinecraft().fontRendererObj.func_175063_a(button.name, button.x + panel.dragX + panel.x + 3.0f, button.y + panel.dragY + panel.y + 2.5f, -3355444);
        if (x >= panel.x + panel.dragX + button.x && y >= panel.dragY + panel.y + button.y && x <= panel.dragX + panel.x + button.x + 115.0f && y <= panel.dragY + panel.y + button.y + 12.0f) {
            Minecraft.getMinecraft().fontRendererObj.func_175063_a(button.name, button.x + panel.dragX + panel.x + 3.0f, button.y + panel.dragY + panel.y + 2.5f, -1);
        }
        if (button.enabled) {
            Minecraft.getMinecraft().fontRendererObj.func_175063_a(button.name, button.x + panel.dragX + panel.x + 3.0f, button.y + panel.dragY + panel.y + 2.5f, -11416245);
        }
        if (x >= panel.x + panel.dragX + button.x && y >= panel.dragY + panel.y + button.y && x <= panel.dragX + panel.x + button.x + 115.0f && y <= panel.dragY + panel.y + button.y + 12.0f && button.enabled) {
            Minecraft.getMinecraft().fontRendererObj.func_175063_a(button.name, button.x + panel.dragX + panel.x + 3.0f, button.y + panel.dragY + panel.y + 2.5f, -11407507);
        }
        for (final Module mod : Client.getModules().mods) {
            if (mod.getName().equalsIgnoreCase(button.name)) {
                if (mod.isToggled()) {
                    button.enabled = true;
                }
                else {
                    button.enabled = false;
                }
            }
        }
    }
    
    @Override
    public void checkBoxContructor(final CheckBox checkBox, final Panel panel) {
    }
    
    @Override
    public void checkBoxMouseClicked(final CheckBox checkBox, final Panel panel, final int mouseX, final int mouseY, final int mouse) {
        if (mouseX >= panel.x + panel.dragX + checkBox.x && mouseY >= panel.dragY + panel.y + checkBox.y && mouseX <= panel.dragX + panel.x + checkBox.x + 115.0f && mouseY <= panel.dragY + panel.y + checkBox.y + 12.0f && mouse == 0) {
            checkBox.value.setBooleanValue(!checkBox.value.getBooleanValue());
        }
    }
    
    @Override
    public void checkBoxDraw(final CheckBox checkBox, final Panel panel, final float x, final float y) {
        Minecraft.getMinecraft().fontRendererObj.func_175063_a(checkBox.name, checkBox.x + panel.dragX + panel.x + 3.0f, checkBox.y + panel.dragY + panel.y + 2.5f, -6710887);
        if (x >= panel.x + panel.dragX + checkBox.x && y >= panel.dragY + panel.y + checkBox.y && x <= panel.dragX + panel.x + checkBox.x + 115.0f && y <= panel.dragY + panel.y + checkBox.y + 12.0f) {
            Minecraft.getMinecraft().fontRendererObj.func_175063_a(checkBox.name, checkBox.x + panel.dragX + panel.x + 3.0f, checkBox.y + panel.dragY + panel.y + 2.5f, -1);
        }
        if (checkBox.enabled) {
            Minecraft.getMinecraft().fontRendererObj.func_175063_a(checkBox.name, checkBox.x + panel.dragX + panel.x + 3.0f, checkBox.y + panel.dragY + panel.y + 2.5f, -11416245);
        }
        if (x >= panel.x + panel.dragX + checkBox.x && y >= panel.dragY + panel.y + checkBox.y && x <= panel.dragX + panel.x + checkBox.x + 115.0f && y <= panel.dragY + panel.y + checkBox.y + 12.0f && checkBox.enabled) {
            Minecraft.getMinecraft().fontRendererObj.func_175063_a(checkBox.name, checkBox.x + panel.dragX + panel.x + 3.0f, checkBox.y + panel.dragY + panel.y + 2.5f, -11407507);
        }
        if (checkBox.value.getBooleanValue()) {
            checkBox.enabled = true;
        }
        else {
            checkBox.enabled = false;
        }
    }
    
    @Override
    public void dropDownContructor(final DropDown dropDown, final Panel panel, final float x, final float y) {
    }
    
    @Override
    public void dropDownMouseClicked(final DropDown dropDown, final Panel panel, final int mouseX, final int mouseY, final int mouse) {
        if (dropDown.open) {
            for (final DropDownButton b : dropDown.buttons) {
                b.mouseClicked(mouseX, mouseY, mouse);
            }
        }
        if (mouseX >= panel.x + panel.dragX + dropDown.x && mouseY >= panel.dragY + panel.y + dropDown.y && mouseX <= panel.dragX + panel.x + dropDown.x + 115.0f && mouseY <= panel.dragY + panel.y + dropDown.y + 12.0f && mouse == 0) {
            dropDown.open = !dropDown.open;
            Client.getGUI().getTopPanel(panel);
        }
    }
    
    @Override
    public void dropDownDraw(final DropDown dropDown, final Panel panel, final float x, final float y) {
        final float height = dropDown.open ? (dropDown.y + panel.dragY + panel.y + 1.5f + 13 * dropDown.buttons.size()) : (dropDown.y + panel.dragY + panel.y);
        final GuiUtils guiUtils = Nodus.guiUtils;
        GuiUtils.drawRect(dropDown.x + panel.dragX + panel.x + 113.5f, dropDown.y + panel.dragY + panel.y, dropDown.x + panel.dragX + panel.x + 210.0f, height, -1438629824);
        if (x >= panel.x + panel.dragX + dropDown.x && y >= panel.dragY + panel.y + dropDown.y && x <= panel.dragX + panel.x + dropDown.x + 115.0f && y <= panel.dragY + panel.y + dropDown.y + 12.0f) {
            Minecraft.getMinecraft().fontRendererObj.func_175063_a(">" + dropDown.name, dropDown.x + panel.dragX + panel.x + 4.0f, dropDown.y + panel.dragY + panel.y + 2.5f, -11416245);
            Minecraft.getMinecraft().fontRendererObj.func_175063_a(dropDown.open ? "<<" : ">>", dropDown.x + panel.dragX + panel.x + 108.0f - this.mc.fontRendererObj.getStringWidth(dropDown.open ? "<<" : ">>"), dropDown.y + panel.dragY + panel.y + 2.5f, -11416245);
        }
        else {
            Minecraft.getMinecraft().fontRendererObj.func_175063_a(dropDown.name, dropDown.x + panel.dragX + panel.x + 4.0f, dropDown.y + panel.dragY + panel.y + 2.5f, -1);
            Minecraft.getMinecraft().fontRendererObj.func_175063_a(dropDown.open ? "<<" : ">>", dropDown.x + panel.dragX + panel.x + 108.0f - this.mc.fontRendererObj.getStringWidth(dropDown.open ? "<<" : ">>"), dropDown.y + panel.dragY + panel.y + 2.5f, -1);
        }
        if (dropDown.open) {
            for (final DropDownButton b : dropDown.buttons) {
                b.draw(x, y);
            }
        }
    }
    
    @Override
    public void dropDownButtonContructor(final DropDownButton dropDownButton, final DropDown dropDown, final Panel panel) {
    }
    
    @Override
    public void dropDownButtonMouseClicked(final DropDownButton dropDownButton, final DropDown dropDown, final Panel panel, final int mouseX, final int mouseY, final int mouse) {
        if (mouseX >= panel.x + panel.dragX + dropDownButton.x + 115.0f && mouseY >= panel.dragY + panel.y + dropDownButton.y - 12.0f && mouseX <= panel.dragX + panel.x + dropDownButton.x + 210.0f && mouseY <= panel.dragY + panel.y + dropDownButton.y && mouse == 0) {
            for (final DropDownButton ddb : dropDown.buttons) {
                if (!ddb.name.equalsIgnoreCase(dropDownButton.name)) {
                    ddb.enabled = false;
                }
            }
            for (final Theme theme : Client.getThemes().themes) {
                if (dropDownButton.name.equalsIgnoreCase(theme.getName())) {
                    for (final Theme t : Client.getThemes().themes) {
                        t.setVisible(false);
                    }
                    theme.setVisible(true);
                }
            }
            dropDownButton.enabled = true;
            dropDownButton.value.setSelectedOption(dropDownButton.name);
        }
    }
    
    @Override
    public void dropDownButtonDraw(final DropDownButton dropDownButton, final DropDown dropDown, final Panel panel, final float x, final float y) {
        final GuiUtils guiUtils = Nodus.guiUtils;
        GuiUtils.drawRect(dropDownButton.x + panel.dragX + 115.0f, dropDownButton.y + panel.dragY - 12.0f, dropDownButton.x + panel.dragX + 208.0f, dropDownButton.y + panel.dragY, Integer.MIN_VALUE);
        Minecraft.getMinecraft().fontRendererObj.func_175063_a(dropDownButton.name, dropDownButton.x + panel.dragX + 118.0f, dropDownButton.y + panel.dragY - 12.0f + 2.5f, -3355444);
        if (x >= panel.x + panel.dragX + dropDownButton.x + 115.0f && y >= panel.dragY + panel.y + dropDownButton.y - 12.0f && x <= panel.dragX + panel.x + dropDownButton.x + 210.0f && y <= panel.dragY + panel.y + dropDownButton.y) {
            Minecraft.getMinecraft().fontRendererObj.func_175063_a(dropDownButton.name, dropDownButton.x + panel.dragX + 118.0f, dropDownButton.y + panel.dragY - 12.0f + 2.5f, -1);
        }
        if (dropDownButton.enabled) {
            Minecraft.getMinecraft().fontRendererObj.func_175063_a(dropDownButton.name, dropDownButton.x + panel.dragX + 118.0f, dropDownButton.y + panel.dragY - 12.0f + 2.5f, -11416245);
        }
        if (x >= panel.x + panel.dragX + dropDownButton.x + 115.0f && y >= panel.dragY + panel.y + dropDownButton.y - 12.0f && x <= panel.dragX + panel.x + dropDownButton.x + 210.0f && y <= panel.dragY + panel.y + dropDownButton.y && dropDownButton.enabled) {
            Minecraft.getMinecraft().fontRendererObj.func_175063_a(dropDownButton.name, dropDownButton.x + panel.dragX + 118.0f, dropDownButton.y + panel.dragY - 12.0f + 2.5f, -11407507);
        }
        Client.getValues();
        for (final Value val : ValueManager.values) {
            if (dropDownButton.value == val) {
                if (dropDownButton.value.getSelectedOption().equalsIgnoreCase(dropDownButton.name)) {
                    dropDownButton.enabled = true;
                }
                else {
                    dropDownButton.enabled = false;
                }
            }
        }
    }
    
    @Override
    public void ScrollBarContructor(final ScrollBar scrollBar, final Panel panel, final float x, final float y) {
    }
    
    @Override
    public void ScrollBarMouseClicked(final ScrollBar scrollBar, final Panel panel, final int mouseX, final int mouseY, final int mouse) {
        if (mouseX >= panel.x + panel.dragX + scrollBar.x && mouseY >= panel.dragY + panel.y + scrollBar.y + 1.0f && mouseX <= panel.dragX + panel.x + scrollBar.x + 137.0f && mouseY <= panel.dragY + panel.y + scrollBar.y + 170.0f) {
            for (final ScrollBarButton sbb : scrollBar.buttons) {
                sbb.mouseClicked(mouseX, mouseY, mouse);
            }
        }
        if (mouseX >= panel.x + panel.dragX + scrollBar.x + 112.0f && mouseY >= panel.dragY + panel.y + 1.0f + scrollBar.y && mouseX <= panel.dragX + panel.x + scrollBar.x + 117.0f && mouseY <= panel.dragY + panel.y + scrollBar.y + 170.0f && mouse == 0) {
            scrollBar.dragging = true;
            scrollBar.lastDragY = mouseY - scrollBar.dragY;
        }
    }
    
    @Override
    public void ScrollBarMouseMovedOrUp(final ScrollBar scrollBar, final Panel panel, final int mouseX, final int mouseY, final int mouse) {
        if (mouse == 0) {
            scrollBar.dragging = false;
        }
    }
    
    @Override
    public void ScrollBarDraw(final ScrollBar scrollBar, final Panel panel, final float x, final float y) {
        final GuiUtils guiUtils = Nodus.guiUtils;
        GuiUtils.drawGradientRect(scrollBar.x + panel.dragX + panel.x + 112.0f, scrollBar.y + panel.dragY + panel.y + scrollBar.dragY + 1.0f, scrollBar.x + panel.dragX + panel.x + 117.0f, scrollBar.y + panel.dragY + panel.y + 39.0f + scrollBar.dragY, -11416245, -11416245);
        if (x >= panel.x + panel.dragX + scrollBar.x + 112.0f && y >= panel.dragY + panel.y + scrollBar.y + scrollBar.dragY + 1.0f && x <= panel.dragX + panel.x + scrollBar.x + 117.0f && y <= panel.dragY + panel.y + scrollBar.y + 39.0f + scrollBar.dragY) {
            final GuiUtils guiUtils2 = Nodus.guiUtils;
            GuiUtils.drawGradientRect(scrollBar.x + panel.dragX + panel.x + 112.0f, scrollBar.y + panel.dragY + panel.y + scrollBar.dragY + 1.0f, scrollBar.x + panel.dragX + panel.x + 117.0f, scrollBar.y + panel.dragY + panel.y + 39.0f + scrollBar.dragY, -11407507, -11407507);
        }
        if (scrollBar.dragging) {
            scrollBar.dragY = y - scrollBar.lastDragY;
        }
        if (scrollBar.dragY <= 0.0f) {
            scrollBar.dragY = 0.0f;
        }
        if (scrollBar.dragY >= scrollBar.height) {
            scrollBar.dragY = scrollBar.height;
        }
        for (final ScrollBarButton sbb : scrollBar.buttons) {
            sbb.draw(x, y);
        }
    }
    
    @Override
    public void ScrollBarButtonContructor(final ScrollBarButton button, final ScrollBar scrollBar, final Panel panel) {
    }
    
    @Override
    public void ScrollBarButtonMouseClicked(final ScrollBarButton button, final ScrollBar scrollBar, final Panel panel, final int mouseX, final int mouseY, final int mouse) {
        if (mouseX >= scrollBar.x + panel.dragX + button.x && mouseY >= panel.dragY + scrollBar.y + button.y - scrollBar.dragY && mouseX <= panel.dragX + scrollBar.x + button.x + 110.0f && mouseY <= panel.dragY + scrollBar.y + button.y + 12.0f - scrollBar.dragY && mouse == 0) {
            for (final Panel p : Client.getGUI().panels) {
                if (p.name.equalsIgnoreCase(button.name)) {
                    p.setVisible(!p.isVisible());
                }
            }
        }
    }
    
    @Override
    public void ScrollBarButtonDraw(final ScrollBarButton button, final ScrollBar scrollBar, final Panel panel, final float x, final float y) {
        Minecraft.getMinecraft().fontRendererObj.func_175063_a(button.name, button.x + panel.dragX + 4.0f + scrollBar.x, button.y + panel.dragY + 2.0f + scrollBar.y - scrollBar.dragY, -3355444);
        if (x >= panel.x + panel.dragX + scrollBar.x + 1.0f && y >= panel.dragY + panel.y + scrollBar.y + 1.0f && x <= panel.dragX + panel.x + scrollBar.x + 110.0f && y <= panel.dragY + panel.y + scrollBar.y + 170.0f && x >= scrollBar.x + panel.dragX + button.x && y >= panel.dragY + scrollBar.y + button.y - scrollBar.dragY && x <= panel.dragX + scrollBar.x + button.x + 110.0f && y <= panel.dragY + scrollBar.y + button.y + 12.0f - scrollBar.dragY) {
            Minecraft.getMinecraft().fontRendererObj.func_175063_a(button.name, button.x + panel.dragX + 4.0f + scrollBar.x, button.y + panel.dragY + 2.0f + scrollBar.y - scrollBar.dragY, -1);
        }
        if (button.enabled) {
            Minecraft.getMinecraft().fontRendererObj.func_175063_a(button.name, button.x + panel.dragX + 4.0f + scrollBar.x, button.y + panel.dragY + 2.0f + scrollBar.y - scrollBar.dragY, -11416245);
        }
        if (x >= scrollBar.x + panel.dragX + button.x && y >= panel.dragY + scrollBar.y + button.y - scrollBar.dragY && x <= panel.dragX + scrollBar.x + button.x + 110.0f && y <= panel.dragY + scrollBar.y + button.y + 12.0f - scrollBar.dragY && button.enabled) {
            Minecraft.getMinecraft().fontRendererObj.func_175063_a(button.name, button.x + panel.dragX + 4.0f + scrollBar.x, button.y + panel.dragY + 2.0f + scrollBar.y - scrollBar.dragY, -11407507);
        }
        for (final Panel p : Client.getGUI().panels) {
            if (p.name.equalsIgnoreCase(button.name)) {
                if (p.isVisible()) {
                    button.enabled = true;
                }
                else {
                    button.enabled = false;
                }
            }
        }
    }
    
    @Override
    public void SliderContructor(final Slider slider, final Panel panel) {
    }
    
    @Override
    public void SliderMouseClicked(final Slider slider, final Panel panel, final int mouseX, final int mouseY, final int mouse) {
        if (mouseX >= panel.x + panel.dragX + slider.x && mouseY >= panel.dragY + panel.y + slider.y && mouseX <= panel.dragX + panel.x + slider.x + 110.0f && mouseY <= panel.dragY + panel.y + slider.y + 12.0f && mouse == 0) {
            slider.dragging = true;
            slider.lastDragX = mouseX - slider.dragX;
        }
    }
    
    @Override
    public void SliderMouseMovedOrUp(final Slider slider, final Panel panel, final int mouseX, final int mouseY, final int mouse) {
        if (mouse == 0) {
            slider.dragging = false;
        }
    }
    
    @Override
    public void SliderDraw(final Slider slider, final Panel panel, final float x, final float y) {
        final float fraction = slider.dragX / 108.0f;
        final float value = fraction * slider.value.getMaxFloat();
        final DecimalFormat decimal = new DecimalFormat("#.#");
        final float percent = Float.valueOf(decimal.format(value));
        final GuiUtils guiUtils = Nodus.guiUtils;
        GuiUtils.drawGradientRect(slider.x + panel.dragX + panel.x + slider.dragX + 1.0f, slider.y + panel.dragY + panel.y, slider.x + panel.dragX + panel.x + slider.dragX + 2.0f, slider.y + panel.dragY + panel.y + 12.0f, -11416245, -11416245);
        Minecraft.getMinecraft().fontRendererObj.func_175063_a(slider.name, slider.x + panel.dragX + panel.x + 3.0f, slider.y + panel.dragY + panel.y + 2.5f, -6710887);
        Minecraft.getMinecraft().fontRendererObj.func_175063_a(new StringBuilder(String.valueOf(percent)).toString(), slider.x + panel.dragX + panel.x + 108.0f - Minecraft.getMinecraft().fontRendererObj.getStringWidth(new StringBuilder(String.valueOf(percent)).toString()) - 2.0f, slider.y + panel.dragY + panel.y + 2.5f, -6710887);
        if (x >= panel.x + panel.dragX + slider.x && y >= panel.dragY + panel.y + slider.y && x <= panel.dragX + panel.x + slider.x + 108.0f && y <= panel.dragY + panel.y + slider.y + 12.0f) {
            final GuiUtils guiUtils2 = Nodus.guiUtils;
            GuiUtils.drawGradientRect(slider.x + panel.dragX + panel.x + slider.dragX + 1.0f, slider.y + panel.dragY + panel.y, slider.x + panel.dragX + panel.x + slider.dragX + 2.0f, slider.y + panel.dragY + panel.y + 12.0f, -11407507, -11407507);
            Minecraft.getMinecraft().fontRendererObj.func_175063_a(slider.name, slider.x + panel.dragX + panel.x + 3.0f, slider.y + panel.dragY + panel.y + 2.5f, -1);
            Minecraft.getMinecraft().fontRendererObj.func_175063_a(new StringBuilder(String.valueOf(percent)).toString(), slider.x + panel.dragX + panel.x + 108.0f - Minecraft.getMinecraft().fontRendererObj.getStringWidth(new StringBuilder(String.valueOf(percent)).toString()) - 2.0f, slider.y + panel.dragY + panel.y + 2.5f, -1);
        }
        if (slider.dragging) {
            slider.dragX = x - slider.lastDragX;
            slider.value.setFloatValue(value);
            Client.getConfig().saveConfig();
        }
        if (slider.value.getFloatValue() <= slider.value.getMinFloatValue()) {
            slider.value.setFloatValue(slider.value.getMinFloatValue());
        }
        if (slider.value.getFloatValue() >= slider.value.getMaxFloat()) {
            slider.value.setFloatValue(slider.value.getMaxFloat());
        }
        if (slider.dragX <= 0.0f) {
            slider.dragX = 0.0f;
        }
        if (slider.dragX >= 108.0f) {
            slider.dragX = 108.0f;
        }
    }
    
    @Override
    public void mainConstructor(final ClickUI ui) {
    }
}
