/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boletos.boletosapiu.utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.JPanel;
import java.awt.GradientPaint;

/**
 *
 * @author josef
 */
public class RoundedGradientPanelBoletos extends JPanel {
        private Color backgroundColor;
        private int cornerRadius = 15;
        private Color color1 = null;
        private Color color2 = null;        
    
    public RoundedGradientPanelBoletos(int radius, Color c1, Color c2) {
            super();
            cornerRadius = radius;
            this.color1 = c1;
            this.color2 = c2;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            GradientPaint gp = new GradientPaint(0, 0, color1, width, 0, color2);
            
            graphics.setPaint(gp);
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
            //graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
        }  
}
